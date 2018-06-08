package com.etc.bean.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;

import com.etc.bean.dao.OrderBeanDao;
import com.etc.bean.entity.OrderBean;
import com.etc.entity.Goods;
import com.etc.entity.Order;
import com.etc.service.GoodsService;
import com.etc.service.OrderDaoService;
import com.etc.service.impl.GoodsServiceImpl;
import com.etc.service.impl.OrderDaoServiceImpl;
import com.etc.util.DBUtil;

public class OrderBeanDaoImpl implements OrderBeanDao {
	OrderDaoService ods = new OrderDaoServiceImpl();
	GoodsService gs = new GoodsServiceImpl();
	@Override
	public boolean addOrderBean(OrderBean orderBean) {
		//插入需要用事務查詢
		int orderNo = 0;//先生成一個編號
		Connection conn = DBUtil.getConn();
		if( conn == null)
			return false;//獲取連接錯誤,增加失敗
		
		//初始化一個訂單編號.之後表的操作都要對其進行操作
		orderNo = ods.initializeOrderNo(conn);
		orderBean.setORDERNO(orderNo);
		//生成編號錯誤,直接返回下單失敗
		if(orderNo == 0)
			return false;
		Order order = new Order(orderBean.getORDERNO(), orderBean.getSENDER(), orderBean.getSENDERPROVINCEID(), orderBean.getSENDERCITYID(), orderBean.getSENDERCOUNTYID(), orderBean.getSENDERADDRESS(), orderBean.getSENDERMOBILE(), orderBean.getRECEIVER(), orderBean.getRECEIVERPROVINCEID(), orderBean.getRECEIVERCITYID(), orderBean.getRECEIVERCOUNTYID(), orderBean.getRECEIVERADDRESS(), orderBean.getRECEIVERMOBILE());
		Goods goods = new Goods(orderBean.getGOODSTYPE(), orderBean.getGOODSWEIGHT(), orderBean.getGOODSNUMBER(), orderBean.getGOODSPRICE(), orderBean.getORDERNO());
		
		//判斷增加訂單,失敗則下單失敗,回滾記錄
		int addOrderState = ods.addOrder(conn, order);
		//判斷增加物品詳情.失敗則下單失敗.回滾記錄
		int addGoodsState = gs.addGoods(conn, goods);
		if(addOrderState > 0 && addGoodsState > 0) {
			//訂單跟物品詳情表插入成功
			return true;
		}else {
			try {
				conn.rollback();
			} catch (SQLException e) {
				System.out.println("下單失敗.回滾失敗");
			}
		}
		return false;
		
		
		
	}

}

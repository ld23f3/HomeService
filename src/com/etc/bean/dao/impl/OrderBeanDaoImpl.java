package com.etc.bean.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.etc.bean.dao.OrderBeanDao;
import com.etc.bean.entity.OrderBean;
import com.etc.entity.Goods;
import com.etc.entity.Order;
import com.etc.service.GoodsService;
import com.etc.service.OrderDaoService;
import com.etc.service.impl.GoodsServiceImpl;
import com.etc.service.impl.OrderDaoServiceImpl;
import com.etc.util.DBUtil;
import com.etc.util.PageData;

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
	@Override
	public PageData<OrderBean> queryMyOrder(int pageNum,int pageSize,String mobile) {
		String sql = "SELECT O1.ORDERNO,O1.SENDER,p.PROVINCENAME AS SENDERPROVINCENAME,\r\n" + 
				"c.CITYNAME AS SENDERCITYNAME,\r\n" + 
				"co.COUNTYNAME AS SENDERCOUNTYNAME,\r\n" + 
				"O1.SENDERADDRESS,\r\n" + 
				"O1.SENDERMOBILE,O1.RECEIVER,p2.PROVINCENAME AS RECEIVERPROVINCENAME,\r\n" + 
				"c2.CITYNAME AS RECEIVERCITYNAME,\r\n" + 
				"co2.COUNTYNAME AS RECEIVERCOUNTYNAME,\r\n" + 
				"O1.RECEIVERADDRESS,\r\n" + 
				"O1.RECEIVERMOBILE,O1.ORDERDATE,O1.ORDERSTATUS\r\n" + 
				" FROM \"ORDER\" O1  LEFT JOIN PROVINCE p on  SENDERPROVINCEID = p.PROVINCEID\r\n" + 
				"  LEFT JOIN CITY c on  O1.SENDERCITYID = c.CITYID\r\n" + 
				"  LEFT JOIN  COUNTY co on  O1.SENDERCOUNTYID = CO.COUNTYID\r\n" + 
				" LEFT JOIN PROVINCE p2 on RECEIVERPROVINCEID = p2.PROVINCEID\r\n" + 
				"  LEFT JOIN CITY c2 on  O1.RECEIVERCITYID = c2.CITYID\r\n" + 
				"  LEFT JOIN  COUNTY co2 on  O1.RECEIVERCOUNTYID = CO2.COUNTYID\r\n" + 
				"  where O1.SENDERMOBILE = ? or O1.RECEIVERMOBILE = ? ORDER BY O1.ORDERDATE" ;
		@SuppressWarnings("unchecked")
		//List<OrderBean> list =(List<OrderBean>) DBUtil.select(sql, OrderBean.class, mobile,mobile);
		PageData<OrderBean> pd= DBUtil.getOraclePage(sql, pageNum, pageSize, OrderBean.class, mobile,mobile);
		return pd;
	}
	@Override
	public int addOrderBeanReturnNo(OrderBean orderBean) {
		// TODO Auto-generated method stub
		//插入需要用事務查詢
		int orderNo = 0;//先生成一個編號
		Connection conn = DBUtil.getConn();
		if( conn == null)
			return 0;//獲取連接錯誤,增加失敗
		
		//初始化一個訂單編號.之後表的操作都要對其進行操作
		orderNo = ods.initializeOrderNo(conn);
		orderBean.setORDERNO(orderNo);
		//生成編號錯誤,直接返回下單失敗
		if(orderNo == 0)
			return 0;
		Order order = new Order(orderBean.getORDERNO(), orderBean.getSENDER(), orderBean.getSENDERPROVINCEID(), orderBean.getSENDERCITYID(), orderBean.getSENDERCOUNTYID(), orderBean.getSENDERADDRESS(), orderBean.getSENDERMOBILE(), orderBean.getRECEIVER(), orderBean.getRECEIVERPROVINCEID(), orderBean.getRECEIVERCITYID(), orderBean.getRECEIVERCOUNTYID(), orderBean.getRECEIVERADDRESS(), orderBean.getRECEIVERMOBILE());
		Goods goods = new Goods(orderBean.getGOODSTYPE(), orderBean.getGOODSWEIGHT(), orderBean.getGOODSNUMBER(), orderBean.getGOODSPRICE(), orderBean.getORDERNO());
		
		//判斷增加訂單,失敗則下單失敗,回滾記錄
		int addOrderState = ods.addOrder(conn, order);
		//判斷增加物品詳情.失敗則下單失敗.回滾記錄
		int addGoodsState = gs.addGoods(conn, goods);
		if(addOrderState > 0 && addGoodsState > 0) {
			//訂單跟物品詳情表插入成功
			return orderNo;
		}else {
			try {
				conn.rollback();
			} catch (SQLException e) {
				System.out.println("下單失敗.回滾失敗");
			}
		}
		return 0;
	}

}

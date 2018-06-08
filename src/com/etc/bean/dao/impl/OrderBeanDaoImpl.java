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
		//������Ҫ���ղ�ԃ
		int orderNo = 0;//������һ����̖
		Connection conn = DBUtil.getConn();
		if( conn == null)
			return false;//�@ȡ�B���e�`,����ʧ��
		
		//��ʼ��һ��ӆ�ξ�̖.֮���Ĳ�����Ҫ�����M�в���
		orderNo = ods.initializeOrderNo(conn);
		orderBean.setORDERNO(orderNo);
		//���ɾ�̖�e�`,ֱ�ӷ�����ʧ��
		if(orderNo == 0)
			return false;
		Order order = new Order(orderBean.getORDERNO(), orderBean.getSENDER(), orderBean.getSENDERPROVINCEID(), orderBean.getSENDERCITYID(), orderBean.getSENDERCOUNTYID(), orderBean.getSENDERADDRESS(), orderBean.getSENDERMOBILE(), orderBean.getRECEIVER(), orderBean.getRECEIVERPROVINCEID(), orderBean.getRECEIVERCITYID(), orderBean.getRECEIVERCOUNTYID(), orderBean.getRECEIVERADDRESS(), orderBean.getRECEIVERMOBILE());
		Goods goods = new Goods(orderBean.getGOODSTYPE(), orderBean.getGOODSWEIGHT(), orderBean.getGOODSNUMBER(), orderBean.getGOODSPRICE(), orderBean.getORDERNO());
		
		//�Д�����ӆ��,ʧ���t��ʧ��,�؝Lӛ�
		int addOrderState = ods.addOrder(conn, order);
		//�Д�������ƷԔ��.ʧ���t��ʧ��.�؝Lӛ�
		int addGoodsState = gs.addGoods(conn, goods);
		if(addOrderState > 0 && addGoodsState > 0) {
			//ӆ�θ���ƷԔ������ɹ�
			return true;
		}else {
			try {
				conn.rollback();
			} catch (SQLException e) {
				System.out.println("��ʧ��.�؝Lʧ��");
			}
		}
		return false;
		
		
		
	}

}

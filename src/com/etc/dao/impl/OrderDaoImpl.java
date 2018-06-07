package com.etc.dao.impl;

import java.sql.Connection;

import com.etc.dao.OrderDao;
import com.etc.entity.Order;
import com.etc.util.DBUtil;

/**
 * ������.�ѵ�=>ÿ������һ�Ŷ���.����Ҫ����Ʒ�����������и��²�����Ҫ�õ�������ʡ� (���:������Connection��
 * initializeOrderNo �� addOrder �Լ�֮�������/��Ʒ������add������)
 * 
 * @author Administrator
 *
 */
public class OrderDaoImpl implements OrderDao {

	@Override
	public int initializeOrderNo(Connection conn) {
		String sql = "SELECT ORDER_SEQ.nextval FROM dual";
		Object get = DBUtil.getFirst(sql, conn);
		if (get == null)
			return 0;
		int num = Integer.parseInt(get.toString());
		return num + 20180000;
	}

	@Override
	public int addOrder(Connection conn, Order order) {
		String sql = "INSERT INTO \"ORDER\" values(?,?,?,?,?,?,?,?,?,?,?,?,?,SYSDATE,0,null)";
		return DBUtil.execute(sql, conn, order.getORDERNO(), order.getSENDER(), order.getSENDERPROVINCEID(),
				order.getSENDERCITYID(), order.getSENDERCITYID(), order.getSENDERADDRESS(), order.getSENDERMOBILE(),
				order.getRECEIVER(), order.getRECEIVERPROVINCEID(), order.getRECEIVERCITYID(),
				order.getRECEIVERCOUNTYID(), order.getRECEIVERADDRESS(), order.getRECEIVERMOBILE());
	}

	@Override
	public boolean updateOrder(Connection conn,Order order) {
		return false;
	}

	@Override
	public boolean updateOrder(Order order) {
		
		return false;
	}

}

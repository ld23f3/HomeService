package com.etc.dao.impl;

import java.sql.Connection;

import com.etc.dao.OrderDao;
import com.etc.entity.Order;
import com.etc.util.DBUtil;
import com.etc.util.PageData;

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
	public boolean updateOrder(Connection conn, Order order) {
		return false;
	}

	@Override
	public boolean updateOrder(Order order) {
		String sql = "UPDATE \"ORDER\" SET SENDER = ?,SENDERPROVINCEID = ?,SENDERCITYID = ?,SENDERCOUNTYID = ?,SENDERADDRESS = ?,SENDERMOBILE = ?,RECEIVER = ?,RECEIVERPROVINCEID = ?,RECEIVERCITYID = ?,RECEIVERCOUNTYID = ?,RECEIVERADDRESS = ?,RECEIVERMOBILE = ?,ORDERSTATUS = ?,ORDERRMODIFIED = SYSDATE\r\n"
				+ "where ORDERNO = ?";
		return DBUtil.execute(sql, order.getSENDER(), order.getSENDERPROVINCEID(), order.getSENDERCITYID(),
				order.getSENDERCOUNTYID(), order.getSENDERADDRESS(), order.getSENDERMOBILE(), order.getRECEIVER(),
				order.getRECEIVERPROVINCEID(), order.getRECEIVERCITYID(), order.getRECEIVERCOUNTYID(),
				order.getRECEIVERADDRESS(), order.getRECEIVERMOBILE(), order.getORDERSTATUS(), order.getORDERNO()) > 0;
	}

	@Override
	public PageData<Order> queryAllOrderByPage(int pageNum, int pageSize, String queryLike) {
		String sql = "select * from \"ORDER\" where  sender like ? or senderaddress like ? or sendermobile = ? or RECEIVER like ? or RECEIVERADDRESS like ? or  RECEIVERMOBILE = ?";

		return DBUtil.getOraclePage(sql, pageNum, pageSize, Order.class, "%" + queryLike + "%", "%" + queryLike + "%", "%" + queryLike + "%", "%" + queryLike + "%", "%" + queryLike + "%", "%" + queryLike + "%");
	}

	@Override
	public PageData<Order> queryOrderByCourieridPage(int countyId, int pageNum, int pageSize, String queryLike) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PageData<Order> queryOrderByCourieridPage(int countyId, int pageNum, int pageSize, int status,
			String queryLike) {
		// TODO Auto-generated method stub
		return null;
	}

}

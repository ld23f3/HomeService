package com.etc.service.impl;

import java.sql.Connection;

import com.etc.dao.OrderDao;
import com.etc.dao.impl.OrderDaoImpl;
import com.etc.entity.Order;
import com.etc.service.OrderDaoService;
import com.etc.util.PageData;

public class OrderDaoServiceImpl implements OrderDaoService {
	OrderDao od = new OrderDaoImpl();

	@Override
	public int initializeOrderNo(Connection conn) {
		return od.initializeOrderNo(conn);
	}

	@Override
	public int addOrder(Connection conn, Order order) {
		return od.addOrder(conn, order);
	}

	@Override
	public boolean updateOrder(Order order) {
		return od.updateOrder(order);
	}

	@Override
	public boolean updateOrder(Connection conn, Order order) {
		return od.updateOrder(conn, order);
	}

	@Override
	public PageData<Order> getAllOrderByPage(int pageNum, int pageSize, String queryLike) {
		return od.queryAllOrderByPage(pageNum, pageSize, queryLike);
	}

	@Override
	public PageData<Order> getMyOrderByPage(int countyId, int pageNum, int pageSize, String queryLike) {
		return od.queryOrderByCourieridPage(countyId, pageNum, pageSize, queryLike);
	}

	@Override
	public PageData<Order> getMyOrderByPage(int countyId, int pageNum, int pageSize, int status, String queryLike) {
		return od.queryOrderByCourieridPage(countyId, pageNum, pageSize, status, queryLike);
	}

	
	@Override
	public boolean deleteOrderNO(int orderNo) {
		// TODO Auto-generated method stub
		return od.deleteOrderNO(orderNo);
	}
	
}

package com.etc.service.impl;

import com.etc.entity.Order;
import com.etc.service.OrderDaoService;

public class OrderDaoServiceImpl implements OrderDaoService {
	OrderDaoService ods = new OrderDaoServiceImpl();
	@Override
	public boolean addOrder(Order order) {
		return ods.addOrder(order);
	}

	@Override
	public boolean updateOrder(Order order) {
		return ods.updateOrder(order);
	}
	
}

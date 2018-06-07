package com.etc.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.etc.dao.OrderDao;
import com.etc.dao.impl.OrderDaoImpl;
import com.etc.entity.Order;
import com.etc.service.OrderDaoService;

public class OrderDaoServiceImpl implements OrderDaoService {
	OrderDao od = new OrderDaoImpl();

	@Override
	public boolean addOrder(Order order) {
		return false;
//		return od.addOrder(order) > 0;
	}

	@Override
	public boolean updateOrder(Order order) {
		return od.updateOrder(order);
	}

	@Override
	public List<Order> queryAllOrderByCourierId(int CourierId) {
		List<Order> list = new ArrayList<Order>();
		for (int i = 0; i < 10; i++) {
			Order o = new Order(i, "������" + i, 2, 230, 2300, "dz", "�ֻ�", "�ռ���", 3, 33, 333, "�ռ��˵�ַ", "345577", "��������", 0,
					"�޸�ʱ��");
			list.add(o);

		}
		return list;
	}

}

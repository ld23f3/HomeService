package com.etc.service;

import java.util.List;

import com.etc.entity.Order;

public interface OrderDaoService {
	/**
	 * �����¶���(�����Ҫ��ȡ���������,���ܶ������ӱ�������Ӳ���)
	 * ͬʱ������Ҫ����.��Ʒ����(������Ϣ������еĻ�)
	 * �����Ҫ�õ��������������
	 * @param order
	 * @return
	 */
	public boolean addOrder(Order order);
	/**
	 * ���¶�����Ϣ(���ݶ���������Ӷ���)
	 * @param order
	 * @return
	 */
	public boolean updateOrder(Order order);
	/**
	 * ���ݿ��Ա��ID��ѯ�ÿ��Ա���еĶ���
	 * @param CourierId
	 * @return
	 */
	public List<Order> queryAllOrderByCourierId(int CourierId);
}

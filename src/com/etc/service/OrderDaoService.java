package com.etc.service;

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
}

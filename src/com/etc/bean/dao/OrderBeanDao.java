package com.etc.bean.dao;

import com.etc.bean.entity.OrderBean;

public interface OrderBeanDao {
	/**
	 * �û��������µ�����
	 * @param orderBean
	 * @return
	 */
	public boolean addOrderBean(OrderBean orderBean);
	/**
	 * ��ȷƥ���ֻ������ѯ������Ϣ
	 * @param mobile
	 * @return
	 */
	public OrderBean queryMyOrder(String mobile);
	
}

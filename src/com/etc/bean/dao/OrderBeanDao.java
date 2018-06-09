package com.etc.bean.dao;

import com.etc.bean.entity.OrderBean;

public interface OrderBeanDao {
	/**
	 * 用户完整的下单功能
	 * @param orderBean
	 * @return
	 */
	public boolean addOrderBean(OrderBean orderBean);
	/**
	 * 精确匹配手机号码查询订单信息
	 * @param mobile
	 * @return
	 */
	public OrderBean queryMyOrder(String mobile);
	
}

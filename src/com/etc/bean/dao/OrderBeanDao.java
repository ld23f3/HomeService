package com.etc.bean.dao;

import com.etc.bean.entity.OrderBean;
import com.etc.util.PageData;

public interface OrderBeanDao {
	/**
	 * 用户完整的下单功能
	 * @param orderBean
	 * @return
	 */
	public boolean addOrderBean(OrderBean orderBean);
	/**
	 * 精确匹配手机号码,分页查询出相关订单信息
	 * @param pageNum 查询第几页
	 * @param pageSize 每页显示数量
	 * @param mobile 匹配的手机号码
	 * @return
	 */
	public PageData<OrderBean> queryMyOrder(int pageNum,int pageSize,String mobile);
	
}

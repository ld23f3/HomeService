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
	 * 用户完整的下单功能  返回訂單編號
	 * @param orderBean
	 * @return
	 */
	public int addOrderBeanReturnNo(OrderBean orderBean);
	
	
	/**
	 * 精确匹配手机号码,分页查询出相关订单信息
	 * @param pageNum 查询第几页
	 * @param pageSize 每页显示数量
	 * @param mobile 匹配的手机号码
	 * @return
	 */
	public PageData<OrderBean> queryMyOrder(int pageNum,int pageSize,String mobile);
	/**
	 * 根据订单编号,查询指定的订单信息
	 * @param orderNo
	 * @return
	 */
	public OrderBean queryMyOrderById(int orderNo);
	
}

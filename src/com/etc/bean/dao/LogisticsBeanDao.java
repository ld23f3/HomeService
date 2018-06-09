package com.etc.bean.dao;

import java.util.List;

import com.etc.bean.entity.LogisticsBean;
import com.etc.entity.Order;

public interface LogisticsBeanDao {
	/**
	 * 设置运送路线.
	 * 每次下单的时候就初始化出一条运送路线。
	 * 将所有的运送信息都存入到数据库中.
	 * @param order
	 */
	public void setTruckRouting(Order order);
	/**
	 * 根据订单号，查找物流信息
	 * @param ORDERNO
	 * @return
	 */
	public List<LogisticsBean> queryTruckRoutingByOrderNo(int orderNo);
	
}

package com.etc.dao;

import com.etc.entity.Order;

public interface OrderDao {
	/**
	 * 增加新订单(这个是要获取到订单编号,才能对其他从表进行增加操作)
	 * 同时增加需要包括.物品详情(物流信息表如果有的话)
	 * 这边需要用到事务操作。。。
	 * @param order
	 * @return
	 */
	public boolean addOrder(Order order);
	/**
	 * 更新订单信息(根据订单编号增加订单)
	 * @param order
	 * @return
	 */
	public boolean updateOrder(Order order);
	
}

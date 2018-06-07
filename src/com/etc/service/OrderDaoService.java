package com.etc.service;

import java.sql.Connection;
import java.util.List;

import com.etc.entity.Order;
import com.etc.util.PageData;

public interface OrderDaoService {
	/**
	 * 初始化订单编号.20180000 + 序列号.美化订单显示
	 * (事务操作,每次生成新订单,先初始化一个订单编号)
	 * @return 成功返回以2018开头的订单号.失败返回0
	 */
	public int initializeOrderNo(Connection conn);
	/**
	 * 增加新订单(这个是要获取到订单编号,才能对其他从表进行增加操作)
	 * 同时增加需要包括.物品详情(物流信息表如果有的话)
	 * 这边需要用到事务操作。。。
	 * @param order
	 * @return 失败返回-1,0操作失败(不知道怎么失败的).>0成功
	 */
	public int addOrder(Connection conn,Order order);
	/**
	 * 更新订单信息(根据订单编号修改订单信息.不使用事务访问.)
	 * 这个方法基本用来直接修改收件揽件状态的.单纯对订单表的操作
	 * @param order
	 * @return
	 */
	public boolean updateOrder(Order order);
	/**
	 * 更新订单信息
	 * (根据订单编号修改订单详情.包括收件人啦。货物信息啦。之类的。)
	 * (暂时不做。有需要再扩展)
	 * @param order
	 * @return
	 */
	public boolean updateOrder(Connection conn,Order order);
	/**
	 * 分页模糊查询所有的订单
	 * @param pageNum 查询返回第几页
	 * @param pageSize 每页返回的长度
	 * @param queryLike 模糊查询的关键字
	 * @return
	 */
	public PageData<Order> getAllOrderByPage(int pageNum,int pageSize,String queryLike);
	/**
	 * 分页模糊查询指定快递员的所有订单
	 * @param countyId 快递员的区域ID
	 * @param pageNum 查询返回第几页 
	 * @param pageSize 每页返回的长度
	 * @param queryLike 模糊查询的关键字
	 * @return
	 */
	public PageData<Order> getMyOrderByPage(int countyId, int pageNum,int pageSize,String queryLike);
	/**
	 * 分页模糊查询指定快递员的指定状态的订单
	 * @param countyId 快递员的区域ID
	 * @param pageNum 查询返回第几页 
	 * @param pageSize 每页返回的长度
	 * @param status 揽件/签收 状态
	 * @param queryLike 模糊查询的关键字
	 * @return
	 */
	public PageData<Order> getMyOrderByPage(int countyId, int pageNum,int pageSize,int status, String queryLike);

}

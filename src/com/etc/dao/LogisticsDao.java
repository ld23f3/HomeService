package com.etc.dao;

import java.sql.Connection;
import java.util.List;

import com.etc.entity.Logistics;

public interface LogisticsDao {
	/**
	 * 新增一条物流信息
	 * @param logistics
	 * @return
	 */
	public boolean addLogistics(Logistics logistics);
	/**
	 * 新增一条物流信息(事务查询使用)
	 * @param conn 
	 * @param logistics
	 * @return
	 */
	public boolean addLogistics(Connection conn, Logistics logistics);
	/**
	 * 根据订单编号查询物流信息(弃用)
	 * @return
	 */
	public List<Logistics> queryLogisticsByOrderNo(int orderNo);
	/**
	 * 根据订单编号更新物流信息
	 * @param orderNo
	 * @return
	 */
	public boolean updateLogisticsByOrderNo(int orderNo);
}

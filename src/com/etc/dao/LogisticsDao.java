package com.etc.dao;

import java.sql.Connection;
import java.util.List;

import com.etc.entity.Logistics;

public interface LogisticsDao {
	/**
	 * ����һ��������Ϣ
	 * @param logistics
	 * @return
	 */
	public boolean addLogistics(Logistics logistics);
	/**
	 * ����һ��������Ϣ(�����ѯʹ��)
	 * @param conn 
	 * @param logistics
	 * @return
	 */
	public boolean addLogistics(Connection conn, Logistics logistics);
	/**
	 * ���ݶ�����Ų�ѯ������Ϣ(����)
	 * @return
	 */
	public List<Logistics> queryLogisticsByOrderNo(int orderNo);
	/**
	 * ���ݶ�����Ÿ���������Ϣ
	 * @param orderNo
	 * @return
	 */
	public boolean updateLogisticsByOrderNo(int orderNo);
}

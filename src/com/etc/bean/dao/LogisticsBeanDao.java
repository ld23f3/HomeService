package com.etc.bean.dao;

import java.util.List;

import com.etc.bean.entity.LogisticsBean;
import com.etc.entity.Order;

public interface LogisticsBeanDao {
	/**
	 * ��������·��.
	 * ÿ���µ���ʱ��ͳ�ʼ����һ������·�ߡ�
	 * �����е�������Ϣ�����뵽���ݿ���.
	 * @param order
	 */
	public void setTruckRouting(Order order);
	/**
	 * ���ݶ����ţ�����������Ϣ
	 * @param ORDERNO
	 * @return
	 */
	public List<LogisticsBean> queryTruckRoutingByOrderNo(int orderNo);
	
}

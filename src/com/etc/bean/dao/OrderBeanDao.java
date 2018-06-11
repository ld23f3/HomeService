package com.etc.bean.dao;

import com.etc.bean.entity.OrderBean;
import com.etc.util.PageData;

public interface OrderBeanDao {
	/**
	 * �û��������µ�����
	 * @param orderBean
	 * @return
	 */
	public boolean addOrderBean(OrderBean orderBean);
	
	/**
	 * �û��������µ�����  ����ӆ�ξ�̖
	 * @param orderBean
	 * @return
	 */
	public int addOrderBeanReturnNo(OrderBean orderBean);
	
	
	/**
	 * ��ȷƥ���ֻ�����,��ҳ��ѯ����ض�����Ϣ
	 * @param pageNum ��ѯ�ڼ�ҳ
	 * @param pageSize ÿҳ��ʾ����
	 * @param mobile ƥ����ֻ�����
	 * @return
	 */
	public PageData<OrderBean> queryMyOrder(int pageNum,int pageSize,String mobile);
	/**
	 * ���ݶ������,��ѯָ���Ķ�����Ϣ
	 * @param orderNo
	 * @return
	 */
	public OrderBean queryMyOrderById(int orderNo);
	
}

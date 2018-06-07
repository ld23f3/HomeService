package com.etc.service;

import java.sql.Connection;
import java.util.List;

import com.etc.entity.Order;
import com.etc.util.PageData;

public interface OrderDaoService {
	/**
	 * ��ʼ���������.20180000 + ���к�.����������ʾ
	 * (�������,ÿ�������¶���,�ȳ�ʼ��һ���������)
	 * @return �ɹ�������2018��ͷ�Ķ�����.ʧ�ܷ���0
	 */
	public int initializeOrderNo(Connection conn);
	/**
	 * �����¶���(�����Ҫ��ȡ���������,���ܶ������ӱ�������Ӳ���)
	 * ͬʱ������Ҫ����.��Ʒ����(������Ϣ������еĻ�)
	 * �����Ҫ�õ��������������
	 * @param order
	 * @return ʧ�ܷ���-1,0����ʧ��(��֪����ôʧ�ܵ�).>0�ɹ�
	 */
	public int addOrder(Connection conn,Order order);
	/**
	 * ���¶�����Ϣ(���ݶ�������޸Ķ�����Ϣ.��ʹ���������.)
	 * ���������������ֱ���޸��ռ�����״̬��.�����Զ�����Ĳ���
	 * @param order
	 * @return
	 */
	public boolean updateOrder(Order order);
	/**
	 * ���¶�����Ϣ
	 * (���ݶ�������޸Ķ�������.�����ռ�������������Ϣ����֮��ġ�)
	 * (��ʱ����������Ҫ����չ)
	 * @param order
	 * @return
	 */
	public boolean updateOrder(Connection conn,Order order);
	/**
	 * ��ҳģ����ѯ���еĶ���
	 * @param pageNum ��ѯ���صڼ�ҳ
	 * @param pageSize ÿҳ���صĳ���
	 * @param queryLike ģ����ѯ�Ĺؼ���
	 * @return
	 */
	public PageData<Order> getAllOrderByPage(int pageNum,int pageSize,String queryLike);
	/**
	 * ��ҳģ����ѯָ�����Ա�����ж���
	 * @param countyId ���Ա������ID
	 * @param pageNum ��ѯ���صڼ�ҳ 
	 * @param pageSize ÿҳ���صĳ���
	 * @param queryLike ģ����ѯ�Ĺؼ���
	 * @return
	 */
	public PageData<Order> getMyOrderByPage(int countyId, int pageNum,int pageSize,String queryLike);
	/**
	 * ��ҳģ����ѯָ�����Ա��ָ��״̬�Ķ���
	 * @param countyId ���Ա������ID
	 * @param pageNum ��ѯ���صڼ�ҳ 
	 * @param pageSize ÿҳ���صĳ���
	 * @param status ����/ǩ�� ״̬
	 * @param queryLike ģ����ѯ�Ĺؼ���
	 * @return
	 */
	public PageData<Order> getMyOrderByPage(int countyId, int pageNum,int pageSize,int status, String queryLike);

}

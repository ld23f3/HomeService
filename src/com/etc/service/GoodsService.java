package com.etc.service;

import java.sql.Connection;

import com.etc.entity.Goods;

public interface GoodsService {
	/**
	 * ����һ���¶�������Ʒ���顣��ߵĶ��������Ҫ�Ӷ�����������ʱ���Զ����ɵĶ����š�
	 * ���L��,���ʧ����Ԓ,��Ҫ��֮ǰ�����ӆ�ε���Ϣ�M�л؝L
	 * @return ʧ�ܷ���-1,0����ʧ��.>0�ɹ�
	 */
	public int addGoods(Connection conn,Goods goods);
	/**
	 * ���¶�������Ʒ������Ϣ.
	 * @return
	 */
	public boolean updateGoods(Goods goods);
	/**
	 * ����ӆ�ξ�̖,��ԃԓӆ�ε���ƷԔ��.
	 * �푪ԓ��Ψһ�s�������Cӆ�α��У�ÿһ��ӆ�ξ�ֻ̖����һ����ƷԔ����Ϣ
	 * @param orderNo
	 * @return
	 */
	public Goods queryGoodsInfo(int orderNo);
	 
}

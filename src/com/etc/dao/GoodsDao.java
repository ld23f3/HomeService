package com.etc.dao;

import com.etc.entity.Goods;

public interface GoodsDao {
	/**
	 * ����һ���¶�������Ʒ���顣��ߵĶ��������Ҫ�Ӷ�����������ʱ���Զ����ɵĶ����š�
	 * @return
	 */
	public boolean addGoods(Goods goods);
	/**
	 * ���¶�������Ʒ������Ϣ.
	 * @return
	 */
	public boolean updateGoods(Goods goods);
	
}

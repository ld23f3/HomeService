package com.etc.service;

import com.etc.entity.Goods;

public interface GoodsService {
	/**
	 * 增加一个新订单的物品详情。这边的订单编号需要从订单表新增的时候自动生成的订单号。
	 * @return
	 */
	public boolean addGoods(Goods goods);
	/**
	 * 更新订单的物品详情信息.
	 * @return
	 */
	public boolean updateGoods(Goods goods);
	 
}

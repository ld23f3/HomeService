package com.etc.service.impl;

import com.etc.dao.GoodsDao;
import com.etc.dao.impl.GoodsDaoImpl;
import com.etc.entity.Goods;
import com.etc.service.GoodsService;

public class GoodsServiceImpl implements GoodsService {
	GoodsDao gd = new GoodsDaoImpl();
	@Override
	public boolean addGoods(Goods goods) {
		return gd.addGoods(goods);
	}

	@Override
	public boolean updateGoods(Goods goods) {
		return gd.updateGoods(goods);
	}
	
}

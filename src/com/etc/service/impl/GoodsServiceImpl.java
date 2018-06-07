package com.etc.service.impl;

import java.sql.Connection;

import com.etc.dao.GoodsDao;
import com.etc.dao.impl.GoodsDaoImpl;
import com.etc.entity.Goods;
import com.etc.service.GoodsService;

public class GoodsServiceImpl implements GoodsService {
	GoodsDao gd = new GoodsDaoImpl();

	@Override
	public int addGoods(Connection conn, Goods goods) {
		return gd.addGoods(conn, goods);
	}

	@Override
	public boolean updateGoods(Goods goods) {
		return gd.updateGoods(goods);
	}

	@Override
	public Goods queryGoodsInfo(int orderNo) {
		return gd.queryGoodsInfo(orderNo);
	}
	
}

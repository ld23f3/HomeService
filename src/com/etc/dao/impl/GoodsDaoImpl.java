package com.etc.dao.impl;

import java.sql.Connection;
import java.util.List;

import com.etc.dao.GoodsDao;
import com.etc.entity.Goods;
import com.etc.util.DBUtil;

public class GoodsDaoImpl implements GoodsDao {

	@Override
	public boolean updateGoods(Goods goods) {
		String sql = "update goods set goodstype = ?,goodsweight =? ,goodsnumber =?,goodsprice = ?,goodsrmodified = sysdate where goodsno =?";
		return DBUtil.execute(sql, goods.getGOODSTYPE(), goods.getGOODSWEIGHT(), goods.getGOODSNUMBER(),
				goods.getGOODSPRICE(), goods.getGOODSNO()) > 0;
	}

	@Override
	public int addGoods(Connection conn, Goods goods) {
		String sql = "INSERT INTO GOODS VALUES (GOODS_SEQ.nextval,?,?,?,?,?,SYSDATE ,null)";
		return DBUtil.execute(sql, conn, goods.getGOODSTYPE(), goods.getGOODSWEIGHT(), goods.getGOODSNUMBER(),
				goods.getGOODSPRICE(), goods.getORDERNO());
	}

	@Override
	public Goods queryGoodsInfo(int orderNo) {
		String sql = "SELECT * FROM GOODS where ORDERNO = ?";
		@SuppressWarnings("unchecked")
		List<Goods> list = (List<Goods>) DBUtil.select(sql, Goods.class, orderNo);
		if (list.size() > 0)
			return list.get(0);
		return null;
	}

}

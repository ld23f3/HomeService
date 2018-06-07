package com.etc.service;

import java.sql.Connection;

import com.etc.entity.Goods;

public interface GoodsService {
	/**
	 * 增加一个新订单的物品详情。这边的订单编号需要从订单表新增的时候自动生成的订单号。
	 * 事務訪問,如果失敗的話,需要對之前插入的訂單的信息進行回滾
	 * @return 失败返回-1,0操作失败.>0成功
	 */
	public int addGoods(Connection conn,Goods goods);
	/**
	 * 更新订单的物品详情信息.
	 * @return
	 */
	public boolean updateGoods(Goods goods);
	/**
	 * 根據訂單編號,查詢該訂單的物品詳情.
	 * 表應該有唯一約束。保證訂單表中，每一個訂單編號只對應一個物品詳情信息
	 * @param orderNo
	 * @return
	 */
	public Goods queryGoodsInfo(int orderNo);
	 
}

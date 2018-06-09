package com.etc.bean.dao.impl;

import java.util.List;

import com.etc.bean.dao.LogisticsBeanDao;
import com.etc.bean.entity.LogisticsBean;
import com.etc.entity.Courier;
import com.etc.entity.Order;

public class LogisticsBeanDaoImpl implements LogisticsBeanDao {

	@Override
	public boolean setTruckRouting(Order order) {
		//S区域等待揽件-S县-S市-R市-S县-S区域XXX手中
		//员工生成编号的规则为区域编号*10000+序列号
//		Courier courier =
		
		
		
		System.out.println(order.getRECEIVERPROVINCEID());
		
		return false;
	}

	@Override
	public List<LogisticsBean> queryTruckRoutingByOrderNo(int orderNo) {
		// TODO Auto-generated method stub
		return null;
	}


}

package com.etc.bean.dao.impl;

import java.util.List;

import com.etc.bean.dao.LogisticsBeanDao;
import com.etc.bean.entity.LogisticsBean;
import com.etc.entity.Courier;
import com.etc.entity.Order;

public class LogisticsBeanDaoImpl implements LogisticsBeanDao {

	@Override
	public boolean setTruckRouting(Order order) {
		//S����ȴ�����-S��-S��-R��-S��-S����XXX����
		//Ա�����ɱ�ŵĹ���Ϊ������*10000+���к�
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

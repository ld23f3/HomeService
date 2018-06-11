package com.etc.service.impl;

import java.sql.Connection;
import java.util.List;

import com.etc.dao.LogisticsDao;
import com.etc.dao.impl.LogisticsDaoImpl;
import com.etc.entity.Logistics;
import com.etc.service.LogisticsService;

public class LogisticsServiceImpl implements LogisticsService {
	LogisticsDao ld = new LogisticsDaoImpl();

	@Override
	public boolean addLogistics(Logistics logistics) {
		return ld.addLogistics(logistics);
	}

	@Override
	public boolean addLogistics(Connection conn, Logistics logistics) {
		return ld.addLogistics(conn, logistics);
	}

	@Override
	public List<Logistics> queryLogisticsByOrderNo(int orderNo) {
		return ld.queryLogisticsByOrderNo(orderNo);
	}

	@Override
	public boolean updateLogisticsByOrderNo(int orderNo) {
		return ld.updateLogisticsByOrderNo(orderNo);
	}

}

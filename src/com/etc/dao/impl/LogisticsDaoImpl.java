package com.etc.dao.impl;

import java.sql.Connection;
import java.util.List;

import com.etc.dao.LogisticsDao;
import com.etc.entity.Logistics;
import com.etc.util.DBUtil;

@SuppressWarnings("unchecked")
public class LogisticsDaoImpl implements LogisticsDao {

	@Override
	public List<Logistics> queryLogisticsByOrderNo(int orderNo) {
		String sql = "select * from LOGISTICS WHERE ORDERNO = ?";
		return (List<Logistics>) DBUtil.select(sql, Logistics.class, orderNo);
	}

	@Override
	public boolean addLogistics(Logistics logistics) {
		String sql = "INSERT INTO LOGISTICS VALUES(LOGISTICS_SEQ.nextval,?,?,?,?,?,sysdate)";
		return DBUtil.execute(sql, logistics.getORDERNO(), logistics.getPROVINCEID(), logistics.getCITYID(),
				logistics.getCOUNTYID(), logistics.getDETAILADDRESS()) > 0;
	}

	@Override
	public boolean addLogistics(Connection conn, Logistics logistics) {
		String sql = "INSERT INTO LOGISTICS VALUES(LOGISTICS_SEQ.nextval,?,?,?,?,?,sysdate)";
		return DBUtil.execute(sql, conn, logistics.getORDERNO(), logistics.getPROVINCEID(), logistics.getCITYID(),
				logistics.getCOUNTYID(), logistics.getDETAILADDRESS()) > 0;
	}

}

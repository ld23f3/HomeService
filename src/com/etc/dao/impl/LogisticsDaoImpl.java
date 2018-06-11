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
		String sql = "INSERT INTO LOGISTICS VALUES(LOGISTICS_SEQ.nextval,?,?,?,?,?,sysdate,0)";
		return DBUtil.execute(sql, logistics.getORDERNO(), logistics.getPROVINCEID(), logistics.getCITYID(),
				logistics.getCOUNTYID(), logistics.getDETAILADDRESS()) > 0;
	}

	@Override
	public boolean addLogistics(Connection conn, Logistics logistics) {
		String sql = "INSERT INTO LOGISTICS VALUES(LOGISTICS_SEQ.nextval,?,?,?,?,?,sysdate,0)";
		return DBUtil.execute(sql, conn, logistics.getORDERNO(), logistics.getPROVINCEID(), logistics.getCITYID(),
				logistics.getCOUNTYID(), logistics.getDETAILADDRESS()) > 0;
	}

	@Override
	public boolean updateLogisticsByOrderNo(int orderNo) {
		String sql = "UPDATE LOGISTICS SET CREATEDATE = SYSDATE ,SENDSTATE = 1\r\n" + 
				"WHERE LOGISTICSNO = (SELECT (min (LOGISTICSNO)) from LOGISTICS where ORDERNO = ? and SENDSTATE = 0)\r\n" + 
				"or ORDERNO = ? and countyid = 0 and SENDSTATE = 0 ";
		return DBUtil.execute(sql, orderNo,orderNo) > 0;
	}

}

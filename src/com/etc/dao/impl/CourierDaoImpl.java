package com.etc.dao.impl;

import java.util.List;

import com.etc.dao.CourierDao;
import com.etc.entity.Courier;
import com.etc.util.DBUtil;

@SuppressWarnings("unchecked")
public class CourierDaoImpl implements CourierDao {
	@Override
	public Courier checkAccountPwd(String account, String pwd) {
		String sql = "select * FROM courier where (COURIERNO = ? or COURIERTEL = ?) and COURIERPWD = ?  and COURIERSTATUS = 0";
		List<Courier> list = (List<Courier>) DBUtil.select(sql, Courier.class, account, account, pwd);
		if (list.size() > 0)
			return list.get(0);
		return null;
	}

	@Override
	public boolean addCourier(Courier courier) {
		String sql = "INSERT INTO COURIER VALUES(COURIER_SEQ.nextval,?,?,?,?,1,SYSDATE,SYSDATE)";
		return DBUtil.execute(sql, courier.getCOURIERREGION(), courier.getCOURIERNAME(), courier.getCOURIERPWD(),
				courier.getCOURIERTEL()) > 0;
	}

	@Override
	public boolean updateAccountPwd(String account, String oldPwd, String newPwd) {
		// 新密码 工号 电话号码 原密码
		String sql = "update COURIER SET COURIERPWD = ? where (COURIERNO = ? or COURIERTEL = ?) and COURIERPWD = ?";
		return DBUtil.execute(sql, newPwd, account, account, oldPwd) > 0;
	}

	@Override
	public List<Courier> queryAllCourier() {
		String sql = "select * FROM courier";
		return (List<Courier>) DBUtil.select(sql, Courier.class);
	}

}

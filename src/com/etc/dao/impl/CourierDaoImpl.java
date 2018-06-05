package com.etc.dao.impl;

import java.util.List;

import com.etc.dao.CourierDao;
import com.etc.entity.Courier;
import com.etc.util.DBUtil;

public class CourierDaoImpl implements CourierDao {

	@Override
	public Courier checkAccountPwd(String account, String pwd) {
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
		return false;
	}

	@Override
	public List<Courier> queryAllCourier() {
		// TODO Auto-generated method stub
		return null;
	}

}

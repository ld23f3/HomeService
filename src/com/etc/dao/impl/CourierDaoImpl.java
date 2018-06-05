package com.etc.dao.impl;

import com.etc.dao.CourierDao;
import com.etc.entity.Courier;

public class CourierDaoImpl implements CourierDao {

	@Override
	public Courier checkAccountPwd(String account, String pwd) {
		return null;
	}
	
	@Override
	public boolean addCourier(Courier courier) {
		return false;
	}

	@Override
	public boolean updateAccountPwd(String account, String oldPwd, String newPwd) {
		return false;
	}

}

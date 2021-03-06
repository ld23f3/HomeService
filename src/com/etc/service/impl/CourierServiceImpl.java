package com.etc.service.impl;

import java.util.List;

import com.etc.dao.CourierDao;
import com.etc.dao.impl.CourierDaoImpl;
import com.etc.entity.Courier;
import com.etc.service.CourierService;
import com.etc.util.PageData;

public class CourierServiceImpl implements CourierService {
	CourierDao cd = new CourierDaoImpl();

	@Override
	public boolean register(Courier courier) {
		return cd.addCourier(courier);
	}

	@Override
	public Courier login(String account, String pwd) {
		
		return cd.checkAccountPwd(account, pwd);
	}

	@Override
	public boolean updateAccountPwd(String account, String oldPwd, String newPwd) {
		return cd.updateAccountPwd(account, oldPwd, newPwd);
	}

	@Override
	public List<Courier> getAllCourier() {
		return cd.queryAllCourier();
	}

	@Override
	public PageData<Courier> getAllCourierByPageLike(int pageNum, int pageSize, String like) {
		return cd.queryAllCourierByPageLike(pageNum, pageSize, like);
	}

	@Override
	public Courier getCourierByCountyId(int countyId) {
		return cd.queryCourierByCountyId(countyId);
	}	
	

}

package com.etc.service.impl;

import java.util.List;

import com.etc.dao.CountyDao;
import com.etc.dao.impl.CountyDaoImpl;
import com.etc.entity.County;
import com.etc.service.CountyService;

public class CountyServiceImpl implements CountyService {
	CountyDao cd = new CountyDaoImpl();
	@Override
	public boolean addCounty(County c) {
		return cd.addCounty(c);
	}

	@Override
	public List<County> queryAllCounty() {
		return cd.queryAllCounty();
	}

	@Override
	public County searchCountyById(int id) {
		return cd.queryCountyById(id);
	}

	@Override
	public List<County> queryCountyByCityid(int id) {
		return cd.queryCountyByCityid(id);
	}

}

package com.etc.service.impl;

import java.util.List;

import com.etc.dao.CityDao;
import com.etc.dao.impl.CityDaoImpl;
import com.etc.entity.City;
import com.etc.service.CityService;

public class CityServiceImpl implements CityService {
	CityDao cd = new CityDaoImpl();
	@Override
	public boolean addCity(City c) {
		return cd.addCity(c);
	}

	@Override
	public List<City> queryAllCity() {
		return cd.queryAllCity();
	}

	@Override
	public City searchCityById(int id) {
		return cd.queryCityById(id);
	}

}

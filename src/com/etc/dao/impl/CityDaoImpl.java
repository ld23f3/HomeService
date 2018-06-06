package com.etc.dao.impl;

import java.util.List;

import com.etc.dao.CityDao;
import com.etc.entity.City;
import com.etc.entity.Province;
import com.etc.util.DBUtil;

public class CityDaoImpl implements CityDao {

	@Override
	public boolean addCity(City c) {
		String sql = "insert into city values(?,?,?)";
		return DBUtil.execute(sql, c.getCITYID(), c.getCITYNAME(), c.getPROVINCEID()) > 0;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<City> queryAllCity() {
		String sql = "select * from city order by CITYID";
		return (List<City>) DBUtil.select(sql, City.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public City queryCityById(int id) {
		String sql = "select * FROM CITY where CITYID = ?";
		List<City> list = (List<City>) DBUtil.select(sql, City.class, id);
		if (list.size() > 0)
			return list.get(0);
		return null;
	}

}

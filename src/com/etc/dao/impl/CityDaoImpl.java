package com.etc.dao.impl;

import java.util.List;

import com.etc.dao.CityDao;
import com.etc.entity.City;
import com.etc.util.DBUtil;

@SuppressWarnings("unchecked")
public class CityDaoImpl implements CityDao {

	@Override
	public boolean addCity(City c) {
		String sql = "insert into city values(?,?,?)";
		return DBUtil.execute(sql, c.getCITYID(), c.getCITYNAME(), c.getPROVINCEID()) > 0;
	}

	@Override
	public List<City> queryAllCity() {
		String sql = "select * from city order by CITYID";
		return (List<City>) DBUtil.select(sql, City.class);
	}

	@Override
	public City queryCityById(int id) {
		String sql = "select * FROM CITY where CITYID = ?";
		List<City> list = (List<City>) DBUtil.select(sql, City.class, id);
		if (list.size() > 0)
			return list.get(0);
		return null;
	}

	@Override
	public List<City> queryCityByProvinceid(int id) {
		String sql = "select * FROM CITY where PROVINCEID = ?";
		List<City> list = (List<City>) DBUtil.select(sql, City.class, id);
		return list;
	}

	@Override
	public List<City> queryCityLikeCityName(String name) {
		String sql = "select *  FROM CITY where CITYNAME like ?";
		List<City> list = (List<City>) DBUtil.select(sql, City.class, "%" + name + "%");
		return list;
	}

	@Override
	public City queryCityByCityName(String name) {
		String sql = "select *  FROM CITY where CITYNAME = ?";
		List<City> list = (List<City>) DBUtil.select(sql, City.class, name);
		if(list.size()>0)
			return list.get(0);
		return null;
	}

}

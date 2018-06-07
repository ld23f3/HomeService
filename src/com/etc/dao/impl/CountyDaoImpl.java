package com.etc.dao.impl;

import java.util.List;

import com.etc.dao.CountyDao;
import com.etc.entity.County;
import com.etc.util.DBUtil;

@SuppressWarnings("unchecked")
public class CountyDaoImpl implements CountyDao {

	@Override
	public boolean addCounty(County c) {
		String sql = "insert into county values(?,?,?)";
		return DBUtil.execute(sql, c.getCOUNTYID(), c.getCOUNTYNAME(), c.getCITYID()) > 0;
	}

	@Override
	public List<County> queryAllCounty() {
		String sql = "select * from county  order by COUNTYID";
		return (List<County>) DBUtil.select(sql, County.class);
	}

	@Override
	public County queryCountyById(int id) {
		String sql = "SELECT * FROM COUNTY WHERE COUNTYID = ?";
		List<County> list = (List<County>) DBUtil.select(sql, County.class, id);
		if (list.size() > 0)
			return list.get(0);
		return null;
	}

	@Override
	public List<County> queryCountyByCityid(int id) {
		String sql = "SELECT * FROM COUNTY WHERE CITYID = ?";
		List<County> list = (List<County>) DBUtil.select(sql, County.class, id);
		return list;
	}

}

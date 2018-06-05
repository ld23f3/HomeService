package com.etc.dao.impl;

import java.util.List;

import com.etc.dao.CountyDao;
import com.etc.entity.County;
import com.etc.util.DBUtil;

public class CountyDaoImpl implements CountyDao {

	@Override
	public boolean addCounty(County c) {
		String sql = "insert into county values(?,?,?)";
		return DBUtil.execute(sql, c.getCOUNTYID(), c.getCOUNTYNAME(), c.getCITYID()) > 0;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<County> queryAllCounty() {
		String sql = "select * from county  order by COUNTYID";
		return (List<County>)DBUtil.select(sql, County.class);
	}
	
}

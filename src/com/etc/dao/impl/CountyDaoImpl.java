package com.etc.dao.impl;

import com.etc.dao.CountyDao;
import com.etc.entity.County;
import com.etc.util.DBUtil;

public class CountyDaoImpl implements CountyDao {

	@Override
	public boolean addCounty(County c) {
		String sql = "insert into county values(?,?,?)";
		return DBUtil.execute(sql, c.getCOUNTYID(), c.getCOUNTYNAME(), c.getCITYID()) > 0;
	}

}

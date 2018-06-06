package com.etc.dao.impl;

import java.util.List;

import com.etc.dao.ProvinceDao;
import com.etc.entity.Province;
import com.etc.util.DBUtil;

public class ProvinceDaoImpl implements ProvinceDao {

	@Override
	public boolean addProvince(Province p) {
		String sql = "insert into province values(?,?)";
		return DBUtil.execute(sql, p.getPROVINCEID(), p.getPROVINCENAME()) > 0;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Province> queryAllProvince() {
		String sql = "select * from province order by PROVINCEID";
		return (List<Province>) DBUtil.select(sql, Province.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Province queryProvinceById(int id) {
		String sql = "SELECT * FROM PROVINCE where PROVINCEID = ?";
		List<Province> list =(List<Province>) DBUtil.select(sql, Province.class, id);
		if(list.size()>0)
			return list.get(0);
		return null;
	}

}

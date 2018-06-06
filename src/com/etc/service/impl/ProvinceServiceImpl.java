package com.etc.service.impl;

import java.util.List;

import com.etc.dao.ProvinceDao;
import com.etc.dao.impl.ProvinceDaoImpl;
import com.etc.entity.Province;
import com.etc.service.ProvinceService;

public class ProvinceServiceImpl implements ProvinceService {
	ProvinceDao pd = new ProvinceDaoImpl();
	@Override
	public boolean addProvince(Province p) {
		return pd.addProvince(p);
	}

	@Override
	public List<Province> queryAllProvince() {
		return pd.queryAllProvince();
	}
	
}

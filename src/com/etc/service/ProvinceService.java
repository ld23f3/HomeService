package com.etc.service;

import java.util.List;

import com.etc.entity.Province;

public interface ProvinceService {
	/**
	 * 添加省份信息
	 * (已测.这个之后没用了)
	 * @param p
	 * @return
	 */
	public boolean addProvince(Province p);

	/**
	 * 查询所有省份信息
	 * (已测)
	 * @return
	 */
	public List<Province> queryAllProvince();
	/**
	 * 根据ID查询指定省份
	 * (已测)
	 * @param id
	 * @return
	 */
	public Province searchProvinceById(int id);
}

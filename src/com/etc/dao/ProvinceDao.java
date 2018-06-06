package com.etc.dao;

import java.util.List;

import com.etc.entity.Province;

public interface ProvinceDao {
	/**
	 * 添加省份信息
	 * @param p 
	 * @return
	 */
	public boolean addProvince(Province p);
	/**
	 * 查询所有省份信息
	 * @return
	 */
	public List<Province> queryAllProvince();
	/**
	 * 根据ID查询指定省份
	 * @param id
	 * @return
	 */
	public Province queryProvinceById(int id);
}

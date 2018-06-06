package com.etc.dao;

import java.util.List;

import com.etc.entity.City;

public interface CityDao {
	/**
	 * 添加市级信息
	 * @param c
	 * @return
	 */
	public boolean addCity(City c);
	/**
	 * 查找所有的市
	 * @return
	 */
	public List<City> queryAllCity();
	/**
	 * 根据ID查询指定的城市
	 * @param id
	 * @return
	 */
	public City queryCityById(int id);
}

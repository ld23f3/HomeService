package com.etc.service;

import java.util.List;

import com.etc.entity.City;

public interface CityService {
	/**
	 * 添加市级信息
	 * (已测)
	 * @param c
	 * @return
	 */
	public boolean addCity(City c);

	/**
	 * 查找所有的市
	 * (已测)
	 * @return
	 */
	public List<City> queryAllCity();
	/**
	 * 根据省份ID查询所有的下属城市
	 * (已测)
	 * @param id
	 * @return
	 */
	public List<City> queryCityByProvinceid(int id);
	/**
	 * 根据ID查询指定的城市
	 * (已测)
	 * @param id
	 * @return
	 */
	public City searchCityById(int id);
	
	/**
	 * 模糊匹配市名,得到所有匹配到的市以及省份ID信息
	 * @param name
	 * @return 所有模糊匹配到的城市信息
	 */
	public List<City> queryCityLikeCityName(String name);
	/**
	 * 精确匹配市名,得到该市及省份信息
	 * @param name
	 * @return
	 */
	public City queryCityByCityName(String name);
}

package com.etc.service;

import java.util.List;

import com.etc.entity.County;

public interface CountyService {
	/**
	 * 添加县/区信息
	 * (已测)
	 * @param c
	 * @return
	 */
	public boolean addCounty(County c);

	/**
	 * 查询所有县的信息
	 * (已测)
	 * @return
	 */
	public List<County> queryAllCounty();
	/**
	 * 根据ID查询指定县/区
	 * (已测)
	 * @param id 
	 * @return
	 */
	public County searchCountyById(int id);
}

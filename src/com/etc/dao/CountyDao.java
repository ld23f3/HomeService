package com.etc.dao;

import java.util.List;

import com.etc.entity.County;

public interface CountyDao {
	/**
	 * 添加县/区信息
	 * @param c
	 * @return
	 */
	public boolean addCounty(County c);
	/**
	 * 查询所有县/区的信息
	 * @return
	 */
	public List<County> queryAllCounty();
	/**
	 * 根据ID查询指定县/区
	 * @param id 
	 * @return
	 */
	public County queryCountyById(int id);
}

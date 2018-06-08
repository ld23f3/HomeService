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
	 * 根据城市ID查询所有区县
	 * @param id
	 * @return
	 */
	public List<County> queryCountyByCityid(int id);
	/**
	 * 根据ID查询指定县/区
	 * @param id 
	 * @return
	 */
	public County queryCountyById(int id);
	/**
	 * 模糊匹配区县名称.得到所有匹配到的县以及上级城市ID信息
	 * @param name
	 * @return
	 */
	public List<County> queryCountyLikeCountyName(String name);
	/**
	 * 精确匹配区县名称.得到该县以及上级城市ID信息
	 * @param name
	 * @return
	 */
	public County queryCountyByCountyName(String name);
}

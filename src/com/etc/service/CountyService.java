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
	 * 根据城市ID查询所有区县
	 * (已测)
	 * @param id
	 * @return
	 */
	public List<County> queryCountyByCityid(int id);
	/**
	 * 根据ID查询指定县/区
	 * (已测)
	 * @param id 
	 * @return
	 */
	public County searchCountyById(int id);
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

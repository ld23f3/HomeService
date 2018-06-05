package com.etc.dao;

import com.etc.entity.County;

public interface CountyDao {
	/**
	 * 添加县/区信息
	 * @param c
	 * @return
	 */
	public boolean addCounty(County c);
}

package com.etc.dao;

import java.util.List;

import com.etc.entity.County;

public interface CountyDao {
	/**
	 * ������/����Ϣ
	 * @param c
	 * @return
	 */
	public boolean addCounty(County c);
	/**
	 * ��ѯ�����ص���Ϣ
	 * @return
	 */
	public List<County> queryAllCounty();
}
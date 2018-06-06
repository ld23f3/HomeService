package com.etc.dao;

import java.util.List;

import com.etc.entity.County;

public interface CountyDao {
	/**
	 * �����/����Ϣ
	 * @param c
	 * @return
	 */
	public boolean addCounty(County c);
	/**
	 * ��ѯ������/������Ϣ
	 * @return
	 */
	public List<County> queryAllCounty();
	/**
	 * ����ID��ѯָ����/��
	 * @param id 
	 * @return
	 */
	public County queryCountyById(int id);
}

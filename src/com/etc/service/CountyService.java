package com.etc.service;

import java.util.List;

import com.etc.entity.County;

public interface CountyService {
	/**
	 * �����/����Ϣ
	 * 
	 * @param c
	 * @return
	 */
	public boolean addCounty(County c);

	/**
	 * ��ѯ�����ص���Ϣ
	 * 
	 * @return
	 */
	public List<County> queryAllCounty();
}

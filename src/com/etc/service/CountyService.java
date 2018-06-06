package com.etc.service;

import java.util.List;

import com.etc.entity.County;

public interface CountyService {
	/**
	 * �����/����Ϣ
	 * (�Ѳ�)
	 * @param c
	 * @return
	 */
	public boolean addCounty(County c);

	/**
	 * ��ѯ�����ص���Ϣ
	 * (�Ѳ�)
	 * @return
	 */
	public List<County> queryAllCounty();
	/**
	 * ����ID��ѯָ����/��
	 * (�Ѳ�)
	 * @param id 
	 * @return
	 */
	public County searchCountyById(int id);
}

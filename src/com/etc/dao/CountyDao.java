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
	 * ���ݳ���ID��ѯ��������
	 * @param id
	 * @return
	 */
	public List<County> queryCountyByCityid(int id);
	/**
	 * ����ID��ѯָ����/��
	 * @param id 
	 * @return
	 */
	public County queryCountyById(int id);
	
}

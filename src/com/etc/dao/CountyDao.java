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
	/**
	 * ģ��ƥ����������.�õ�����ƥ�䵽�����Լ��ϼ�����ID��Ϣ
	 * @param name
	 * @return
	 */
	public List<County> queryCountyLikeCountyName(String name);
	/**
	 * ��ȷƥ����������.�õ������Լ��ϼ�����ID��Ϣ
	 * @param name
	 * @return
	 */
	public County queryCountyByCountyName(String name);
}

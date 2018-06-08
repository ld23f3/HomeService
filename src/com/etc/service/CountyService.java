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
	 * ���ݳ���ID��ѯ��������
	 * (�Ѳ�)
	 * @param id
	 * @return
	 */
	public List<County> queryCountyByCityid(int id);
	/**
	 * ����ID��ѯָ����/��
	 * (�Ѳ�)
	 * @param id 
	 * @return
	 */
	public County searchCountyById(int id);
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

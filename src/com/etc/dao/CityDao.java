package com.etc.dao;

import java.util.List;

import com.etc.entity.City;

public interface CityDao {
	/**
	 * ����м���Ϣ
	 * @param c
	 * @return
	 */
	public boolean addCity(City c);
	/**
	 * �������е���
	 * @return
	 */
	public List<City> queryAllCity();
	/**
	 * ����ʡ��ID��ѯ���е���������
	 * @param id
	 * @return
	 */
	public List<City> queryCityByProvinceid(int id);
	/**
	 * ����ID��ѯָ���ĳ���
	 * @param id
	 * @return
	 */
	public City queryCityById(int id);
	
	/**
	 * ģ��ƥ������,�õ�����ƥ�䵽�����Լ�ʡ��ID��Ϣ
	 * @param name
	 * @return ����ģ��ƥ�䵽�ĳ�����Ϣ
	 */
	public List<City> queryCityLikeCityName(String name);
	/**
	 * ��ȷƥ������,�õ����м�ʡ��ID��Ϣ
	 * @param name
	 * @return
	 */
	public City queryCityByCityName(String name);
	
}

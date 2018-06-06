package com.etc.service;

import java.util.List;

import com.etc.entity.City;

public interface CityService {
	/**
	 * ����м���Ϣ
	 * (�Ѳ�)
	 * @param c
	 * @return
	 */
	public boolean addCity(City c);

	/**
	 * �������е���
	 * (�Ѳ�)
	 * @return
	 */
	public List<City> queryAllCity();
	/**
	 * ����ID��ѯָ���ĳ���
	 * (�Ѳ�)
	 * @param id
	 * @return
	 */
	public City searchCityById(int id);
}

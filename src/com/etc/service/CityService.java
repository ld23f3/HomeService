package com.etc.service;

import java.util.List;

import com.etc.entity.City;

public interface CityService {
	/**
	 * ����м���Ϣ
	 * 
	 * @param c
	 * @return
	 */
	public boolean addCity(City c);

	/**
	 * �������е���
	 * 
	 * @return
	 */
	public List<City> queryAllCity();
}

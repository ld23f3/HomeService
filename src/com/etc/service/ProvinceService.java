package com.etc.service;

import java.util.List;

import com.etc.entity.Province;

public interface ProvinceService {
	/**
	 * ���ʡ����Ϣ
	 * 
	 * @param p
	 * @return
	 */
	public boolean addProvince(Province p);

	/**
	 * ��ѯ����ʡ����Ϣ
	 * 
	 * @return
	 */
	public List<Province> queryAllProvince();
}

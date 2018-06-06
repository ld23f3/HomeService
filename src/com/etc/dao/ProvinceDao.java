package com.etc.dao;

import java.util.List;

import com.etc.entity.Province;

public interface ProvinceDao {
	/**
	 * ���ʡ����Ϣ
	 * @param p 
	 * @return
	 */
	public boolean addProvince(Province p);
	/**
	 * ��ѯ����ʡ����Ϣ
	 * @return
	 */
	public List<Province> queryAllProvince();
	/**
	 * ����ID��ѯָ��ʡ��
	 * @param id
	 * @return
	 */
	public Province queryProvinceById(int id);
}

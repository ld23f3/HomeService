package com.etc.service;

import java.util.List;

import com.etc.entity.Province;

public interface ProvinceService {
	/**
	 * ���ʡ����Ϣ
	 * (�Ѳ�.���֮��û����)
	 * @param p
	 * @return
	 */
	public boolean addProvince(Province p);

	/**
	 * ��ѯ����ʡ����Ϣ
	 * (�Ѳ�)
	 * @return
	 */
	public List<Province> queryAllProvince();
	/**
	 * ����ID��ѯָ��ʡ��
	 * (�Ѳ�)
	 * @param id
	 * @return
	 */
	public Province searchProvinceById(int id);
}

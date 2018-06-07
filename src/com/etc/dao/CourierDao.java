package com.etc.dao;

import java.util.List;

import com.etc.entity.Courier;

public interface CourierDao {
	/**
	 * ���ӿ��Ա��Ϣ
	 * Ա�����ɱ�ŵĹ���Ϊ������*10000+���к�
	 * @param courier ���Ա��Ϣ
	 * @return
	 */
	public boolean addCourier(Courier courier); 
	/**
	 * ƥ�� �ֻ��������� /ƥ�� ���ź�����
	 * @param account
	 * @param pwd
	 * @return
	 */
	public Courier checkAccountPwd(String account,String pwd);
	/**
	 * �����˺��޸�����(��Ҫƥ�������)
	 * @param account
	 * @param pwd
	 * @return
	 */
	public boolean updateAccountPwd(String account,String oldPwd, String newPwd);
	/**
	 * ��ѯ���еĿ��Ա.
	 * @return
	 */
	public List<Courier> queryAllCourier();
	
}

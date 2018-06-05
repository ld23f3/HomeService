package com.etc.dao;

import com.etc.entity.Courier;

public interface CourierDao {
	/**
	 * ���ӿ��Ա��Ϣ
	 * @param courier ���Ա��Ϣ
	 * @return
	 */
	public boolean addCourier(Courier courier); 
	/**
	 * ��֤�û������롣/ ƥ�� �ֻ��������� /ƥ�� ���ź�����
	 * @param account
	 * @param pwd
	 * @return
	 */
	public Courier checkAccountPwd(String account,String pwd);
	/**
	 * �޸��û����޸�����(��Ҫƥ�������)
	 * @param account
	 * @param pwd
	 * @return
	 */
	public boolean updateAccountPwd(String account,String oldPwd, String newPwd);
	
	
}

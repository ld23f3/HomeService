package com.etc.service;

import com.etc.entity.Courier;

public interface CourierService {
	/**
	 * ע���˺�(ע�������Ҫ��֤���Ա�Ĺ��ź��ֻ���)
	 * ����ID�Զ�����
	 * COURIER_SEQ.nextval  �Զ���������
	 * @param courier
	 * @return
	 */
	public boolean register(Courier courier);
	/**
	 * ��¼
	 * @param account �˺�(����/����/�ֻ��ž���)
	 * @param pwd ����
	 * @return
	 */
	public Courier login(String account,String pwd);
	/**
	 * �޸�����
	 * @param account �˺�
	 * @param oldPwd ԭ����
	 * @param newPwd ������
	 * @return
	 */
	public boolean updateAccountPwd(String account,String oldPwd, String newPwd);
}	

package com.etc.dao;

import java.util.List;

import com.etc.entity.Courier;
import com.etc.util.PageData;

public interface CourierDao {
	/**
	 * ���ӿ��Ա��Ϣ
	 * Ա�����ɱ�ŵĹ���Ϊ������*10000+���к�
	 * @param courier ���Ա��Ϣ
	 * @return
	 */
	public boolean addCourier(Courier courier);
	/**
	 * �������ر��,��ѯ�������صĸ�����(���Ա)
	 * @param countyId ���ر��
	 * @return
	 */
	public Courier queryCourierByCountyId(int countyId);
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
	/**
	 * ��ҳģ����ѯ���еĿ��Ա.
	 * ģ��ƥ��Ա�������Լ���������
	 * @return
	 */
	public PageData<Courier> queryAllCourierByPageLike(int pageNum,int pageSize,String like);
}

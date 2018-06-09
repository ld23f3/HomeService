package com.etc.service;

import java.util.List;

import com.etc.entity.Courier;
import com.etc.util.PageData;

public interface CourierService {
	/**
	 * ע���˺�(ע�������Ҫ��֤���Ա�Ĺ��ź��ֻ���)
	 * Ա�����ɱ�ŵĹ���Ϊ������*10000+���к�
	 * �� PL/SQL������ʾ
	 * ��Ҫ�ṩһ��
	 * COURIER_SEQ.nextval  �Զ���������
	 * @param courier
	 * @return
	 */
	public boolean register(Courier courier);
	/**
	 * �������ر��,��ѯ�������صĸ�����(���Ա)
	 * @param countyId ���ر��
	 * @return
	 */
	public Courier getCourierByCountyId(int countyId);
	/**
	 * ��¼
	 * ҳ���½ʱ��Ҫ�ж���ְ״̬ 0��ְ,1 ��ְ
	 *  [ COURIERSTATUS]
	 * @param account �˺�(����/�ֻ��ž�����Ϊ�˺�)
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
	/**
	 * ��ȡ���еĿ��Ա��Ϣ.
	 * @return
	 */
	public List<Courier> getAllCourier();
	/**
	 * ��ҳģ����ѯ���еĿ��Ա.
	 * ģ��ƥ��Ա�������Լ���������
	 * @return
	 */
	public PageData<Courier> getAllCourierByPageLike(int pageNum,int pageSize,String like);
}	

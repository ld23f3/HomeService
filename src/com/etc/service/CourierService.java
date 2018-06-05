package com.etc.service;

import com.etc.entity.Courier;

public interface CourierService {
	/**
	 * ×¢²áÕËºÅ
	 * @param courier
	 * @return
	 */
	public boolean register(Courier courier);
	/**
	 * µÇÂ¼
	 * @param account ÕËºÅ(¹¤ºÅ/Ãû×Ö/ÊÖ»úºÅ¾ù¿É)
	 * @param pwd ÃÜÂë
	 * @return
	 */
	public Courier login(String account,String pwd);
	/**
	 * ĞŞ¸ÄÃÜÂë
	 * @param account ÕËºÅ
	 * @param oldPwd Ô­ÃÜÂë
	 * @param newPwd ĞÂÃÜÂë
	 * @return
	 */
	public boolean updateAccountPwd(String account,String oldPwd, String newPwd);
}	

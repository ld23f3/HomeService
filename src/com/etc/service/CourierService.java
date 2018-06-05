package com.etc.service;

import com.etc.entity.Courier;

public interface CourierService {
	/**
	 * 注册账号(注册界面需要验证快递员的工号和手机号)
	 * 工号ID自动增长
	 * COURIER_SEQ.nextval  自动增长序列
	 * @param courier
	 * @return
	 */
	public boolean register(Courier courier);
	/**
	 * 登录
	 * @param account 账号(工号/名字/手机号均可)
	 * @param pwd 密码
	 * @return
	 */
	public Courier login(String account,String pwd);
	/**
	 * 修改密码
	 * @param account 账号
	 * @param oldPwd 原密码
	 * @param newPwd 新密码
	 * @return
	 */
	public boolean updateAccountPwd(String account,String oldPwd, String newPwd);
}	

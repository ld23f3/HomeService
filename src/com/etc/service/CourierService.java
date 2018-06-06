package com.etc.service;

import java.util.List;

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
	 * 内部会判断该员工的在职状态 0在职,1 离职
	 *  [ COURIERSTATUS]
	 * @param account 账号(工号/手机号均可作为账号)
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
	/**
	 * 获取所有的快递员信息.
	 * @return
	 */
	public List<Courier> getAllCourier();
}	

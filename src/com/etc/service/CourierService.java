package com.etc.service;

import java.util.List;

import com.etc.entity.Courier;
import com.etc.util.PageData;

public interface CourierService {
	/**
	 * 注册账号(注册界面需要验证快递员的工号和手机号)
	 * 员工生成编号的规则为区域编号*10000+序列号
	 * 由 PL/SQL做出提示
	 * 需要提供一个
	 * COURIER_SEQ.nextval  自动增长序列
	 * @param courier
	 * @return
	 */
	public boolean register(Courier courier);
	/**
	 * 根据区县编号,查询到该区县的负责人(快递员)
	 * @param countyId 区县编号
	 * @return
	 */
	public Courier getCourierByCountyId(int countyId);
	/**
	 * 登录
	 * 页面登陆时需要判断在职状态 0在职,1 离职
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
	/**
	 * 分页模糊查询所有的快递员.
	 * 模糊匹配员工姓名以及所在区域
	 * @return
	 */
	public PageData<Courier> getAllCourierByPageLike(int pageNum,int pageSize,String like);
}	

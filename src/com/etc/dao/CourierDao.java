package com.etc.dao;

import java.util.List;

import com.etc.entity.Courier;
import com.etc.util.PageData;

public interface CourierDao {
	/**
	 * 增加快递员信息
	 * 员工生成编号的规则为区域编号*10000+序列号
	 * @param courier 快递员信息
	 * @return
	 */
	public boolean addCourier(Courier courier);
	/**
	 * 根据区县编号,查询到该区县的负责人(快递员)
	 * @param countyId 区县编号
	 * @return
	 */
	public Courier queryCourierByCountyId(int countyId);
	/**
	 * 匹配 手机号码密码 /匹配 工号和密码
	 * @param account
	 * @param pwd
	 * @return
	 */
	public Courier checkAccountPwd(String account,String pwd);
	/**
	 * 根据账号修改密码(需要匹配旧密码)
	 * @param account
	 * @param pwd
	 * @return
	 */
	public boolean updateAccountPwd(String account,String oldPwd, String newPwd);
	/**
	 * 查询所有的快递员.
	 * @return
	 */
	public List<Courier> queryAllCourier();
	/**
	 * 分页模糊查询所有的快递员.
	 * 模糊匹配员工姓名以及所在区域
	 * @return
	 */
	public PageData<Courier> queryAllCourierByPageLike(int pageNum,int pageSize,String like);
}

package com.etc.dao.impl;

import java.util.List;

import com.etc.dao.CourierDao;
import com.etc.entity.Courier;
import com.etc.util.DBUtil;
import com.etc.util.PageData;

@SuppressWarnings("unchecked")
public class CourierDaoImpl implements CourierDao {
	@Override
	public Courier checkAccountPwd(String account, String pwd) {
		String sql = "select * FROM courier where (COURIERNO = ? or COURIERTEL = ?) and COURIERPWD = ?";
		List<Courier> list = (List<Courier>) DBUtil.select(sql, Courier.class, account, account, pwd);
		if (list.size() > 0)
			return list.get(0);
		return null;
	}

	@Override
	public boolean addCourier(Courier courier) {
		String sql = "DECLARE  \r\n" + "    v_name NUMBER;\r\n" + "   begin\r\n"
				+ "select my_seq.nextval into v_name from dual;\r\n" + "v_name  := v_name  + ? * 10000;\r\n"
				+ "INSERT INTO COURIER VALUES(v_name,?,?,?,?,0,SYSDATE,SYSDATE);\r\n" + "end;";
		// String sql = "INSERT INTO COURIER VALUES(?,?,?,?,?,1,SYSDATE,SYSDATE)";
		return DBUtil.execute(sql, courier.getCOURIERNO(), courier.getCOURIERREGION(), courier.getCOURIERNAME(),
				courier.getCOURIERPWD(), courier.getCOURIERTEL()) > 0;
	}

	@Override
	public boolean updateAccountPwd(String account, String oldPwd, String newPwd) {
		// 新密码 工号 电话号码 原密码
		String sql = "update COURIER SET COURIERPWD = ? where (COURIERNO = ? or COURIERTEL = ?) and COURIERPWD = ?";
		return DBUtil.execute(sql, newPwd, account, account, oldPwd) > 0;
	}

	@Override
	public List<Courier> queryAllCourier() {
		String sql = "select * FROM courier";
		return (List<Courier>) DBUtil.select(sql, Courier.class);
	}

	public PageData<Courier> queryAllCourierByPage(int pageNum, int pageSize) {
		String sql = "select * FROM courier";
		return DBUtil.getOraclePage(sql, pageNum, pageSize, Courier.class);
	}

	@Override
	public PageData<Courier> queryAllCourierByPageLike(int pageNum, int pageSize, String like) {
		String sql = "select * FROM courier where COURIERNAME like ? or COURIERREGION like ?";
		return DBUtil.getOraclePage(sql, pageNum, pageSize, Courier.class, "%" + like + "%", "%" + like + "%");
	}

	@Override
	public Courier queryCourierByCountyId(int countyId) {
		String sql = "select * from COURIER where  trunc(COURIERNO / 10000)=?";
		List<Courier> list = (List<Courier>)DBUtil.select(sql, Courier.class, countyId);
		if(list.size()>0)
			return list.get(0);
		return null;
	}

}

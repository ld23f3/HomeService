package com.etc.test;

import java.util.List;

import com.etc.entity.Courier;
import com.etc.service.CourierService;
import com.etc.service.impl.CourierServiceImpl;

public class TestService {
	public static void main(String[] args) {

		// 测试快递员类
		CourierService cs = new CourierServiceImpl();
		//测试登录
		//System.out.println(cs.login("8801", "jlh12345"));
		//测试查询所有快递员
		//		List<Courier> list = cs.getAllCourier();
//		for (Courier courier : list) {
//			System.out.println(courier);
//		}
		//测试快递员修改密码
		System.out.println(cs.updateAccountPwd("8801","123456", "jlh12345"));
		// 新增快递员数据
		// CourierService cs = new CourierServiceImpl();
		// Courier courier = new Courier("在这个区域", "姜丽红", "jlh12345", "13800000000");
		// System.out.println(cs.register(courier));
		// int id = 0;
		// 新增省份信息
		// 测试根据ID地域查询
		// ProvinceService ps = new ProvinceServiceImpl();
		// CityService cs = new CityServiceImpl();
		// CountyService cts = new CountyServiceImpl();
		// System.out.println( ps.searchProvinceById(1));
		//
		// System.out.println(cs.searchCityById(389));
		// System.out.println(cts.searchCountyById(538));

		// 测试插入县信息
		// County c = new County(12, "大五", 502);
		// System.out.println(ctd.addCounty(c));

		// 插入市级的信息
		// Province p = new Province(2, "天津");
		// System.out.println(pd.addProvince(p));
		// List<Province> listP = pd.queryAllProvince();
		// for (Province province : listP) {
		// id = province.getPROVINCEID();
		// List<TestMyAddres> listT= (List<TestMyAddres>) DBUtil2.select("SELECT * FROM
		// `district` WHERE `parent_id` = ?", TestMyAddres.class,id);
		// //System.out.println(province);
		// for (TestMyAddres testMyAddres : listT) {
		// City c = new City(Integer.parseInt( testMyAddres.getId()),
		// testMyAddres.getName(), id);
		//
		// System.out.println(testMyAddres );
		// System.out.println(cd.addCity(c));
		// }
		// System.out.println(id);
		// }

		// 测试查询城市信息
		// List<City> listC = cd.queryAllCity();
		// for (City city : listC) {
		// id = city.getCITYID();
		// List<TestMyAddres> listT = (List<TestMyAddres>) DBUtil2
		// .select("SELECT * FROM `district` WHERE `parent_id` = ?", TestMyAddres.class,
		// id);
		// for (TestMyAddres testMyAddres : listT) {
		// County c = new County(Integer.parseInt(testMyAddres.getId()),
		// testMyAddres.getName(), id);
		// System.out.println(testMyAddres);
		// System.out.println(ctd.addCounty(c));
		//
		// }
		// System.out.println(city);
		// }

		// 从mysql查询信息
		// List<TestMyAddres> list= (List<TestMyAddres>) DBUtil2.select("SELECT * FROM
		// `district` WHERE `parent_id` = ?", TestMyAddres.class,id);
		// for (TestMyAddres testMyAddres : list) {
		// Province p = new Province(Integer.parseInt( testMyAddres.getId()),
		// testMyAddres.getName());
		//
		//
		// System.out.print(testMyAddres + "\n");
		// //System.out.println(pd.addProvince(p));
		// }

	}
}

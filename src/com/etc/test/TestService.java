package com.etc.test;

import java.sql.SQLException;

import com.etc.bean.dao.OrderBeanDao;
import com.etc.bean.dao.impl.OrderBeanDaoImpl;
import com.etc.bean.entity.OrderBean;
import com.etc.util.PageData;

public class TestService {
	public static void main(String[] args) throws SQLException {

		
//		CourierService cs = new CourierServiceImpl();
//		PageData<Courier> pd = cs.getAllCourierByPageLike(1, 20, "");
//		System.out.println(pd.getData());
//		System.out.println(pd.getTotal());
		
		// ProvinceDao pd = new ProvinceDaoImpl();
		// List<Province>list = pd.queryAllProvince();
		// Gson g = new Gson();
		// System.out.println( g.toJson(list));
		OrderBeanDao obd = new OrderBeanDaoImpl();
		 PageData<OrderBean>  pd =obd.queryMyOrder(1, 4, "15366245269");
		 System.out.println( pd.getData() );
		 System.out.println( pd.getTotal() );
		//System.out.println(obd.queryMyOrder("489456"));
		// OrderBean ob = new OrderBean("發件人", 14, 240, 1570, "關日璐xx號", "15366245269",
		// "收件人", 14, 240, 1570, "龍田村", "13962698569", "這個是一個東西", 5, 5, 33.333);
		// System.out.println( obd.addOrderBean(ob));
		// LogisticsDao ld = new LogisticsDaoImpl();
		// Logistics logistics = new Logistics(20180001, 14, 240, 1570, "龙体世");
		//
		// System.out.println("新增:" + ld.addLogistics(logistics));
		// List<Logistics>list = ld.queryLogisticsByOrderNo(20180001);
		// for (Logistics logistics2 : list) {
		// System.out.println(logistics2);
		// }
		// GoodsService gs = new GoodsServiceImpl();
		// System.out.println( gs.queryGoodsInfo(20180001));
		// OrderDao od = new OrderDaoImpl();
		// PageData<Order> pd = od.queryOrderByCourieridPage(236, 1, 5, "建");
		// pd = od.queryOrderByCourieridPage(236, 1, 5, 0, "建");
		// System.out.println(pd);
		// System.out.println(pd.getTotalPage());
		// System.out.println(pd.getTotal());
		// OrderDaoService ods = new OrderDaoServiceImpl();
		// List<Order> list = ods.queryAllOrderByCourierId(0);
		// for (Order order : list) {
		// System.out.println(order);
		// }
		// 测试快递员类
		// CourierService cs = new CourierServiceImpl();
		// 新增快递员数据
		// Courier courier = new Courier(5050,"不给域", "蒋策", "1233456", "13800000000");
		// System.out.println(cs.register(courier));

		// 测试添加订单
		// Connection conn = DBUtil.getConn();
		// OrderDao od = new OrderDaoImpl();
		// int orderNo = od.initializeOrderNo(conn);
		// //
		// 20180001,'建辉',14,236,1525,'关日璐5号','15366245269','雷仞',14,240,1570,'角美镇龙田村','13123389565'
		// Order o = new Order(orderNo, "建辉", 14, 236, 1525, "关日璐9号", "15366245269",
		// "雷仞", 14, 240, 1570, "角美镇龙田村",
		// "13123389565");
		// System.out.println(od.addOrder(conn, o));
		// conn.close();
		// System.out.println(od.initializeOrderNo());
		// 测试登录
		// System.out.println(cs.login("8801", "jlh12345"));
		// 测试查询所有快递员
		// List<Courier> list = cs.getAllCourier();
		// for (Courier courier : list) {
		// System.out.println(courier);
		// }
		// 测试快递员修改密码
		// System.out.println(cs.updateAccountPwd("8801", "123456", "jlh12345"));

		// int id = 0;
		// 新增省份信息
		// 测试根据ID地域查询
		// ProvinceService ps = new ProvinceServiceImpl();
		// CityService cs = new CityServiceImpl();
		// CountyService cts = new CountyServiceImpl();
		// **测试指定省份的下属城市

		// List<City> list = cs.queryCityByProvinceid(4);
		// for (City city : list) {
		// System.out.println(city);
		//
		// County c = new County(city.getCITYID(),
		// city.getCITYNAME(), city.getPROVINCEID());
		// System.out.println(cts.addCounty(c));
		//
		// }

		// **测试指定城市的下属区县
		// List<County> list = cts.queryCountyByCityid(460);
		// for (County county : list) {
		// System.out.println(county);
		// }

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

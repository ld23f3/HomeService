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
		// OrderBean ob = new OrderBean("�l����", 14, 240, 1570, "�P���xx̖", "15366245269",
		// "�ռ���", 14, 240, 1570, "�����", "13962698569", "�@����һ���|��", 5, 5, 33.333);
		// System.out.println( obd.addOrderBean(ob));
		// LogisticsDao ld = new LogisticsDaoImpl();
		// Logistics logistics = new Logistics(20180001, 14, 240, 1570, "������");
		//
		// System.out.println("����:" + ld.addLogistics(logistics));
		// List<Logistics>list = ld.queryLogisticsByOrderNo(20180001);
		// for (Logistics logistics2 : list) {
		// System.out.println(logistics2);
		// }
		// GoodsService gs = new GoodsServiceImpl();
		// System.out.println( gs.queryGoodsInfo(20180001));
		// OrderDao od = new OrderDaoImpl();
		// PageData<Order> pd = od.queryOrderByCourieridPage(236, 1, 5, "��");
		// pd = od.queryOrderByCourieridPage(236, 1, 5, 0, "��");
		// System.out.println(pd);
		// System.out.println(pd.getTotalPage());
		// System.out.println(pd.getTotal());
		// OrderDaoService ods = new OrderDaoServiceImpl();
		// List<Order> list = ods.queryAllOrderByCourierId(0);
		// for (Order order : list) {
		// System.out.println(order);
		// }
		// ���Կ��Ա��
		// CourierService cs = new CourierServiceImpl();
		// �������Ա����
		// Courier courier = new Courier(5050,"������", "����", "1233456", "13800000000");
		// System.out.println(cs.register(courier));

		// ������Ӷ���
		// Connection conn = DBUtil.getConn();
		// OrderDao od = new OrderDaoImpl();
		// int orderNo = od.initializeOrderNo(conn);
		// //
		// 20180001,'����',14,236,1525,'�����5��','15366245269','����',14,240,1570,'�����������','13123389565'
		// Order o = new Order(orderNo, "����", 14, 236, 1525, "�����9��", "15366245269",
		// "����", 14, 240, 1570, "�����������",
		// "13123389565");
		// System.out.println(od.addOrder(conn, o));
		// conn.close();
		// System.out.println(od.initializeOrderNo());
		// ���Ե�¼
		// System.out.println(cs.login("8801", "jlh12345"));
		// ���Բ�ѯ���п��Ա
		// List<Courier> list = cs.getAllCourier();
		// for (Courier courier : list) {
		// System.out.println(courier);
		// }
		// ���Կ��Ա�޸�����
		// System.out.println(cs.updateAccountPwd("8801", "123456", "jlh12345"));

		// int id = 0;
		// ����ʡ����Ϣ
		// ���Ը���ID�����ѯ
		// ProvinceService ps = new ProvinceServiceImpl();
		// CityService cs = new CityServiceImpl();
		// CountyService cts = new CountyServiceImpl();
		// **����ָ��ʡ�ݵ���������

		// List<City> list = cs.queryCityByProvinceid(4);
		// for (City city : list) {
		// System.out.println(city);
		//
		// County c = new County(city.getCITYID(),
		// city.getCITYNAME(), city.getPROVINCEID());
		// System.out.println(cts.addCounty(c));
		//
		// }

		// **����ָ�����е���������
		// List<County> list = cts.queryCountyByCityid(460);
		// for (County county : list) {
		// System.out.println(county);
		// }

		// System.out.println( ps.searchProvinceById(1));
		//
		// System.out.println(cs.searchCityById(389));
		// System.out.println(cts.searchCountyById(538));

		// ���Բ�������Ϣ
		// County c = new County(12, "����", 502);
		// System.out.println(ctd.addCounty(c));

		// �����м�����Ϣ
		// Province p = new Province(2, "���");
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

		// ���Բ�ѯ������Ϣ
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

		// ��mysql��ѯ��Ϣ
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

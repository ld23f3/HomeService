package com.etc.test;

import java.util.List;

import com.etc.dao.CityDao;
import com.etc.dao.CountyDao;
import com.etc.dao.ProvinceDao;
import com.etc.dao.impl.CityDaoImpl;
import com.etc.dao.impl.CountyDaoImpl;
import com.etc.dao.impl.ProvinceDaoImpl;
import com.etc.entity.City;
import com.etc.entity.County;
import com.etc.entity.Province;
import com.etc.util.DBUtil2;

public class TestService {
	public static void main(String[] args) {
		// �������Ա����
		// CourierService cs = new CourierServiceImpl();
		// Courier courier = new Courier("���������", "������", "jlh12345", "13800000000");
		// System.out.println(cs.register(courier));
		int id = 0;
		// ����ʡ����Ϣ
		ProvinceDao pd = new ProvinceDaoImpl();
		CityDao cd = new CityDaoImpl();
		CountyDao ctd = new CountyDaoImpl();
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

		List<City> listC = cd.queryAllCity();
		for (City city : listC) {
			id = city.getCITYID();
			List<TestMyAddres> listT = (List<TestMyAddres>) DBUtil2
					.select("SELECT * FROM `district` WHERE `parent_id` = ?", TestMyAddres.class, id);
			for (TestMyAddres testMyAddres : listT) {
				County c = new County(Integer.parseInt(testMyAddres.getId()), testMyAddres.getName(), id);
				System.out.println(testMyAddres);
				System.out.println(ctd.addCounty(c));
				
			}
			System.out.println(id);
		}

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

package com.etc.bean.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.etc.bean.dao.LogisticsBeanDao;
import com.etc.bean.entity.LogisticsBean;
import com.etc.dao.LogisticsDao;
import com.etc.dao.impl.LogisticsDaoImpl;
import com.etc.entity.Courier;
import com.etc.entity.Logistics;
import com.etc.entity.Order;
import com.etc.service.CourierService;
import com.etc.service.impl.CourierServiceImpl;
import com.etc.util.DBUtil;

public class LogisticsBeanDaoImpl implements LogisticsBeanDao {
	LogisticsDao ld = new LogisticsDaoImpl();

	@Override
	public void setTruckRouting(Order order) {
		// S����ȴ�����-S��-S��-R��-S��-S����XXX����
		// Ա�����ɱ�ŵĹ���Ϊ������*10000+���к�
		// OrderBeanDao obd = new OrderBeanDaoImpl();
//		order = new Order(20180090, "�ļ���", 19, 310, 2018, "��", "15259620412", "�ռ���", 14, 236, 2017, "��", "15259620412",
//				"09-6�� -18", 0, "");
		List<Logistics> list = new ArrayList<Logistics>();
		boolean arriveCountySend = false;//�ִ��ͻ�����
		boolean arriveCitySend = false;//�ִ��ͻ�����
		boolean arriveCityRec = false;//�ִ��ջ�����
		boolean arriveCountyRec = false;//�ִ��ջ�����
		

		// ���һ��������Ϣ
		list.add(new Logistics(order.getORDERNO(), order.getSENDERPROVINCEID(), order.getSENDERCITYID(),
				order.getSENDERCOUNTYID(), order.getSENDERADDRESS()));
			
		if (order.getRECEIVERCOUNTYID() == order.getSENDERCOUNTYID()) {
			// ��ͬ������,ֻ�еȴ���ȡ,Ȼ���յ��ɹ�,���ʹ������Ĳ���,����С��λ�ж�
			// �ʹ�ּ�����
			arriveCountySend = true;
		} else if (order.getRECEIVERCITYID() == order.getSENDERCITYID()) {
			// �ʹ�ּ�����
			arriveCountySend = true;
			// ��ͬ����,�м��һ�������ʹ�����
			arriveCountyRec = true;
			
			
		} else if (order.getRECEIVERPROVINCEID() == order.getSENDERPROVINCEID()) {
			arriveCountySend = true;
			//��ͬʡ�����һ�����صִ����
			//���еִ����\
			//���еִ�����
			arriveCitySend = true;
			arriveCityRec = true;
			arriveCountyRec = true;
			
		} else {
			arriveCountySend = true;
			arriveCitySend = true;
			arriveCityRec = true;
			arriveCountyRec = true;
		}
		
		// �ʹ����������طּ�����
		if(arriveCountySend) {
			list.add(new Logistics(order.getORDERNO(), order.getSENDERPROVINCEID(), order.getSENDERCITYID(),
					order.getSENDERCOUNTYID(), "�ּ�����"));
		}
		//�ִ��ͻ�����
		if(arriveCitySend) {
			list.add(new Logistics(order.getORDERNO(), order.getSENDERPROVINCEID(), order.getSENDERCITYID(),
					0, "�������ܲ�"));
		}
		//�ִ��ջ�ʡ�ݳ���
		if(arriveCityRec) {
			list.add(new Logistics(order.getORDERNO(), order.getRECEIVERPROVINCEID(), order.getRECEIVERCITYID(),
					0, "�������ܲ�"));
		}
		//�ִ��ջ�����
		if(arriveCountyRec) {
			list.add(new Logistics(order.getORDERNO(), order.getRECEIVERPROVINCEID(), order.getRECEIVERCITYID(),
					order.getRECEIVERCOUNTYID(), "�ּ�����"));
		}
		//���һ���ִ��ռ�������,�ؼ�
		list.add(new Logistics(order.getORDERNO(), order.getRECEIVERPROVINCEID(), order.getRECEIVERCITYID(),
				order.getRECEIVERCOUNTYID(), order.getRECEIVERADDRESS()));
		for (Logistics log : list) {
			boolean addState = ld.addLogistics(log);
		}

		

	}

	@Override
	public List<LogisticsBean> queryTruckRoutingByOrderNo(int orderNo) {
		String sql = "select L.LOGISTICSNO, L.ORDERNO,P.PROVINCEID, P.PROVINCENAME,C.CITYID, C.CITYNAME,\r\n" + 
				"CY.COUNTYID, CY.COUNTYNAME,L.DETAILADDRESS\r\n" + 
				",L.CREATEDATE,L.SENDSTATE\r\n" + 
				"from  LOGISTICS L LEFT join PROVINCE P on L.PROVINCEID = P.PROVINCEID\r\n" + 
				"LEFT join CITY C ON L.CITYID = C.CITYID \r\n" + 
				"LEFT join COUNTY CY ON L.COUNTYID = CY.COUNTYID\r\n" + 
				"where L.ORDERNO = ? \r\n" + 
				"ORDER BY L.LOGISTICSNO";
		@SuppressWarnings("unchecked")
		List<LogisticsBean> list = (List<LogisticsBean>)DBUtil.select(sql, LogisticsBean.class, orderNo);
		for (LogisticsBean logisticsBean : list) {
			System.out.println(logisticsBean);
		}
//		CourierService cs = new CourierServiceImpl();
//		Courier sendCourier = cs.getCourierByCountyId(order.getSENDERCOUNTYID());
//		System.out.println(sendCourier);
		return list;
	}

}

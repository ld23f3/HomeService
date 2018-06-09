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
		// S区域等待揽件-S县-S市-R市-S县-S区域XXX手中
		// 员工生成编号的规则为区域编号*10000+序列号
		// OrderBeanDao obd = new OrderBeanDaoImpl();
//		order = new Order(20180090, "寄件人", 19, 310, 2018, "送", "15259620412", "收件人", 14, 236, 2017, "收", "15259620412",
//				"09-6月 -18", 0, "");
		List<Logistics> list = new ArrayList<Logistics>();
		boolean arriveCountySend = false;//抵达送货区县
		boolean arriveCitySend = false;//抵达送货城市
		boolean arriveCityRec = false;//抵达收货城市
		boolean arriveCountyRec = false;//抵达收货区县
		

		// 添加一条揽件信息
		list.add(new Logistics(order.getORDERNO(), order.getSENDERPROVINCEID(), order.getSENDERCITYID(),
				order.getSENDERCOUNTYID(), order.getSENDERADDRESS()));
			
		if (order.getRECEIVERCOUNTYID() == order.getSENDERCOUNTYID()) {
			// 相同的区县,只有等待收取,然后收到成功,到送达这样的步骤,从最小单位判断
			// 送达分拣中心
			arriveCountySend = true;
		} else if (order.getRECEIVERCITYID() == order.getSENDERCITYID()) {
			// 送达分拣中心
			arriveCountySend = true;
			// 相同城市,中间多一条区县送达区县
			arriveCountyRec = true;
			
			
		} else if (order.getRECEIVERPROVINCEID() == order.getSENDERPROVINCEID()) {
			arriveCountySend = true;
			//相同省份添加一条区县抵达城市
			//城市抵达城市\
			//城市抵达区县
			arriveCitySend = true;
			arriveCityRec = true;
			arriveCountyRec = true;
			
		} else {
			arriveCountySend = true;
			arriveCitySend = true;
			arriveCityRec = true;
			arriveCountyRec = true;
		}
		
		// 送达揽件地区县分拣中心
		if(arriveCountySend) {
			list.add(new Logistics(order.getORDERNO(), order.getSENDERPROVINCEID(), order.getSENDERCITYID(),
					order.getSENDERCOUNTYID(), "分拣中心"));
		}
		//抵达送货城市
		if(arriveCitySend) {
			list.add(new Logistics(order.getORDERNO(), order.getSENDERPROVINCEID(), order.getSENDERCITYID(),
					0, "市中心总部"));
		}
		//抵达收货省份城市
		if(arriveCityRec) {
			list.add(new Logistics(order.getORDERNO(), order.getRECEIVERPROVINCEID(), order.getRECEIVERCITYID(),
					0, "市中心总部"));
		}
		//抵达收货区县
		if(arriveCountyRec) {
			list.add(new Logistics(order.getORDERNO(), order.getRECEIVERPROVINCEID(), order.getRECEIVERCITYID(),
					order.getRECEIVERCOUNTYID(), "分拣中心"));
		}
		//添加一条抵达收件人手中,必加
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

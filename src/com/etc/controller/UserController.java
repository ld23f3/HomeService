package com.etc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.etc.bean.dao.LogisticsBeanDao;
import com.etc.bean.dao.OrderBeanDao;
import com.etc.bean.dao.impl.LogisticsBeanDaoImpl;
import com.etc.bean.dao.impl.OrderBeanDaoImpl;
import com.etc.bean.entity.OrderBean;
import com.etc.entity.City;
import com.etc.entity.County;
import com.etc.entity.Logistics;
import com.etc.entity.Order;
import com.etc.entity.Province;
import com.etc.service.CityService;
import com.etc.service.CountyService;
import com.etc.service.LogisticsService;
import com.etc.service.ProvinceService;
import com.etc.service.impl.CityServiceImpl;
import com.etc.service.impl.CountyServiceImpl;
import com.etc.service.impl.LogisticsServiceImpl;
import com.etc.service.impl.ProvinceServiceImpl;
import com.google.gson.Gson;

/**
 * Servlet implementation class ProvinceController
 */
@WebServlet("/UserController")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ProvinceService ps = new ProvinceServiceImpl();

	CityService cs = new CityServiceImpl();

	CountyService cts = new CountyServiceImpl();
	
	//��Ӷ���
	OrderBeanDao obd=new OrderBeanDaoImpl();
	
	LogisticsBeanDao logisticsBeanDao = new LogisticsBeanDaoImpl();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UserController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String op = request.getParameter("op");
		if ("queryProvince".equals(op)) {
			List<Province> list = ps.queryAllProvince();

			Gson gson = new Gson();
			String str = gson.toJson(list);
			// ��ʱ���ǵ�str��һ���ַ��������ַ������ص�ҳ��
			// System.out.println("Province:"+str);
			// ��Ӧ
			PrintWriter out = response.getWriter();
			out.println(str);
			out.close();

		} else if ("queryCity".equals(op)) {

			// ��ֵתΪint
			int ProvinceId = Integer.parseInt(request.getParameter("ProvinceId"));

			List<City> list = cs.queryCityByProvinceid(ProvinceId);

			Gson gson = new Gson();
			String str = gson.toJson(list);
			// ��ʱ���ǵ�str��һ���ַ��������ַ������ص�ҳ��
			//System.out.println("city:" + str);
			// ��Ӧ
			PrintWriter out = response.getWriter();
			out.println(str);
			out.close();

		} else if ("queryCounty".equals(op)) {

			int cityId = Integer.parseInt(request.getParameter("CityId"));

			List<County> list = cts.queryCountyByCityid(cityId);

			Gson gson = new Gson();
			String str = gson.toJson(list);
			// ��ʱ���ǵ�str��һ���ַ��������ַ������ص�ҳ��
			//System.out.println("County:" + str);
			// ��Ӧ
			PrintWriter out = response.getWriter();
			out.println(str);
			out.close();

		} else if ("addOrder".equals(op)) {
			// ���ӆ��
			//��
			int CountyId=0;
			int RecivCountyId=0;
			
			//��������
			 int GOODSNUMBER = Integer.parseInt(request.getParameter("GOODSNUMBER"));
			//��������
			String GOODSTYPE = request.getParameter("GOODSTYPE");
			//��������
			int GOODSWEIGHT=Integer.parseInt(request.getParameter("GOODSWEIGHT"));
			//�ļ���
			String SENDER=request.getParameter("SENDER");
			//�ļ����ֻ�
			String SENDERMOBILE=request.getParameter("SENDERMOBILE");
			//�ļ�ʡ
			int ProvinceId=Integer.parseInt(request.getParameter("ProvinceId"));
			//�ļ���
			int CityId=Integer.parseInt(request.getParameter("CityId"));
			//�ļ���
			if(null==request.getParameter("CountyId")) {
			 CountyId=Integer.parseInt(request.getParameter("CountyId"));
			}
			//�ļ�����ϸ��ַ
			String SENDERADDRESS=request.getParameter("SENDERADDRESS");
			//�ռ���
			String RECEIVER=request.getParameter("RECEIVER");
			//�ռ��˵绰
			String RECEIVERMOBILE=request.getParameter("RECEIVERMOBILE");
			//�ռ���ʡ
			int ReciveProvinceId=Integer.parseInt(request.getParameter("ReciveProvinceId"));
			//�ռ�����
			int ReciveCityId=Integer.parseInt(request.getParameter("ReciveCityId"));
			//�ռ�����
			if(null==request.getParameter("RecivCountyId")) {
			 RecivCountyId=Integer.parseInt(request.getParameter("RecivCountyId"));
			}
			//�ռ�����ϸ��ַ
			String RECEIVERADDRESS=request.getParameter("RECEIVERADDRESS");
		
			//System.out.println("ReciveProvinceId="+request.getParameter("ReciveProvinceId"));
			//System.out.println("RecivCountyId="+request.getParameter("RecivCountyId"));
			
			//System.out.println(GOODSNUMBER+","+GOODSTYPE);
			//System.out.println(ReciveProvinceId+","+RecivCountyId+","+RecivCountyId+","+RECEIVERADDRESS);
			 
			
			
			OrderBean ob = new OrderBean(SENDER, ProvinceId, CityId, CountyId, SENDERADDRESS, SENDERMOBILE, RECEIVER, ReciveProvinceId, ReciveCityId, RecivCountyId, RECEIVERADDRESS, RECEIVERMOBILE, GOODSTYPE, GOODSWEIGHT, GOODSNUMBER, 10);
			
			
			int orderNo=obd.addOrderBeanReturnNo(ob);
			
			System.out.println("orderNo : "+orderNo);
			
			if(orderNo>0) {
				Order order = new Order(orderNo, SENDER, ProvinceId, CityId, CountyId, SENDERADDRESS, SENDERMOBILE, RECEIVER, ReciveProvinceId, ReciveCityId, RecivCountyId, RECEIVERADDRESS, RECEIVERMOBILE);
				logisticsBeanDao.setTruckRouting(order);	
				Gson gson = new Gson();
				String str = gson.toJson(order);
				// ��ʱ���ǵ�str��һ���ַ��������ַ������ص�ҳ��
				//System.out.println("County:" + str);
				// ��Ӧ
				PrintWriter out = response.getWriter();
				out.print(orderNo);
				out.close();
					
			}
				
			//request.getRequestDispatcher("index.jsp").forward(request, response);
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

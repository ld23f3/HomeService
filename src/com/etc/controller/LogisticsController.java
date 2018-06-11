package com.etc.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.etc.bean.dao.LogisticsBeanDao;
import com.etc.bean.dao.impl.LogisticsBeanDaoImpl;
import com.etc.bean.entity.LogisticsBean;
import com.etc.entity.Logistics;
import com.etc.service.LogisticsService;
import com.etc.service.impl.LogisticsServiceImpl;

/**
 * Servlet implementation class LogisticsController
 */
@WebServlet("/LogisticsController")
public class LogisticsController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	LogisticsBeanDao ls = new LogisticsBeanDaoImpl();

	/**
	 * Default constructor.
	 */
	public LogisticsController() {
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

		String op = request.getParameter("op");
		System.out.println(op);
		if (null == op || "query".equals(op)) {

			doQuery(request, response);
		} else if ("get".equals(op)) {
			doQuery2(request, response);
		}

	}

	protected void doQuery(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		int orderNo = 1;
		// System.out.println("jinlaile");
		// System.out.println(request.getParameter("orderNo"));
		String orderNoStr = request.getParameter("orderNo");
		if (null == orderNoStr || "".equals(orderNoStr)) {
		} else {
			orderNo = Integer.parseInt(orderNoStr);
		}

		LogisticsService ls = new LogisticsServiceImpl();

//		List<Logistics> list = new ArrayList<Logistics>();
//		Logistics l = new Logistics(1, 1, 1, 1, 1, "ffff", "lll");
//		list.add(l);
		
		
		List<LogisticsBean> list = ls.queryTruckRoutingByOrderNo(orderNo);
		for (LogisticsBean logisticsBean : list) {
			System.out.println(logisticsBean);
		}

		// ����ѯ�Ĺؼ���Ҳ�洢���� ���ݵ�jsp
		request.setAttribute("logistics", list);
		
		// ת����ҳ��
		request.getRequestDispatcher("follow.jsp").forward(request, response);
	}

	protected void doQuery2(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		int orderNo = 0;
		if (null != request.getParameter("orderNo")) {
			orderNo = Integer.parseInt(request.getParameter("orderNo"));
			// orderNo = new String(orderNo.getBytes("iso-8859-1"), "utf-8");
			System.out.println(orderNo);
		}
		// List<Logistics> list = ls.queryLogisticsByOrderNo(1);
		// for (Logistics logistics : list) {
		// System.out.println(logistics);
		// }
		//System.out.println(list);
		// ����ѯ�Ĺؼ���Ҳ�洢���� ���ݵ�jsp
		//request.setAttribute("logistics", list);

		// ת����ҳ��
		request.getRequestDispatcher("follow.jsp").forward(request, response);
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

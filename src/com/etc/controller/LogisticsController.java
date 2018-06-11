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
import com.etc.bean.dao.impl.LogisticsBeanDaoImpl;
import com.etc.bean.entity.LogisticsBean;
import com.etc.entity.Logistics;
import com.etc.entity.Province;
import com.etc.service.LogisticsService;
import com.etc.service.impl.LogisticsServiceImpl;
import com.google.gson.Gson;

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
		response.setContentType("text/html ; charset=UTF-8");

		String op = request.getParameter("op");
		System.out.println("op=" + op);

		if ("queryCity".equals(op)) {

			doQuery(request, response);
		} else if ("get".equals(op)) {

			doQuery2(request, response);
		}
		// if (null == op || "query".equals(op)) {
		// doQuery(request, response);
		// } else if ("get".equals(op)) {
		// doQuery2(request, response);
		// }

	}

	protected void doQuery(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		PrintWriter out = response.getWriter();

		int orderNo = 1;
		// System.out.println("jinlaile");
		// System.out.println(request.getParameter("orderNo"));
		String orderNoStr = request.getParameter("orderNo");

		if (null == orderNoStr || "".equals(orderNoStr)) {
		} else {
			orderNo = Integer.parseInt(orderNoStr);
		}

		List<LogisticsBean> list = ls.queryTruckRoutingByOrderNo(orderNo);
		for (LogisticsBean logisticsBean : list) {
			System.out.println(logisticsBean);
		}

		Gson gson = new Gson();
		String jsonString = gson.toJson(list);

		out.println(jsonString);
		out.close();

		// 将查询的关键字也存储起来 传递到jsp
		// request.setAttribute("logistics", list);

		// 转发到页面
		// request.getRequestDispatcher("follow.jsp").forward(request, response);
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
		// System.out.println(list);
		// 将查询的关键字也存储起来 传递到jsp
		// request.setAttribute("logistics", list);

		// 转发到页面
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

package com.etc.controller;

import java.io.IOException;
import java.io.PipedWriter;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.etc.dao.OrderDao;
import com.etc.dao.impl.OrderDaoImpl;

import com.etc.entity.Order;
import com.etc.service.OrderDaoService;
import com.etc.service.impl.OrderDaoServiceImpl;
import com.etc.util.PageData;
import com.google.gson.Gson;

/**
 * Servlet implementation class OrderController
 */
@WebServlet("/OrderController")
public class OrderController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	OrderDaoService ods=new OrderDaoServiceImpl();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public OrderController() {
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
		String op = request.getParameter("op");
		if ("queryByPage".equals(op)) {
			int page = 1;
			int pageSize = 5;
			String orderLike = "";

			if (null != request.getParameter("page")) {
				page = Integer.parseInt(request.getParameter("page"));
				if (page < 1) {
					page = 1;
				}
			}
			if (null != request.getParameter("pageSize")) {
				pageSize = Integer.parseInt(request.getParameter("pageSize"));
			}
			if (null != request.getParameter("orderLike")) {
				orderLike = request.getParameter("orderLike");
				orderLike = new String(orderLike.getBytes("Iso-8859-1"), "utf-8");
			}
			// 分页查询
			// PageData<Article>pd=as.getArticlesByPage(page, pageSize, articleLike);
			PageData<Order> pda = ods.getAllOrderByPage(page, pageSize, orderLike);

			// 存储信息
			request.setAttribute("pda", pda);
			// 将模糊出查询的字符串 也转发回来
			request.setAttribute("orderLike", orderLike);

			System.out.println(orderLike + "," + pda.getData());
			request.getRequestDispatcher("Manager/order.jsp").forward(request, response);
		} else if ("deleteOrderNo".equals(op)) {

			int orderNo = Integer.parseInt(request.getParameter("orderNo"));
			boolean str = ods.deleteOrderNO(orderNo);
		
			PrintWriter out = response.getWriter();
			out.print(str);
			out.close();

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

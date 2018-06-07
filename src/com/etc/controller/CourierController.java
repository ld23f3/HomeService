package com.etc.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.etc.entity.Courier;
import com.etc.entity.Order;
import com.etc.service.CourierService;
import com.etc.service.OrderDaoService;
import com.etc.service.impl.CourierServiceImpl;
import com.etc.service.impl.OrderDaoServiceImpl;
import com.etc.util.PageData;

/**
 * Servlet implementation class CourierController
 */
@WebServlet("/CourierController")
public class CourierController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// 创建Service对象
	CourierService cs = new CourierServiceImpl();
	OrderDaoService ods = new OrderDaoServiceImpl();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CourierController() {
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
		// 设置请求的编码，位置在request.getParameter之前
		request.setCharacterEncoding("utf-8");

		String op = request.getParameter("op");

		// 登录
		if ("login".equals(op)) {
			// 获取登录信息
			String account = request.getParameter("courierNoOrTel");
			String pwd = request.getParameter("courierPwd");

			Courier co = cs.login(account, pwd);

			if (null != co) {
				if (co.getCOURIERSTATUS() == 0) {
					HttpSession session = request.getSession();
					// 将用户信息存储在session对象中
					session.setAttribute("courier", co);
					request.getRequestDispatcher("Back/collect.jsp").forward(request, response);
				} else {
					System.out.println("已离职");
					response.sendRedirect("Back/courierlogin.jsp");
				}
			} else {
				// other
				response.sendRedirect("Back/courierlogin.jsp");
			}

		} else if ("update".equals(op)) {
			// 获取修改信息
			String account = request.getParameter("courierNoOrTel");
			String oldPwd = request.getParameter("oldcourierPwd");
			String newPwd = request.getParameter("newcourierPwd");

			boolean a = cs.updateAccountPwd(account, oldPwd, newPwd);
			System.out.println(a);
			response.sendRedirect("Back/courierlogin.jsp");

		} else if ("queryOrderByPage0".equals(op)) {
			
			int countyId = 15250002/10000;
			int pageNum = 1;
			int pageSize = 10;
			int status = 0;
			String queryLike = "";

			// 获取页面传递过来的页码page参数
			if (request.getParameter("pageNum") != null) {
				pageNum = Integer.parseInt(request.getParameter("pageNum"));

			}
			if (request.getParameter("pageSize") != null) {
				pageSize = Integer.parseInt(request.getParameter("pageSize"));
			}
			if (null != request.getParameter("queryLike")) {
				queryLike = request.getParameter("queryLike");

				queryLike = new String(queryLike.getBytes("ISO-8859-1"), "utf-8");
			}
			// 分页查询
			PageData<Order> pdo = ods.getMyOrderByPage(countyId, pageNum, pageSize, status, queryLike);

			// 存储数据
			request.setAttribute("pdo", pdo);

			// 将模糊出查询的字符串 也转发回来
			request.setAttribute("queryLike", queryLike);
			// 转发
			request.getRequestDispatcher("mvc/collect.jsp").forward(request, response);
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

package com.etc.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.etc.bean.dao.OrderBeanDao;
import com.etc.bean.dao.impl.OrderBeanDaoImpl;
import com.etc.bean.entity.OrderBean;
import com.etc.entity.Logistics;
import com.etc.entity.Order;
import com.etc.service.OrderDaoService;
import com.etc.service.impl.OrderDaoServiceImpl;
import com.etc.util.PageData;

/**
 * Servlet implementation class QueryOrderController
 */
@WebServlet("/QueryOrderController")
public class QueryOrderController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	OrderDaoService ods = new OrderDaoServiceImpl();
	OrderBeanDao obd = new OrderBeanDaoImpl();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public QueryOrderController() {
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
		System.out.println(op);
		if (null != op) {

			if ("queryOrderByPage".equals(op)) {
				doQueryOrderByPage(request, response);
			}

		}

	}

	protected void doQueryOrderByPage(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		int pageNum = 1;
		int pageSize = 4;
		String queryLike = request.getParameter("queryLike");
		String pageNumStr = request.getParameter("pageNum");
		String pageSizeStr = request.getParameter("pageSize");

		if (null != pageNumStr && !("".equals(pageNumStr))) {
			pageNum = Integer.parseInt(request.getParameter("pageNum"));
		}
		if (null != pageSizeStr && !("".equals(pageSizeStr))) {
			pageSize = Integer.parseInt(request.getParameter("pageSize"));
		}
		//
		// if(null!=request.getParameter("pageSize"))
		// {
		// pageSize = Integer.parseInt(request.getParameter("pageSize"));
		// }
		if (null != queryLike && !("".equals(queryLike))) {
			// queryLike =request.getParameter("queryLike");
			queryLike = new String(queryLike.getBytes("iso-8859-1"), "utf-8");

		}

		// String url ="search.jsp";
		// if(null!=request.getParameter("url"))
		// {
		// url = "index.jsp";
		// }
		// 得到的分页返回结果
//		PageData<Order> pd = ods.getAllOrderByPage(pageNum, pageSize, queryLike);
//		for (Order o : pd.getData()) {
//			System.out.println(o);
//		}
		PageData<OrderBean> pd = obd.queryMyOrder(pageNum, pageSize, queryLike);
		System.out.println(pd.getTotalPage());
		// 将ods存储在request请求范围内;
		 request.setAttribute("pd", pd);

		// 将查询的关键字也存储起来 传递到jsp
		request.setAttribute("queryLike", queryLike);
		System.out.println(queryLike);

		// 转发到页面
		request.getRequestDispatcher("search.jsp").forward(request, response);
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

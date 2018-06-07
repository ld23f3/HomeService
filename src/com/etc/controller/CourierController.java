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
import com.etc.service.impl.CourierServiceImpl;
import com.etc.util.PageData;

/**
 * Servlet implementation class CourierController
 */
@WebServlet("/CourierController")
public class CourierController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// ����Service����
	CourierService cs = new CourierServiceImpl();

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
		// ��������ı��룬λ����request.getParameter֮ǰ
		request.setCharacterEncoding("utf-8");

		String op = request.getParameter("op");

		// ��¼
		if ("login".equals(op)) {
			// ��ȡ��¼��Ϣ
			String account = request.getParameter("courierNoOrTel");
			String pwd = request.getParameter("courierPwd");

			Courier co = cs.login(account, pwd);

			if (null != co) {
				if (co.getCOURIERSTATUS() == 0) {
					HttpSession session = request.getSession();
					// ���û���Ϣ�洢��session������
					session.setAttribute("courier", co);
					request.getRequestDispatcher("Back/collect.jsp").forward(request, response);
				} else {
					System.out.println("����ְ");
					response.sendRedirect("Back/courierlogin.jsp");
				}
			} else {
				// other
				response.sendRedirect("Back/courierlogin.jsp");
			}

		} else if ("update".equals(op)) {
			// ��ȡ�޸���Ϣ
			String account = request.getParameter("courierNoOrTel");
			String oldPwd = request.getParameter("oldcourierPwd");
			String newPwd = request.getParameter("newcourierPwd");

			boolean a = cs.updateAccountPwd(account, oldPwd, newPwd);
			System.out.println(a);
			response.sendRedirect("Back/courierlogin.jsp");

		} else if ("queryOrderByPage0".equals(op)) {
			int page = 1;
			int pageSize = 10;
			String senderAddressLike = "";

			// ��ȡҳ�洫�ݹ�����ҳ��page����
			if (request.getParameter("page") != null) {
				page = Integer.parseInt(request.getParameter("page"));

			}
			if (request.getParameter("pageSize") != null) {
				pageSize = Integer.parseInt(request.getParameter("pageSize"));
			}
			if (null != request.getParameter("senderAddressLike")) {
				senderAddressLike = request.getParameter("senderAddressLike");

				senderAddressLike = new String(senderAddressLike.getBytes("ISO-8859-1"), "utf-8");
			}
			// ��ҳ��ѯ
//			PageData<Order> pdo = cs

			// �洢����
			request.setAttribute("pdo", pdo);

			// ��ģ������ѯ���ַ��� Ҳת������
			request.setAttribute("senderAddressLike", senderAddressLike);
			// ת��
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

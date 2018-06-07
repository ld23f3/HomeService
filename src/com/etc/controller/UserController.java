package com.etc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.etc.entity.City;
import com.etc.entity.County;
import com.etc.entity.Province;
import com.etc.service.CityService;
import com.etc.service.CountyService;
import com.etc.service.ProvinceService;
import com.etc.service.impl.CityServiceImpl;
import com.etc.service.impl.CountyServiceImpl;
import com.etc.service.impl.ProvinceServiceImpl;
import com.google.gson.Gson;

/**
 * Servlet implementation class ProvinceController
 */
@WebServlet("/ProvinceController")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ProvinceService ps = new ProvinceServiceImpl();

	CityService cs = new CityServiceImpl();
	
	CountyService cts=new CountyServiceImpl();

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
			// 此时我们的str是一个字符串，讲字符串返回到页面
			// System.out.println("Province:"+str);
			// 响应
			PrintWriter out = response.getWriter();
			out.println(str);
			out.close();

		} else if ("queryCity".equals(op)) {

			// 传值转为int
			int ProvinceId = Integer.parseInt(request.getParameter("ProvinceId"));

			List<City> list = cs.queryCityByProvinceid(ProvinceId);

			Gson gson = new Gson();
			String str = gson.toJson(list);
			// 此时我们的str是一个字符串，讲字符串返回到页面
			System.out.println("city:" + str);
			// 响应
			PrintWriter out = response.getWriter();
			out.println(str);
			out.close();

		} else if ("queryCounty".equals(op)) {

			int cityId = Integer.parseInt(request.getParameter("CityId"));
			
			List<County>list=cts.queryCountyByCityid(cityId);
			
			
			Gson gson = new Gson();
			String str = gson.toJson(list);
			// 此时我们的str是一个字符串，讲字符串返回到页面
			System.out.println("County:" + str);
			// 响应
			PrintWriter out = response.getWriter();
			out.println(str);
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

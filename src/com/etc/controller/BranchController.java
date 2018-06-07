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
import com.etc.entity.Province;
import com.etc.service.CityService;
import com.etc.service.ProvinceService;
import com.etc.service.impl.CityServiceImpl;
import com.etc.service.impl.ProvinceServiceImpl;
import com.google.gson.Gson;

/**
 * Servlet implementation class BranchController
 */
@WebServlet("/BranchController")
public class BranchController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ProvinceService ps = new ProvinceServiceImpl();
	CityService cs = new CityServiceImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BranchController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html ; charset=UTF-8");
		PrintWriter out = response.getWriter();
		String op = request.getParameter("op");

		if("query".equals(op)) {
			
			List<Province> list = ps.queryAllProvince();		
			Gson gson =new Gson();	
			String jsonString = gson.toJson(list);
			
			
			out.println(jsonString);
			out.close();
		}
		else if("queryCityByPro".equals(op)){
			String PROVICEID =request.getParameter("PROVICEID");
			System.out.println("id= "+PROVICEID);
			int id = Integer.parseInt(PROVICEID);;
			List<City> list = cs.queryCityByProvinceid(id);
			Gson gson = new Gson();
			String jsonString = gson.toJson(list);
			out.print(jsonString);
			out.close();			
		}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

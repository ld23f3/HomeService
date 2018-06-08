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
import com.etc.service.CityService;
import com.etc.service.impl.CityServiceImpl;

/**
 * Servlet implementation class FreightController
 */
@WebServlet("/FreightController")
public class FreightController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	CityService cs=new CityServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FreightController() {
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
		double sum=0;
        if("querycity".equals(op)) {
        	
        	String cat = request.getParameter("ProvinceSelect");
        	String dog = request.getParameter("ProvinceSelect_");
        	//int count=Integer.parseInt(request.getParameter("number"));
        	double weight=Double.parseDouble(request.getParameter("weight"));
        	//List<City>list1= cs.queryCityLikeCityName(cat);
        	//List<City>list2= cs.queryCityLikeCityName(dog);
        	
        if(cat.equals(dog)) {
        	sum=8.0;
        	if(weight>5) {
        		
        		// 省內大於5公斤 每公斤加2元
        		double weightCount = weight-5.0;
        		sum=sum+(weightCount*2);
        	}else if(weight<=5) {
        		sum=8.0;
        	}
        }else {
        	// 省外起步12元
        	sum=12.0;
        	if(weight>5) {
        		// 省外大於5公斤  每公斤加2.5元
        		double weightCount = weight-5.0;
        		sum=sum+(weightCount*2.5);
        	}else if(weight<=5) {
        		sum=12;
        	}
        	
        }
        out.println(sum);
             
        
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

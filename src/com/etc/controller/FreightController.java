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
        	String cat = request.getParameter("bcity");
        	String dog = request.getParameter("ocity");
        	int number=Integer.parseInt(request.getParameter("number"));
        	double weight=Double.parseDouble(request.getParameter("weight"));
        	List<City>list1= cs.queryProvinceidbyCityName(cat);
        	List<City>list2= cs.queryProvinceidbyCityName(dog);
        if(list1.get(0)==list2.get(0)) {
        	if(weight>5) {
        		sum=sum*(8+2);
        	}else if(weight<=5) {
        		sum=sum*8;
        	}
        }else {
        	if(weight>5) {
        		sum=sum*(12+2.5);
        	}else if(weight<=5) {
        		sum=sum*12;
        	}
        	
        }
        out.println("<script>alert('运费大约是');location.href='count.jsp'</script>"+sum);
        
        
        
        
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

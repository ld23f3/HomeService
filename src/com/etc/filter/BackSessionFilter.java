package com.etc.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter(urlPatterns= {"/Back/*"})
public class BackSessionFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain fc)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		// �Д��Ñ��Ƿ����
		HttpServletRequest request = (HttpServletRequest)req;
		HttpServletResponse response = (HttpServletResponse)res;
		
		
		// �Д�Ո���·��
		String requestURI= request.getRequestURI();
		System.out.println("requestURI="+requestURI);
		String uri= requestURI.substring(requestURI.lastIndexOf("/")+1);
		System.out.println("uri="+uri);
		HttpSession session = request.getSession();
		if(null!=session.getAttribute("courier")) {
			// �ѽ����� ����
			fc.doFilter(req, res);
			
		}else {
			if("courierlogin.jsp".equals(uri)) {
				
				fc.doFilter(req, res);
			}else {
				
				// ����Ñ��]�е���
				//response.sendRedirect("courierlogin.jsp");			
			}
			
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}

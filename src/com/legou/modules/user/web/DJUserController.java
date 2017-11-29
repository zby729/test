package com.legou.modules.user.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.legou.modules.user.service.UserService;

public class DJUserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int dj_id = Integer.parseInt(request.getParameter("dj_id"));
		int dj_status = Integer.parseInt(request.getParameter("dj_status"));
		UserService service = new UserService();
		int flag = service.upDjById(dj_id, dj_status);
		response.sendRedirect(request.getContextPath()+"/adminlogin");
	}

}

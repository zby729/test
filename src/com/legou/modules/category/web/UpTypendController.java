package com.legou.modules.category.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.legou.modules.category.service.CategoryService;


public class UpTypendController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String typename = request.getParameter("up_typename");
		int id = Integer.parseInt(request.getParameter("up_typend_id"));
		int typeid = Integer.parseInt(request.getParameter("up_typeid"));
		CategoryService service = new CategoryService();
		int flag = service.updateCategorySecondById(typename, id, typeid);
		response.sendRedirect(request.getContextPath()+"/typend");
	}

}

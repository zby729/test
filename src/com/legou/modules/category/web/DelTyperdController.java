package com.legou.modules.category.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.legou.modules.category.service.CategoryService;

public class DelTyperdController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CategoryService service = new CategoryService();
		int id = Integer.parseInt(request.getParameter("del_id"));
		int flag = service.delCategoryThirdById(id);
		response.sendRedirect(request.getContextPath()+"/typerd");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CategoryService service = new CategoryService();
		int id = Integer.parseInt(request.getParameter("del_id"));
		int flag = service.delCategoryThirdById(id);
		response.sendRedirect(request.getContextPath()+"/typerd");
	}

}

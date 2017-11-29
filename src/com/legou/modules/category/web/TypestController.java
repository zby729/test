package com.legou.modules.category.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.legou.modules.category.service.CategoryService;
import com.legou.modules.sys.service.AdminService;

public class TypestController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("GEt");
		request.getSession().setAttribute("categoryfirstlist", new CategoryService().getAllCategoryFirst());
		response.sendRedirect("static/shangpinType_1.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("GEt");
		request.getSession().setAttribute("categoryfirstlist", new CategoryService().getAllCategoryFirst());
		response.sendRedirect("static/shangpinType_1.jsp");
	}

}
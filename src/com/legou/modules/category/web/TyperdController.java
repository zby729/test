package com.legou.modules.category.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.legou.modules.category.service.CategoryService;

public class TyperdController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("GEt");
		request.getSession().setAttribute("categorythirdlist", new CategoryService().getAllCategoryThird());
		response.sendRedirect("static/shangpinType_3.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("GEt");
		request.getSession().setAttribute("categorythirdlist", new CategoryService().getAllCategoryThird());
		response.sendRedirect("static/shangpinType_3.jsp");
	}

}

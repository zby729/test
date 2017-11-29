package com.legou.modules.category.web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.legou.modules.category.entity.CategorySecond;
import com.legou.modules.category.entity.CategoryThird;
import com.legou.modules.category.service.CategoryService;

public class LikeTyperdController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("like_str");
		CategoryService service = new CategoryService();
		ArrayList<CategoryThird> categorythirdlist = new ArrayList<CategoryThird>();
		categorythirdlist = service.getLikeCategoryThird(name);
		request.getSession().setAttribute("categorythirdlist", categorythirdlist);
		response.sendRedirect("static/shangpinType_3.jsp");
	}

}

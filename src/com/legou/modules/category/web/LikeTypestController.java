package com.legou.modules.category.web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.legou.modules.category.entity.CategoryFirst;
import com.legou.modules.category.service.CategoryService;
import com.legou.modules.commodity.entity.Commodity;
import com.legou.modules.commodity.service.CommodityService;

public class LikeTypestController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("like_str");
		CategoryService service = new CategoryService();
		ArrayList<CategoryFirst> categoryfirstlist = new ArrayList<CategoryFirst>();
		categoryfirstlist = service.getLikeCategoryFirst(name);
		request.getSession().setAttribute("categoryfirstlist", categoryfirstlist);
		response.sendRedirect("static/shangpinType_1.jsp");
	}

}

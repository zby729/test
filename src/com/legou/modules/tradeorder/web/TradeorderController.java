package com.legou.modules.tradeorder.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.legou.modules.category.service.CategoryService;
import com.legou.modules.tradeorder.service.TradeorderService;

public class TradeorderController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("GEt");
		request.getSession().setAttribute("tradeorderlist", new TradeorderService().getAllTradeorder());
		response.sendRedirect("static/dingdan_management.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("GEt");
		request.getSession().setAttribute("tradeorderlist", new TradeorderService().getAllTradeorder());
		response.sendRedirect("static/dingdan_management.jsp");
	}

}

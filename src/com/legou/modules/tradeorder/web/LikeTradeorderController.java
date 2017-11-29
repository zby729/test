package com.legou.modules.tradeorder.web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.legou.modules.category.entity.CategoryThird;
import com.legou.modules.category.service.CategoryService;
import com.legou.modules.tradeorder.entity.Tradeorder;
import com.legou.modules.tradeorder.service.TradeorderService;

public class LikeTradeorderController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("like_str");
		TradeorderService service = new TradeorderService();
		ArrayList<Tradeorder> tradeorderlist = new ArrayList<Tradeorder>();
		tradeorderlist = service.getLikeTradeorder(name);
		request.getSession().setAttribute("tradeorderlist", tradeorderlist);
		response.sendRedirect("static/dingdan_management.jsp");
	}

}

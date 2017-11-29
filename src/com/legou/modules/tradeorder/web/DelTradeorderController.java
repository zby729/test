package com.legou.modules.tradeorder.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.legou.modules.category.service.CategoryService;
import com.legou.modules.tradeorder.service.TradeorderService;


public class DelTradeorderController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		TradeorderService service = new TradeorderService();
		int id = Integer.parseInt(request.getParameter("del_id"));
		int flag = service.delTradeorderById(id);
		response.sendRedirect(request.getContextPath()+"/tradeorder");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		TradeorderService service = new TradeorderService();
		int id = Integer.parseInt(request.getParameter("del_id"));
		int flag = service.delTradeorderById(id);
		response.sendRedirect(request.getContextPath()+"/tradeorder");
	}

}

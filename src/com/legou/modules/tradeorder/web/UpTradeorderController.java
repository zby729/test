package com.legou.modules.tradeorder.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.legou.modules.tradeorder.entity.Tradeorder;
import com.legou.modules.tradeorder.service.TradeorderService;

public class UpTradeorderController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("进来这里面了");
		request.setCharacterEncoding("UTF-8");
		Tradeorder tradeorder = new Tradeorder(); 
		tradeorder.setId(Integer.parseInt(request.getParameter("up_typend_id")));
		tradeorder.setShouhuoren(request.getParameter("shouhuoren"));
		tradeorder.setDizhi(request.getParameter("dizhi"));
		tradeorder.setYoubian(request.getParameter("youbian"));
		tradeorder.setTel(request.getParameter("tel"));
		int flag = new TradeorderService().updateTradeorderById(tradeorder);
		System.out.println(tradeorder.getShouhuoren()+"左边这个");
		response.sendRedirect(request.getContextPath()+"/tradeorder");
	}

}

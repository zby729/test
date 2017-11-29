package com.legou.modules.sys.web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.Session;

import com.legou.modules.category.service.CategoryService;
import com.legou.modules.commodity.entity.Commodity;
import com.legou.modules.message.service.MessageService;
import com.legou.modules.sys.service.AdminService;
import com.legou.modules.tradeorder.service.TradeorderService;

public class AdminLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getSession().setAttribute("userlist", new AdminService().getAllUser());
		request.getSession().setAttribute("tradeorderlist", new TradeorderService().getAllTradeorder());
		request.getSession().setAttribute("commoditylist", new AdminService().getAllCommodity());
		request.getSession().setAttribute("categoryfirstlist", new CategoryService().getAllCategoryFirst());
		request.getSession().setAttribute("categorysecondlist", new CategoryService().getAllCategorySecond());
		request.getSession().setAttribute("categorythirdlist", new CategoryService().getAllCategoryThird());
		request.getSession().setAttribute("guanggaolist", new MessageService().getAllGuangGao());
		request.getSession().setAttribute("leavewordlist", new MessageService().getAllLeaveword());
		request.getSession().setAttribute("gonggaolist", new MessageService().getAllGongGao());
		request.getSession().setAttribute("huifulist", new MessageService().getAllHuifu());
		request.getSession().setAttribute("pinglunlist", new MessageService().getAllPinglun());
		response.sendRedirect("static/adminindex.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getSession().setAttribute("userlist", new AdminService().getAllUser());
		request.getSession().setAttribute("tradeorderlist", new TradeorderService().getAllTradeorder());
		request.getSession().setAttribute("commoditylist", new AdminService().getAllCommodity());
		request.getSession().setAttribute("categoryfirstlist", new CategoryService().getAllCategoryFirst());
		request.getSession().setAttribute("categorysecondlist", new CategoryService().getAllCategorySecond());
		request.getSession().setAttribute("categorythirdlist", new CategoryService().getAllCategoryThird());
		request.getSession().setAttribute("leavewordlist", new MessageService().getAllLeaveword());
		request.getSession().setAttribute("gonggaolist", new MessageService().getAllGongGao());
		request.getSession().setAttribute("huifulist", new MessageService().getAllHuifu());
		request.getSession().setAttribute("pinglunlist", new MessageService().getAllPinglun());
		
		
		response.sendRedirect("static/adminindex.jsp");
	}

}

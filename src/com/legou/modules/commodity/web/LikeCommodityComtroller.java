package com.legou.modules.commodity.web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.legou.modules.commodity.entity.Commodity;
import com.legou.modules.commodity.service.CommodityService;
import com.legou.modules.user.entity.User;
import com.legou.modules.user.service.UserService;

public class LikeCommodityComtroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("like_str");
		CommodityService service = new CommodityService();
		ArrayList<Commodity> commoditylist = new ArrayList<Commodity>();
		commoditylist = service.getLikeCommodity(name);
		request.getSession().setAttribute("commoditylist", commoditylist);
		response.sendRedirect("static/shangpin_management.jsp");
	}

}

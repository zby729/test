package com.legou.modules.message.web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.legou.modules.message.entity.*;
import com.legou.modules.message.service.*;

public class Gonggao_adminController extends HttpServlet{

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<GongGao> gonggaolist = new ArrayList<GongGao>();
		Gonggao_adminService go = new Gonggao_adminService();
		gonggaolist = go.show();
		GongGao gg= new GongGao();
		
		for(int i=0;i<gonggaolist.size();i++){
			gg = gonggaolist.get(i);
		}
		request.getSession().setAttribute("gonggaolist",gonggaolist);
		request.getRequestDispatcher("/static/gonggao_management.jsp").forward(request, response);
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);

	}
}
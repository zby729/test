package com.legou.modules.message.web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.legou.common.tools.MyTools;
import com.legou.modules.message.entity.GongGao;
import com.legou.modules.message.service.Gonggao_adminService;

public class Gonggao_insert_adminController extends HttpServlet{

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<GongGao> gonggaolist = new ArrayList<GongGao>();
		Gonggao_adminService go = new Gonggao_adminService();
		GongGao gg= new GongGao();
		
		gg.setContent(MyTools.toChinese(request.getParameter("gg-content")));
		gg.setTitle(MyTools.toChinese(request.getParameter("gg-title")));
		
		int flag = go.insert(gg);
		if(flag == 0){
			System.out.println("公告信息添加失败！");
		}else{
			gonggaolist = go.show();
			GongGao g= new GongGao();
			
			for(int i=0;i<gonggaolist.size();i++){
				g = gonggaolist.get(i);
			}
		}
		request.getSession().setAttribute("gonggaolist",gonggaolist);
		response.sendRedirect(request.getContextPath()+"/gonggao");
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);

	}
}


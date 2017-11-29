package com.legou.modules.message.web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jdt.internal.compiler.ast.MessageSend;

import com.legou.common.tools.MyTools;
import com.legou.modules.message.entity.GongGao;
import com.legou.modules.message.service.Gonggao_adminService;
import com.legou.modules.message.service.MessageService;
import com.sun.xml.internal.messaging.saaj.soap.ver1_1.Message1_1Impl;

public class Gonggao_update_adminController extends HttpServlet{

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<GongGao> gonggaolist = new ArrayList<GongGao>();
		Gonggao_adminService go = new Gonggao_adminService();
		GongGao gg= new GongGao();
		
		gg.setId(MyTools.strToint(request.getParameter("cid")));
		gg.setContent(MyTools.toChinese(request.getParameter("ccontent")));
		gg.setTitle(MyTools.toChinese(request.getParameter("ctitle")));
		
		int flag = go.update(gg);
		if(flag == 0){
			System.out.println("公告信息更改失败！");
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

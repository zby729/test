package com.legou.modules.message.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.legou.modules.message.entity.Huifu;
import com.legou.modules.message.service.MessageService;
import com.sun.xml.internal.messaging.saaj.soap.ver1_1.Message1_1Impl;

public class AddHuifuController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		System.out.println("lyID:"+request.getParameter("huifuid2"));
		int lyid = Integer.parseInt(request.getParameter("huifuid2"));
		System.out.println("lyID:"+lyid);
		int userid = Integer.parseInt(request.getParameter("hfusername"));
		String title = request.getParameter("hftitle");
		String content = request.getParameter("hfcontent");
		Huifu huifu = new Huifu();
		huifu.setLeavewordId(lyid);
		huifu.setUserId(userid);
		huifu.setTitle(title);
		huifu.setContent(content);
		new MessageService().addHuifu(huifu);
		response.sendRedirect(request.getContextPath()+"/huifu");
	}

}

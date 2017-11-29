package com.legou.modules.user.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.legou.common.tools.MyTools;
import com.legou.modules.user.service.UserService;

public class CheckNameController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		System.out.println("��������֤servlet");
		String name=request.getParameter("name");
		int count = 0;
		UserService service = new UserService();
		count = service.checkUser(name);
		response.setContentType("text/html;charset=UTF-8");	//����text 
		PrintWriter out = response.getWriter();
	    if(count==1){
	    	out.print("1");//out.println("1");  
	    	//����ֱ�ӱȽϵļ����ݲ�����out.println���������صĻ��з�
	    	System.out.println("�û�����");
	    }else if(count == 3){
	    	out.print("3");
	    }else{
	    	out.print("0");
	    	System.out.println("�û�������");
	    } 	

	}

}

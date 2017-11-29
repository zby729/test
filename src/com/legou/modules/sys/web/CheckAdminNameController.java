package com.legou.modules.sys.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.legou.common.tools.MyTools;
import com.legou.modules.sys.service.AdminService;
import com.legou.modules.user.service.UserService;

public class CheckAdminNameController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("��������֤checkadminservlet");
		String name=MyTools.toChinese(request.getParameter("name"));
		int count = 0;
		AdminService service = new AdminService();
		count = service.checkAdmin(name);
		response.setContentType("text/html;charset=UTF-8");	//����text 
		PrintWriter out = response.getWriter();
	    if(count!=0){
	    	out.print("1");//out.println("1");  
	    	//����ֱ�ӱȽϵļ����ݲ�����out.println���������صĻ��з�
	    	System.out.println("�û�����");
	    }else{
	    	out.print("0");
	    	System.out.println("�û�������");
	    }	

	}

}

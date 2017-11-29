package com.legou.modules.sys.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.legou.modules.sys.entity.Admin;
import com.legou.modules.sys.service.AdminService;

public class UpAdminPwdController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		int id = Integer.parseInt(request.getParameter("adminid"));
		String password = request.getParameter("adminpwd");
		System.out.println("管理员ID："+id);
		System.out.println("管理员密码："+password);
		Admin admin = new Admin();
		admin.setId(id);
		admin.setPwd(password);
		int flag = new AdminService().UpAdmin(admin);
		response.sendRedirect(request.getContextPath()+"/admin");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

package com.legou.modules.sys.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.legou.common.tools.MyTools;
import com.legou.modules.sys.entity.Admin;
import com.legou.modules.sys.service.AdminService;
import com.legou.modules.user.entity.User;
import com.legou.modules.user.service.UserService;

public class CheckAdminPwdController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/front/aaa.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("开始研制admin");
		Admin user = new Admin();
		AdminService userService = new AdminService();
		user.setName(MyTools.toChinese(request.getParameter("username")));
		user.setPwd(MyTools.toChinese(request.getParameter("password")));
		Admin myself = null;
		myself = userService.loginUser(user);
		PrintWriter out = response.getWriter();
		if (!myself.getPwd().equals(user.getPwd())){
			System.out.println("密码不对");
			out.print("0");
		} else {
			ServletContext application=getServletContext();
			Integer count = null;
			synchronized (application) {
				count = (Integer) application.getAttribute("change");
				if (count == null){
						count = new Integer(0);
						count = new Integer(count.intValue() + 1);
						application.setAttribute("change", count);
				} else {
					application.setAttribute("change", count.intValue() + 1);
				}
			} 
			System.out.println("mima dui ");
			request.getSession().setAttribute("myself", myself);
			out.print("1");
		}
	}

}

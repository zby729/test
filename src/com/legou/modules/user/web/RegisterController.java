package com.legou.modules.user.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.legou.modules.user.dao.UserDao;
import com.legou.modules.user.entity.User;
import com.legou.modules.user.service.UserService;
import com.sun.org.apache.xml.internal.security.algorithms.implementations.IntegrityHmac.IntegrityHmacSHA384;

public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/front/register.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("调用了");
		User user = new User();
		int flag = 0;
		UserService userService = new UserService();
		String[] questions = {"妈妈的生日","爸爸的生日","我的生日"};
		user.setName(request.getParameter("username"));
		user.setPwd(request.getParameter("password"));
		user.setEmail(request.getParameter("e_mail"));
		user.setQQ(request.getParameter("qq_number"));
		user.setYoubian(request.getParameter("zip_code"));
		user.setTel(request.getParameter("phone_number"));
		user.setTruename(request.getParameter("rel_name"));
		user.setDizhi(request.getParameter("address"));
		user.setTishi(questions[Integer.parseInt(request.getParameter("quesion"))]);
		System.out.println("p:"+request.getParameter("quesion"));
		System.out.println("[0]:"+questions[0]);
		System.out.println("[1]:"+questions[1]);
		System.out.println("[2]:"+questions[2]);
		user.setHuida(request.getParameter("answer"));
		user.setIp(request.getRemoteAddr());
		flag = userService.registerUser(user);
		if (flag==0){
			System.out.println("注册失败");
		} else {
			request.getRequestDispatcher("/WEB-INF/views/front/registerToLogin.jsp").forward(request, response);
		}
	}

}

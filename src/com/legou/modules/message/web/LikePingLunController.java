package com.legou.modules.message.web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.legou.common.tools.MyTools;
import com.legou.modules.message.entity.Pinglun;
import com.legou.modules.message.service.MessageService;
import com.legou.modules.user.entity.User;
import com.legou.modules.user.service.UserService;

public class LikePingLunController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("like_str");
		MessageService service = new MessageService();
		ArrayList<Pinglun> pinglunlist = new ArrayList<Pinglun>();
		System.out.println("name:"+MyTools.toChinese(name));
		pinglunlist = service.getAllLikePinglun(MyTools.toChinese(name));
		request.getSession().setAttribute("pinglunlist", pinglunlist);
		response.sendRedirect("static/pinglun_management.jsp");
	}

}

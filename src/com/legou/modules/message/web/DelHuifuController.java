package com.legou.modules.message.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.legou.modules.message.service.MessageService;

public class DelHuifuController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MessageService service = new MessageService();
		int id = Integer.parseInt(request.getParameter("del_id"));
		int flag = service.delHuifuById(id);
		response.sendRedirect(request.getContextPath()+"/huifu");
	}

}

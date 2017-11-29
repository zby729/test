package com.legou.modules.message.web;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.legou.modules.message.dao.MessageDao;
import com.legou.modules.message.entity.GuangGao;
import com.legou.modules.message.service.MessageService;

public class UpGuangGaoController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("�ɹ�Post");
		GuangGao guanggao = new GuangGao();
		
		//��ô����ļ���Ŀ����
        DiskFileItemFactory factory = new DiskFileItemFactory();
        //��ȡ�ļ���Ҫ�ϴ�����·��
        String path = request.getRealPath("/upload1");
        factory.setRepository(new File(path));
        factory.setSizeThreshold(1024*1024) ;
        ServletFileUpload upload = new ServletFileUpload(factory);
        try {
			List<FileItem> list = (List<FileItem>)upload.parseRequest(request);
			guanggao.setId(Integer.parseInt(list.get(0).getString("UTF-8")));
			String url = list.get(2).getString("UTF-8");
			if(url == null || url.equals("")){
				guanggao.setUrl("��δ����");
			} else{
				guanggao.setUrl(list.get(2).getString("UTF-8"));
			}
			String width = list.get(3).getString("UTF-8");
			if (width == null || width.equals("")){
				guanggao.setWidth("��δ����");
			} else {
				guanggao.setWidth(list.get(3).getString("UTF-8"));
			}
			String height = list.get(4).getString("UTF-8");
			if (height.equals("") || height == null){
				guanggao.setHeight("��δ����");
			} else {
				guanggao.setHeight(list.get(4).getString("UTF-8"));
			}
			if(list.get(1).getName().equals("") || list.get(1).getName() == null){
				System.out.println("û�д��ļ�");
				GuangGao g = new MessageDao().findGuangGaoById(guanggao.getId());
				guanggao.setPath(g.getPath());
			}else{
			guanggao.setPath("/banners/"+list.get(1).getName());
			
			OutputStream out = new FileOutputStream(new File("D:\\\\tomcat\\apache-tomcat-7.0.70-windows-x64\\apache-tomcat-7.0.70\\webapps\\legou\\static\\img\\banners",list.get(1).getName()));
            InputStream in = list.get(1).getInputStream() ;
            int length = 0 ;
            byte [] buf = new byte[1024] ;
            System.out.println("��ȡ�ϴ��ļ����ܹ���������"+list.get(1).getSize());
            // in.read(buf) ÿ�ζ��������ݴ����   buf ������
            while( (length = in.read(buf) ) != -1){
                //��   buf ������ ȡ������ д�� ���������������
                out.write(buf, 0, length);
            }
			}
        } catch (FileUploadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        new MessageService().upGuangGao(guanggao);
        response.sendRedirect(request.getContextPath()+"/guanggao");
	}

}

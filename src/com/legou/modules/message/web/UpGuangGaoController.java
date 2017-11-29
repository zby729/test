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
		System.out.println("成功Post");
		GuangGao guanggao = new GuangGao();
		
		//获得磁盘文件条目工厂
        DiskFileItemFactory factory = new DiskFileItemFactory();
        //获取文件需要上传到的路径
        String path = request.getRealPath("/upload1");
        factory.setRepository(new File(path));
        factory.setSizeThreshold(1024*1024) ;
        ServletFileUpload upload = new ServletFileUpload(factory);
        try {
			List<FileItem> list = (List<FileItem>)upload.parseRequest(request);
			guanggao.setId(Integer.parseInt(list.get(0).getString("UTF-8")));
			String url = list.get(2).getString("UTF-8");
			if(url == null || url.equals("")){
				guanggao.setUrl("暂未设置");
			} else{
				guanggao.setUrl(list.get(2).getString("UTF-8"));
			}
			String width = list.get(3).getString("UTF-8");
			if (width == null || width.equals("")){
				guanggao.setWidth("暂未设置");
			} else {
				guanggao.setWidth(list.get(3).getString("UTF-8"));
			}
			String height = list.get(4).getString("UTF-8");
			if (height.equals("") || height == null){
				guanggao.setHeight("暂未设置");
			} else {
				guanggao.setHeight(list.get(4).getString("UTF-8"));
			}
			if(list.get(1).getName().equals("") || list.get(1).getName() == null){
				System.out.println("没有传文件");
				GuangGao g = new MessageDao().findGuangGaoById(guanggao.getId());
				guanggao.setPath(g.getPath());
			}else{
			guanggao.setPath("/banners/"+list.get(1).getName());
			
			OutputStream out = new FileOutputStream(new File("D:\\\\tomcat\\apache-tomcat-7.0.70-windows-x64\\apache-tomcat-7.0.70\\webapps\\legou\\static\\img\\banners",list.get(1).getName()));
            InputStream in = list.get(1).getInputStream() ;
            int length = 0 ;
            byte [] buf = new byte[1024] ;
            System.out.println("获取上传文件的总共的容量："+list.get(1).getSize());
            // in.read(buf) 每次读到的数据存放在   buf 数组中
            while( (length = in.read(buf) ) != -1){
                //在   buf 数组中 取出数据 写到 （输出流）磁盘上
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

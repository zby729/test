package com.legou.modules.commodity.web;

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

import com.legou.common.tools.MyTools;
import com.legou.modules.commodity.entity.Commodity;
import com.legou.modules.commodity.service.CommodityService;

public class AddCommodityController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("成功Get");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("成功Post");
		Commodity commodity = new Commodity();
		
		//获得磁盘文件条目工厂
        DiskFileItemFactory factory = new DiskFileItemFactory();
        //获取文件需要上传到的路径
        String path = request.getRealPath("/upload1");
        factory.setRepository(new File(path));
        factory.setSizeThreshold(1024*1024) ;
        ServletFileUpload upload = new ServletFileUpload(factory);
        try {
			List<FileItem> list = (List<FileItem>)upload.parseRequest(request);
			commodity.setMingcheng(list.get(0).getString("UTF-8"));
			commodity.setJianjie(list.get(1).getString("UTF-8"));
			commodity.setShichangjia(list.get(2).getString("UTF-8"));

			commodity.setTupian("/1/1/"+list.get(3).getName());
			commodity.setAddtime(list.get(4).getString("UTF-8"));
			String dengji = list.get(5).getString("UTF-8");
			if (dengji == null || dengji.equals("")){
				commodity.setDengji("默认");
			} else{
				commodity.setDengji(list.get(5).getString("UTF-8"));
			}
			String xinghao = list.get(6).getString("UTF-8");
			if (xinghao == null || xinghao.equals("")){
				commodity.setXinghao("默认");
			} else {
				commodity.setXinghao(list.get(6).getString("UTF-8"));
			}
			commodity.setShuliang(Integer.parseInt(list.get(7).getString("UTF-8")));
			commodity.setTuijian(Integer.parseInt(list.get(8).getString("UTF-8")));
			commodity.setType3Id(Integer.parseInt(list.get(9).getString("UTF-8")));
			new CommodityService().addCommodity(commodity);
			
			OutputStream out = new FileOutputStream(new File("D:\\\\tomcat\\apache-tomcat-7.0.70-windows-x64\\apache-tomcat-7.0.70\\webapps\\legou\\static\\img\\1\\1",list.get(3).getName()));
            InputStream in = list.get(3).getInputStream() ;
            int length = 0 ;
            byte [] buf = new byte[1024] ;
            System.out.println("获取上传文件的总共的容量："+list.get(3).getSize());
            // in.read(buf) 每次读到的数据存放在   buf 数组中
            while( (length = in.read(buf) ) != -1){
                //在   buf 数组中 取出数据 写到 （输出流）磁盘上
                out.write(buf, 0, length);
            }
        } catch (FileUploadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        response.sendRedirect(request.getContextPath()+"/commoditymanage");
	}

}

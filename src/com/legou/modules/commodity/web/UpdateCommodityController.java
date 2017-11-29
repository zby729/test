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

import com.legou.modules.commodity.entity.Commodity;
import com.legou.modules.commodity.service.CommodityService;


public class UpdateCommodityController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Get����");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("�ɹ�Post");
		Commodity commodity = new Commodity();
		
		//��ô����ļ���Ŀ����
        DiskFileItemFactory factory = new DiskFileItemFactory();
        //��ȡ�ļ���Ҫ�ϴ�����·��
        String path = request.getRealPath("/upload1");
        factory.setRepository(new File(path));
        factory.setSizeThreshold(1024*1024) ;
        ServletFileUpload upload = new ServletFileUpload(factory);
        try {
			List<FileItem> list = (List<FileItem>)upload.parseRequest(request);
			commodity.setMingcheng(list.get(0).getString("UTF-8"));
			commodity.setJianjie(list.get(1).getString("UTF-8"));
			commodity.setShichangjia(list.get(2).getString("UTF-8"));
			if (list.get(3).getName().equals("") || list.get(3).getName() == null){
				Commodity c = new CommodityService().getCommodity(Integer.parseInt(list.get(10).getString("UTF-8")));
				commodity.setTupian(c.getTupian());
			}else {
				commodity.setTupian("/1/1/"+list.get(3).getName());
				OutputStream out = new FileOutputStream(new File("D:\\\\tomcat\\apache-tomcat-7.0.70-windows-x64\\apache-tomcat-7.0.70\\webapps\\legou\\static\\img\\1\\1",list.get(3).getName()));
	            InputStream in = list.get(3).getInputStream() ;
	            int length = 0 ;
	            byte [] buf = new byte[1024] ;
	            System.out.println("��ȡ�ϴ��ļ����ܹ���������"+list.get(3).getSize());
	            // in.read(buf) ÿ�ζ��������ݴ����   buf ������
	            while( (length = in.read(buf) ) != -1){
	                //��   buf ������ ȡ������ д�� ���������������
	                out.write(buf, 0, length);
	            }
			
			}
			commodity.setAddtime(list.get(4).getString("UTF-8"));
			String dengji = list.get(5).getString("UTF-8");
			if (dengji == null || dengji.equals("")){
				commodity.setDengji("Ĭ��");
			} else {
				commodity.setDengji(list.get(5).getString("UTF-8"));
			}
			String xinghao = list.get(6).getString("UTF-8");
			if (xinghao == null || xinghao.equals("")){
				commodity.setXinghao("Ĭ��");
			} else {
				commodity.setXinghao(list.get(6).getString("UTF-8"));
			}
			commodity.setShuliang(Integer.parseInt(list.get(7).getString("UTF-8")));
			commodity.setTuijian(Integer.parseInt(list.get(8).getString("UTF-8")));
			commodity.setType3Id(Integer.parseInt(list.get(9).getString("UTF-8")));
			commodity.setId(Integer.parseInt(list.get(10).getString("UTF-8")));
			
			
			new CommodityService().upCommodity(commodity);
			
        } catch (FileUploadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        response.sendRedirect(request.getContextPath()+"/commoditymanage");
	}

}

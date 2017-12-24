package xmren;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test21
 */
public class Test21 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	 public void doGet(HttpServletRequest request, HttpServletResponse response)
             throws ServletException, IOException {
         downloadFileByOutputStream(response);//�����ļ���ͨ��OutputStream��
     }
 
     /**
      * �����ļ���ͨ��OutputStream��
      * @param response
      * @throws FileNotFoundException
      * @throws IOException
      */
     private void downloadFileByOutputStream(HttpServletResponse response)
             throws FileNotFoundException, IOException {
         //1.��ȡҪ���ص��ļ��ľ���·��
         String realPath = this.getServletConfig().getServletContext().getRealPath("tomcat.gif");
         //2.��ȡҪ���ص��ļ���
         System.out.println("realPath:"+realPath);

         String fileName = realPath.substring(realPath.lastIndexOf("\\")+1);
         System.out.println("fileName:"+fileName);
         //3.����content-disposition��Ӧͷ��������������ص���ʽ���ļ�
         //����content-disposition��Ӧͷ��������������ص���ʽ���ļ��������ļ���Ҫʹ��URLEncoder.encode�������б��룬���������ļ�������

         response.setHeader("content-disposition", "attachment;filename="+fileName);
         //4.��ȡҪ���ص��ļ�������
         InputStream in = new FileInputStream(realPath);
         int len = 0;
         //5.�������ݻ�����
         byte[] buffer = new byte[1024];
         //6.ͨ��response�����ȡOutputStream��
         OutputStream out = response.getOutputStream();
         //7.��FileInputStream��д�뵽buffer������
         while ((len = in.read(buffer)) > 0) {
         //8.ʹ��OutputStream��������������������ͻ��������
             out.write(buffer,0,len);
         }
         in.close();
     }
 
     public void doPost(HttpServletRequest request, HttpServletResponse response)
             throws ServletException, IOException {
         doGet(request, response);
     }

}

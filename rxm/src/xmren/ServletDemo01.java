package xmren;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletDemo01 extends HttpServlet {
     public void doGet(HttpServletRequest request, HttpServletResponse response)
             throws ServletException, IOException {
 
         response.setStatus(302);//���÷���������Ӧ״̬��
         /**
          *������Ӧͷ��������ͨ�� Location���ͷ���������������������������ν�������ض���
          */
         
         System.out.println("this:"+response.toString());
         response.setHeader("Location", "/Test/xmren/1.jsp");
     }
     public void doPost(HttpServletRequest request, HttpServletResponse response)
             throws ServletException, IOException {
         this.doGet(request, response);
     }
 }


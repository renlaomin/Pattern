package xmren;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test29
 */
public class Test29 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		 //request.setCharacterEncoding("UTF-8");
/*	    request.setCharacterEncoding("UTF-8");

	     String userName = request.getParameter("userName");//��ȡ��д�ı�ţ�userid���ı�������֣�<input type="text" name="userid">
	       System.out.println("userName:"+userName);*/
		
		
		  /**
		           *
		           * ������get��ʽ��������ݣ�request��ʹ��������ָ���ı����������Ҳ����Ч�ģ�Ĭ�ϵĻ���ʹ��ISO8859-1����ַ���������������
		           */
		        String name = request.getParameter("name");//��������
		          name =new String(name.getBytes("ISO8859-1"), "UTF-8") ;//��ȡrequest������ISO8859-1�ַ�������յ���ԭʼ���ݵ��ֽ����飬Ȼ��ͨ���ֽ�������ָ���ı��빹���ַ����������������
		          System.out.println("name��"+name);    
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

}

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

	     String userName = request.getParameter("userName");//获取填写的编号，userid是文本框的名字，<input type="text" name="userid">
	       System.out.println("userName:"+userName);*/
		
		
		  /**
		           *
		           * 对于以get方式传输的数据，request即使设置了以指定的编码接收数据也是无效的，默认的还是使用ISO8859-1这个字符编码来接收数据
		           */
		        String name = request.getParameter("name");//接收数据
		          name =new String(name.getBytes("ISO8859-1"), "UTF-8") ;//获取request对象以ISO8859-1字符编码接收到的原始数据的字节数组，然后通过字节数组以指定的编码构建字符串，解决乱码问题
		          System.out.println("name："+name);    
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

}

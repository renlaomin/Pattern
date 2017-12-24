package xmren;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test37
 */
public class Test37 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	  public void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {

	        String token = Test39.getInstance().makeToken();//创建令牌
	        System.out.println("在FormServlet中生成的token："+token);
	        request.getSession().setAttribute("token", token);  //在服务器使用session保存token(令牌)
	        request.getRequestDispatcher("/xmren/7.jsp").forward(request, response);//跳转到form.jsp页面
	    }

	    public void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        doGet(request, response);
	    }

}

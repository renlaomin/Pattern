package xmren;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test15
 */
public class Test15 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String data = "<h1><font color='red'>abcdefghjkl</font></h1>";
        response.getOutputStream().write(data.getBytes());
        ServletContext context = this.getServletConfig().getServletContext();//获取ServletContext对象
        RequestDispatcher rd = context.getRequestDispatcher("/Test16");//获取请求转发对象(RequestDispatcher)
        rd.forward(request, response);//调用forward方法实现请求转发
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
}

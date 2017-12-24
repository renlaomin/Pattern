package xmren;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test12
 */
public class Test12 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    int i=1;
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        i++;
        try {
            Thread.sleep(1000*4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        response.getWriter().write(i+"");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}

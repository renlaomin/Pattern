package xmren;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test13
 */
public class Test13 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private ServletConfig config;




	 public void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
		   String data = "xdp_gacl";
	         ServletContext context = this.getServletConfig().getServletContext();//���ServletContext����
	         context.setAttribute("test13", data);  //��data�洢��ServletContext������
	        
	
	    }

	    public void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        this.doGet(request, response);
	    }


}

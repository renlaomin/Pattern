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

	        String token = Test39.getInstance().makeToken();//��������
	        System.out.println("��FormServlet�����ɵ�token��"+token);
	        request.getSession().setAttribute("token", token);  //�ڷ�����ʹ��session����token(����)
	        request.getRequestDispatcher("/xmren/7.jsp").forward(request, response);//��ת��form.jspҳ��
	    }

	    public void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        doGet(request, response);
	    }

}

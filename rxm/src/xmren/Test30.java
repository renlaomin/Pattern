package xmren;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test30
 */
public class Test30 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		   String data="��Һã����ǹ°����ǣ��������ܽ�JavaWeb";
	         /**
	          * �����ݴ�ŵ�request������,��ʱ��request������һ��Map������ʹ��
	          */
	         request.setAttribute("data", data);
	         System.out.println("data:"+data);
	         //�ͻ��˷���RequestDemo06���Servlet��RequestDemo06֪ͨ������������ת��(forward)��test.jspҳ����д���
	         request.getRequestDispatcher("/xmren/5.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

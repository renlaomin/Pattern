package xmren;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test19
 */
public class Test19 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String data = "abcddfwerwesfasfsadf";
        /**
         * �������ݺ���Ļ���ʱ��ֵ���Ա��������Ƶ���������������������������������
         * �����ǽ����ݵĻ���ʱ������Ϊ1��
         */
        response.setDateHeader("expires",System.currentTimeMillis() + 24 * 3600 * 1000);
        response.getOutputStream().write(data.getBytes());
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        this.doGet(request, response);
    }

}

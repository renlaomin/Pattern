package xmren;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test36
 */
public class Test36 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //�ͻ�������UTF-8���봫�����ݵ��������˵ģ�������Ҫ���÷���������UTF-8�ı�����н��գ���������������ݾͻ��������
        request.setCharacterEncoding("UTF-8");
        String userName = request.getParameter("username");
        try {
            //�õ�ǰ���߳�˯��3���ӣ�ģ�������ӳٶ����±��ظ��ύ������
            Thread.sleep(3*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("�����ݿ��в������ݣ�"+userName);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }


}

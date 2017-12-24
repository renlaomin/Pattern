package xmren;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test25
 */
public class Test25 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String clientCheckcode = request.getParameter("validateCode");//���տͻ���������ύ��������֤��
        String serverCheckcode = (String) request.getSession().getAttribute("checkcode");//�ӷ������˵�session��ȡ����֤��
        System.out.println("clientCheckcode:"+clientCheckcode);
        if (clientCheckcode.equals(serverCheckcode)) {//���ͻ�����֤��ͷ���������֤�Ƚϣ������ȣ����ʾ��֤ͨ��
            System.out.println("��֤����֤ͨ����");
        }else {
            System.out.println("��֤����֤ʧ�ܣ�");
        }
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}

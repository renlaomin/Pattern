package xmren;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Test32
 */
public class Test32 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setCharacterEncoding("UTF=8");
        response.setContentType("text/html;charset=UTF-8");
        //ʹ��request�����getSession()��ȡsession�����session�������򴴽�һ��
        HttpSession session = request.getSession();
        //�����ݴ洢��session��
        session.setAttribute("data", "�°�����");
        //��ȡsession��Id
        String sessionId = session.getId();
        //�ж�session�ǲ����´�����
        if (session.isNew()) {
            response.getWriter().print("session�����ɹ���session��id�ǣ�"+sessionId);
        }else {
            response.getWriter().print("�������Ѿ����ڸ�session�ˣ�session��id�ǣ�"+sessionId);
        }
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}

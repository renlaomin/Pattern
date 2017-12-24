package xmren;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test27
 */
public class Test27 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");//���ý��ַ���"UTF-8"����������ͻ��������
        //ͨ��������Ӧͷ�����������UTF-8�ı�����ʾ����
        response.setHeader("content-type", "text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        Enumeration<String> reqHeadInfos = request.getHeaderNames();//��ȡ���е�����ͷ
        out.write("��ȡ���Ŀͻ������е�����ͷ��Ϣ���£�");
        out.write("<hr/>");
        while (reqHeadInfos.hasMoreElements()) {
            String headName = (String) reqHeadInfos.nextElement();
            String headValue = request.getHeader(headName);//��������ͷ�����ֻ�ȡ��Ӧ������ͷ��ֵ
            out.write(headName+":"+headValue);
            out.write("<br/>");
        }
        out.write("<br/>");
        out.write("��ȡ���Ŀͻ���Accept-Encoding����ͷ��ֵ��");
        out.write("<hr/>");
        String value = request.getHeader("Accept-Encoding");//��ȡAccept-Encoding����ͷ��Ӧ��ֵ
        out.write(value);
        
        Enumeration<String> e = request.getHeaders("Accept-Encoding");
        while (e.hasMoreElements()) {
            String string = (String) e.nextElement();
            System.out.println(string);
        }
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}

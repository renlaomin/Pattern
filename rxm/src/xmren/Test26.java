package xmren;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test26
 */
public class Test26 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        /**
         * 1.��ÿͻ�����Ϣ
         */
        String requestUrl = request.getRequestURL().toString();//�õ������URL��ַ
        String requestUri = request.getRequestURI();//�õ��������Դ
        String queryString = request.getQueryString();//�õ������URL��ַ�и����Ĳ���
        String remoteAddr = request.getRemoteAddr();//�õ������ߵ�IP��ַ
        String remoteHost = request.getRemoteHost();
        int remotePort = request.getRemotePort();
        String remoteUser = request.getRemoteUser();
        String method = request.getMethod();//�õ�����URL��ַʱʹ�õķ���
        String pathInfo = request.getPathInfo();
        String localAddr = request.getLocalAddr();//��ȡWEB��������IP��ַ
        String localName = request.getLocalName();//��ȡWEB��������������
        response.setCharacterEncoding("UTF-8");//���ý��ַ���"UTF-8"����������ͻ��������
        //ͨ��������Ӧͷ�����������UTF-8�ı�����ʾ���ݣ����������仰����ô�������ʾ�Ľ�������
        response.setHeader("content-type", "text/html;charset=UTF-8");
        StringBuilder sb = new StringBuilder();
        OutputStream out = response.getOutputStream();
        sb.append("��ȡ���Ŀͻ�����Ϣ���£�");
        sb.append("<hr/>");
        sb.append("�����URL��ַ��"+requestUrl);
        sb.append("<br/>");
        sb.append("�������Դ��"+requestUri);
        sb.append("<br/>");
        sb.append("�����URL��ַ�и����Ĳ�����"+queryString);
        sb.append("<br/>");
        sb.append("�����ߵ�IP��ַ��"+remoteAddr);
        sb.append("<br/>");
        sb.append("�����ߵ���������"+remoteHost);
        sb.append("<br/>");
        sb.append("ʹ�õĶ˿ںţ�"+remotePort);
        sb.append("<br/>");
        sb.append("remoteUser��"+remoteUser);
        sb.append("<br/>");
        sb.append("����ʹ�õķ�����"+method);
        sb.append("<br/>");
        sb.append("pathInfo��"+pathInfo);
        sb.append("<br/>");
        sb.append("localAddr��"+localAddr);
        sb.append("<br/>");
        sb.append("localName��"+localName);
        out.write(sb.toString().getBytes("UTF-8"));
       /* PrintWriter out = response.getWriter();
        out.write("��ȡ���Ŀͻ�����Ϣ���£�");
        out.write("<hr/>");
        out.write("�����URL��ַ��"+requestUrl);
        out.write("<br/>");
        out.write("�������Դ��"+requestUri);
        out.write("<br/>");
        out.write("�����URL��ַ�и����Ĳ�����"+queryString);
        out.write("<br/>");
        out.write("�����ߵ�IP��ַ��"+remoteAddr);
        out.write("<br/>");
        out.write("�����ߵ���������"+remoteHost);
        out.write("<br/>");
        out.write("ʹ�õĶ˿ںţ�"+remotePort);
        out.write("<br/>");
        out.write("remoteUser��"+remoteUser);
        out.write("<br/>");
        out.write("����ʹ�õķ�����"+method);
        out.write("<br/>");
        out.write("pathInfo��"+pathInfo);
        out.write("<br/>");
        out.write("localAddr��"+localAddr);
        out.write("<br/>");
        out.write("localName��"+localName);*/
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}

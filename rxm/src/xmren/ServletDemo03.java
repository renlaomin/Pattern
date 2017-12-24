package xmren;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletDemo03 extends  HttpServlet{
	 private Object getServletContext;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	  /**
     * ������ܽ���(Accept)������������: 
     * application/x-ms-application, 
     * image/jpeg, 
     * application/xaml+xml, 
     * image/gif, 
     * image/pjpeg, 
     * application/x-ms-xbap, 
     * application/vnd.ms-excel, 
     * application/vnd.ms-powerpoint, 
     * application/msword, 
     */
    response.setHeader("content-type", "image/jpeg");//ʹ��content-type��Ӧͷָ�����͸����������������Ϊ"image/jpeg"
    //��ȡλ����Ŀ��Ŀ¼�µ�img�ļ��������WP_20131005_002.jpg����ͼƬ������һ��������
    InputStream in = ((Object) this.getServletContext).getResourceAsStream("/image/1.bmp");
    byte buffer[] = new byte[1024];
    int len = 0;
    OutputStream out = response.getOutputStream();//�õ������
    while ((len = in.read(buffer)) > 0) {//��ȡ������(in)��������ݴ洢��������(buffer)
        out.write(buffer, 0, len);//���������������������������
    }
}
public void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    this.doGet(request, response);
}
}

package xmren;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test38
 */
public class Test38 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        boolean b = isRepeatSubmit(request);//�ж��û��Ƿ����ظ��ύ
        if(b==true){
            System.out.println("�벻Ҫ�ظ��ύ");
            return;
        }
        request.getSession().removeAttribute("token");//�Ƴ�session�е�token
        System.out.println("�����û��ύ���󣡣�");
    }
    
    /**
     * �жϿͻ����ύ���������ƺͷ����������ɵ������Ƿ�һ��
     * @param request
     * @return 
     *         true �û��ظ��ύ�˱� 
     *         false �û�û���ظ��ύ��
     */
    private boolean isRepeatSubmit(HttpServletRequest request) {
        String client_token = request.getParameter("token");
        //1������û��ύ�ı�������û��token�����û����ظ��ύ�˱�
        if(client_token==null){
            return true;
        }
        //ȡ���洢��Session�е�token
        String server_token = (String) request.getSession().getAttribute("token");
        
        System.out.println("client_token:"+client_token+";server_token:"+server_token);
        
        //2�������ǰ�û���Session�в�����Token(����)�����û����ظ��ύ�˱�
        if(server_token==null){
            return true;
        }
        //3���洢��Session�е�Token(����)����ύ��Token(����)��ͬ�����û����ظ��ύ�˱�
        if(!client_token.equals(server_token)){
            return true;
        }
        
        return false;
    }

public void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    doGet(request, response);
}
}

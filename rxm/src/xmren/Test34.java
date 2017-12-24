package xmren;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Test34
 */
public class Test34 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id = request.getParameter("id");
        System.out.println("id:"+id);
        Book book = DB.getAll().get(id);  //�õ��û��������
        HttpSession session = request.getSession();
        Set<Book> set = (Set) session.getAttribute("list");  //�õ��û����ڱ��������������
        if(set==null){
        	set  =new HashSet(); ;
            session.setAttribute("list", set);
        }
        set.add(book);

        //response. encodeRedirectURL(java.lang.String url)���ڶ�sendRedirect�������url��ַ������д
        String url = response.encodeRedirectURL(request.getContextPath()+"/Test35");
        System.out.println(url);
        response.sendRedirect(url);

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}

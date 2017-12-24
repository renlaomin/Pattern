package xmren;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Test35
 */
public class Test35 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	  public void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        response.setContentType("text/html;charset=UTF-8");
	        PrintWriter out = response.getWriter();
	        HttpSession session = request.getSession();
	        Set <Book> list = (Set) session.getAttribute("list");
	        if(list==null || list.size()==0){
	            out.write("�Բ�������û�й����κ���Ʒ!!");
	            return;
	        }
	        
	        //��ʾ�û��������Ʒ
	        out.write("�����������Ʒ:<br>");
	        for(Book book : list){
	            out.write(book.getName() + "<br/>");
	        }
	    }

	    public void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        doGet(request, response);
	    }

}

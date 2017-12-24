package xmren;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test33
 */
public class Test33 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        //����Session
        request.getSession();
        out.write("����վ�������飺<br/>");
        Set<Map.Entry<String,Book>> set = DB.getAll().entrySet();
        for(Map.Entry<String,Book> me : set){
            Book book = me.getValue();
            String url =request.getContextPath()+ "/Test34?id=" + book.getId();
            //response. encodeURL(java.lang.String url)���ڶԱ�action�ͳ����ӵ�url��ַ������д
            url = response.encodeURL(url);//�������ӵ�url��ַ������д
            out.println(book.getName()  + "   <a href='"+url+"'>����</a><br/>");
        }
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}


/**
 * @author gacl
 * ģ�����ݿ�
 */
class DB{
    private static Map<String,Book> map = new LinkedHashMap<String,Book>();
    static{
        map.put("1", new Book("1","javaweb����"));
        map.put("2", new Book("2","spring����"));
        map.put("3", new Book("3","hibernate����"));
        map.put("4", new Book("4","struts����"));
        map.put("5", new Book("5","ajax����"));
    }
    
    public static Map<String,Book> getAll(){
        return map;
    }
}

class Book{
    
    private String id;
    private String name;

    public Book() {
        super();
    }
    public Book(String id, String name) {
        super();
        this.id = id;
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

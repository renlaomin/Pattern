package xmren;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.jni.File;
import org.omg.CORBA.portable.InputStream;

/**
 * Servlet implementation class Test17
 */
public class Test17 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException { 
        /**
         * response.setContentType("text/html;charset=UTF-8");Ŀ���ǿ����������UTF-8���н��룻
         * �����Ͳ����������������
         */
        response.setHeader("content-type","text/html;charset=UTF-8");
        readSrcDirPropCfgFile(response);//��ȡsrcĿ¼�µ�properties�����ļ�
        response.getWriter().println("<hr/>");
        readWebRootDirPropCfgFile(response);//��ȡxmrenĿ¼�µ�properties�����ļ�
        response.getWriter().println("<hr/>");
        readPropCfgFile(response);//��ȡsrcĿ¼�µ�webcontent���е�properties�����ļ�
        response.getWriter().println("<hr/>");
        readPropCfgFile2(response);//��ȡsrcĿ¼�µ�wen-info���е�properties�����ļ�
        
    }

    /**
     * ��ȡsrcĿ¼�µ�gacl.servlet.study���е�db4.properties�����ļ�
     * @param response
     * @throws IOException
     */
    private void readPropCfgFile2(HttpServletResponse response)
            throws IOException {
/*        java.io.InputStream in = this.getServletConfig().getServletContext().getResourceAsStream("/WEB-INF/1.propertiess");
*/
    	String sPath = this.getServletConfig().getServletContext().getRealPath("/WEB-INF/1.propertiess");
    	FileInputStream fs = new FileInputStream(sPath) ;
    	
    	System.out.println("sPath:"+sPath);
    	Properties prop = new Properties();
        prop.load(fs);
        String driver = prop.getProperty("driver");
        String url = prop.getProperty("url");
        String username = prop.getProperty("name");
        String password = prop.getProperty("password");
        response.getWriter().println("��ȡsrcĿ¼�µ�gacl.servlet.study���е�db4.properties�����ļ���");
        response.getWriter().println(
                MessageFormat.format(
                        "driver={0},url={1},username={2},password={3}", 
                        driver,url, username, password));
    }

    /**
     * ��ȡsrcĿ¼�µ�db.config���е�db3.properties�����ļ�
     * @param response
     * @throws FileNotFoundException
     * @throws IOException
     */
    private void readPropCfgFile(HttpServletResponse response)
            throws FileNotFoundException, IOException {
        //ͨ��ServletContext��ȡweb��Դ�ľ���·��
        String path = this.getServletConfig().getServletContext().getRealPath("/1.propertiess");
        FileInputStream in = new FileInputStream(path);
        Properties prop = new Properties();
        prop.load(in);
        String driver = prop.getProperty("driver");
        String url = prop.getProperty("url");
        String username = prop.getProperty("name");
        String password = prop.getProperty("password");
        response.getWriter().println("��ȡsrcĿ¼�µ�db.config���е�db3.properties�����ļ���");
        response.getWriter().println(
                MessageFormat.format(
                        "driver={0},url={1},username={2},password={3}", 
                        driver,url, username, password));
    }

    /**
     * ͨ��ServletContext�����ȡWebRootĿ¼�µ�properties�����ļ�
     * @param response
     * @throws IOException
     */
    private void readWebRootDirPropCfgFile(HttpServletResponse response)
            throws IOException {
        /**
         * ͨ��ServletContext�����ȡWebRootĿ¼�µ�properties�����ļ�
         * ��/�����������Ŀ��Ŀ¼
         */
        java.io.InputStream in = this.getServletConfig().getServletContext().getResourceAsStream("/build/classes/xmren/1.propertiess");
        Properties prop = new Properties();
        prop.load(in);
        String driver = prop.getProperty("driver");
        String url = prop.getProperty("url");
        String username = prop.getProperty("name");
        String password = prop.getProperty("password");
        response.getWriter().println("��ȡWebRootĿ¼�µ�db2.properties�����ļ���");
        response.getWriter().print(
                MessageFormat.format(
                        "driver={0},url={1},username={2},password={3}", 
                        driver,url, username, password));
    }

    /**
     * ͨ��ServletContext�����ȡsrcĿ¼�µ�properties�����ļ�
     * @param response
     * @throws IOException
     */
    private void readSrcDirPropCfgFile(HttpServletResponse response) throws IOException {
        /**
         * ͨ��ServletContext�����ȡsrcĿ¼�µ�db1.properties�����ļ�
         */
        java.io.InputStream in = this.getServletConfig().getServletContext().getResourceAsStream("/build/classes/1.propertiess");
        Properties prop = new Properties();
        prop.load(in);
        String driver = prop.getProperty("driver");
        String url = prop.getProperty("url");
        String username = prop.getProperty("name");
        String password = prop.getProperty("password");
        response.getWriter().println("��ȡsrcĿ¼�µ�1.properties�����ļ���");
        response.getWriter().println(
                MessageFormat.format(
                        "driver={0},url={1},username={2},password={3}", 
                        driver,url, username, password));
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        this.doGet(request, response);
    }

}

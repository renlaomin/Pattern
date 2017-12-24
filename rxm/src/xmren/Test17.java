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
         * response.setContentType("text/html;charset=UTF-8");目的是控制浏览器用UTF-8进行解码；
         * 这样就不会出现中文乱码了
         */
        response.setHeader("content-type","text/html;charset=UTF-8");
        readSrcDirPropCfgFile(response);//读取src目录下的properties配置文件
        response.getWriter().println("<hr/>");
        readWebRootDirPropCfgFile(response);//读取xmren目录下的properties配置文件
        response.getWriter().println("<hr/>");
        readPropCfgFile(response);//读取src目录下的webcontent包中的properties配置文件
        response.getWriter().println("<hr/>");
        readPropCfgFile2(response);//读取src目录下的wen-info包中的properties配置文件
        
    }

    /**
     * 读取src目录下的gacl.servlet.study包中的db4.properties配置文件
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
        response.getWriter().println("读取src目录下的gacl.servlet.study包中的db4.properties配置文件：");
        response.getWriter().println(
                MessageFormat.format(
                        "driver={0},url={1},username={2},password={3}", 
                        driver,url, username, password));
    }

    /**
     * 读取src目录下的db.config包中的db3.properties配置文件
     * @param response
     * @throws FileNotFoundException
     * @throws IOException
     */
    private void readPropCfgFile(HttpServletResponse response)
            throws FileNotFoundException, IOException {
        //通过ServletContext获取web资源的绝对路径
        String path = this.getServletConfig().getServletContext().getRealPath("/1.propertiess");
        FileInputStream in = new FileInputStream(path);
        Properties prop = new Properties();
        prop.load(in);
        String driver = prop.getProperty("driver");
        String url = prop.getProperty("url");
        String username = prop.getProperty("name");
        String password = prop.getProperty("password");
        response.getWriter().println("读取src目录下的db.config包中的db3.properties配置文件：");
        response.getWriter().println(
                MessageFormat.format(
                        "driver={0},url={1},username={2},password={3}", 
                        driver,url, username, password));
    }

    /**
     * 通过ServletContext对象读取WebRoot目录下的properties配置文件
     * @param response
     * @throws IOException
     */
    private void readWebRootDirPropCfgFile(HttpServletResponse response)
            throws IOException {
        /**
         * 通过ServletContext对象读取WebRoot目录下的properties配置文件
         * “/”代表的是项目根目录
         */
        java.io.InputStream in = this.getServletConfig().getServletContext().getResourceAsStream("/build/classes/xmren/1.propertiess");
        Properties prop = new Properties();
        prop.load(in);
        String driver = prop.getProperty("driver");
        String url = prop.getProperty("url");
        String username = prop.getProperty("name");
        String password = prop.getProperty("password");
        response.getWriter().println("读取WebRoot目录下的db2.properties配置文件：");
        response.getWriter().print(
                MessageFormat.format(
                        "driver={0},url={1},username={2},password={3}", 
                        driver,url, username, password));
    }

    /**
     * 通过ServletContext对象读取src目录下的properties配置文件
     * @param response
     * @throws IOException
     */
    private void readSrcDirPropCfgFile(HttpServletResponse response) throws IOException {
        /**
         * 通过ServletContext对象读取src目录下的db1.properties配置文件
         */
        java.io.InputStream in = this.getServletConfig().getServletContext().getResourceAsStream("/build/classes/1.propertiess");
        Properties prop = new Properties();
        prop.load(in);
        String driver = prop.getProperty("driver");
        String url = prop.getProperty("url");
        String username = prop.getProperty("name");
        String password = prop.getProperty("password");
        response.getWriter().println("读取src目录下的1.properties配置文件：");
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

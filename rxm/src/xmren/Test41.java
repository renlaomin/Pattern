package xmren;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test41 {
	  public static void main(String args[]) throws IOException
	   {
	      String c;
	      // 使用 System.in 创建 BufferedReader 
	      BufferedReader br = new BufferedReader(new 
	                         InputStreamReader(System.in));
	      System.out.println("Enter characters, 'q' to quit.");
	      // 读取字符
	      do {
	         c = (String) br.readLine();
	         System.out.println(c);
	      } while(!c.equals("end"));
	   }
}

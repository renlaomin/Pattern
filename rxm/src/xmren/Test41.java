package xmren;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test41 {
	  public static void main(String args[]) throws IOException
	   {
	      String c;
	      // ʹ�� System.in ���� BufferedReader 
	      BufferedReader br = new BufferedReader(new 
	                         InputStreamReader(System.in));
	      System.out.println("Enter characters, 'q' to quit.");
	      // ��ȡ�ַ�
	      do {
	         c = (String) br.readLine();
	         System.out.println(c);
	      } while(!c.equals("end"));
	   }
}

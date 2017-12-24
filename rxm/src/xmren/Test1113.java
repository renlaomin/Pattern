package xmren;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Test1113 {
		static int x = 5;
	   public static final int BOXWIDTH = 6;
       static final String TITLE = "Manager";
       
		  public static void main(String[] args) throws Exception {
		    int i = 0x111;

		    System.out.println(i);
		    
		    float d =  3.14159f; 
	        System.out.println(d);//3.14159  
	        
	        
	        x=8;

	        System.out.println(BOXWIDTH+";"+TITLE);//3.14159
	        
	        int a=60;
	        System.out.println(a<<2);
	        
	        
	        int [] numbers = {10, 20, 30, 40, 50};

	        for(int x : numbers ) {
	           if( x == 30 ) {
	  	      break;
	           }
	           System.out.print( x );
	           System.out.print("\n");
	        }
	        
	        for(int m=0;m<3;m++){
	       
	        	if(m==1)
	        		break;
	         	System.out.print(m);
	        	System.out.print(",");
	        }
	        
	        
	        char grade = 'C';

	        switch(grade)
	        {
	           case 'A' :
	              System.out.println("优秀"); 
	              break;
	           case 'B' :
	           case 'C' :
	              System.out.println("良好");
	              break;
	           case 'D' :
	              System.out.println("及格");
	           case 'F' :
	              System.out.println("你需要继续努力");
	              break;
	           default :
	              System.out.println("无效等级");
	        }
	        System.out.println("Your grade is " + grade);
	        
	        
	        
	        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd hh-mm-ss"); 

	        String input = args.length == 0 ? "1818-11-11" : args[0]; 

	        System.out.println(input + " Parses as "); 

	        Date t; 

	        try { 
	            t = ft.parse(input); 
	            System.out.println(t); 
	        } catch (ParseException e) { 
	            System.out.println("Unparseable using " + ft); 
	        }
	        
	     }
	     
	
}

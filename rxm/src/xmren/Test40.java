package xmren;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Test40 {

	public static void main(String[] args) {
      //  String token = Test39.getInstance().makeToken();//¥¥Ω®¡Ó≈∆

		for( int i=0;i<=100;i++){
			Calendar rightNow = Calendar.getInstance();
			    Date date1 = new Date(rightNow.getTimeInMillis());
		   // String sTime= String.valueOf(Time.valueOf(String.valueOf(rightNow.get(11)) + "" + String.valueOf(rightNow.get(12)) + "" + String.valueOf(rightNow.get(13))));
		    
		    	
	        System.out.println("1111111111111111111111:"+new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date() ));
	        
	        
	        String s=new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());
	        System.out.println("222222222222222222222:"+s);
	        
	        String s1=new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date())+new Random().nextInt(999999);
	        System.out.println("33333333333333333333333:"+s1);
	        
	        String s2=new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date())+new Random().nextInt(999)+new Random().nextInt(999);
	        System.out.println("4444444444444444444444444:"+s2);
		}

        
     /*  Long lastAccessTime =System.currentTimeMillis();
       Date date = new Date(lastAccessTime);
       System.out.println(date.toLocaleString());
        System.out.println(""+lastAccessTime);*/

	}

}

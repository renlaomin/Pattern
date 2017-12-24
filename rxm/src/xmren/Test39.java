package xmren;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Time;
import java.util.Calendar;
import java.util.Random;

import sun.misc.BASE64Encoder;

public class Test39 {
	 /*
     *单例设计模式（保证类的对象在内存中只有一个）
     *1、把类的构造函数私有
     *2、自己创建一个类的对象
     *3、对外提供一个公共的方法，返回类的对象
     */
    private Test39(){}
    
    private static Test39 instance;
    
    /**
     * 返回类的对象
     * @return
     */
    public static Test39 getInstance(){
    	if(instance==null)
    		instance = new Test39();
		
		return instance;
    }
    
    /**
     * 生成Token
     * Token：Nv6RRuGEVvmGjB+jimI/gw==
     * @return
     */
    public String makeToken(){  //checkException
        //  7346734837483  834u938493493849384  43434384
    	
    	 Calendar rightNow = Calendar.getInstance();
    	String sTime= String.valueOf(Time.valueOf(String.valueOf(rightNow.get(11)) + ":" + String.valueOf(rightNow.get(12)) + ":" + String.valueOf(rightNow.get(13))));
    	 //String sDate = DateX.format(new java.util.Date());
       // String token = ("BE"+StringFunction+ new Random().nextInt(999999)) + "";
        return sTime; /* //数据指纹   128位长   16个字节  md5
        try {
            MessageDigest md = MessageDigest.getInstance("md5");
            byte md5[] =  md.digest(token.getBytes());
            //base64编码--任意二进制编码明文字符   adfsdfsdfsf
            BASE64Encoder encoder = new BASE64Encoder();
            return encoder.encode(md5);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }*/
    }
}

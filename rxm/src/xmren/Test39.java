package xmren;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Time;
import java.util.Calendar;
import java.util.Random;

import sun.misc.BASE64Encoder;

public class Test39 {
	 /*
     *�������ģʽ����֤��Ķ������ڴ���ֻ��һ����
     *1������Ĺ��캯��˽��
     *2���Լ�����һ����Ķ���
     *3�������ṩһ�������ķ�����������Ķ���
     */
    private Test39(){}
    
    private static Test39 instance;
    
    /**
     * ������Ķ���
     * @return
     */
    public static Test39 getInstance(){
    	if(instance==null)
    		instance = new Test39();
		
		return instance;
    }
    
    /**
     * ����Token
     * Token��Nv6RRuGEVvmGjB+jimI/gw==
     * @return
     */
    public String makeToken(){  //checkException
        //  7346734837483  834u938493493849384  43434384
    	
    	 Calendar rightNow = Calendar.getInstance();
    	String sTime= String.valueOf(Time.valueOf(String.valueOf(rightNow.get(11)) + ":" + String.valueOf(rightNow.get(12)) + ":" + String.valueOf(rightNow.get(13))));
    	 //String sDate = DateX.format(new java.util.Date());
       // String token = ("BE"+StringFunction+ new Random().nextInt(999999)) + "";
        return sTime; /* //����ָ��   128λ��   16���ֽ�  md5
        try {
            MessageDigest md = MessageDigest.getInstance("md5");
            byte md5[] =  md.digest(token.getBytes());
            //base64����--��������Ʊ��������ַ�   adfsdfsdfsf
            BASE64Encoder encoder = new BASE64Encoder();
            return encoder.encode(md5);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }*/
    }
}

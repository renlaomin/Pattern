package test;

public class Hb1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 	java.text.DecimalFormat df=new java.text.DecimalFormat("#.00");  
	   	String s=df.format(23.1234);
	   	double a =Double.parseDouble(s);
System.out.println("aaaaaaaaaaaaaaaaaaaa:"+a);
String sPhaseChoice="ͬ��123";
if(sPhaseChoice.startsWith("ͬ��"))
System.out.println(12334);
	   	System.out.println(s+"::::::"+df.format(23.1254666*100));
	   	
	   	
	   	
		String sss="����,���";
		String []s1 =sss.split(",");
		for (String string : s1) {
			System.out.println(string);
		}
String 	sCount="123";
		int i=Integer.valueOf(sCount);
		System.out.println(i-1);
		double sPersonRate=0.0;
		int iCount=2,iSum=3;
	   	System.out.println("iCount:"+iCount+";iSum:"+iSum+";"+(iSum>0));
	   	//��ȡ������ı���������100���������뱣��2λС��
	   	java.text.DecimalFormat df1=new java.text.DecimalFormat("#.00");
	   	if(iSum>0){
		   	System.out.println("sPersonRate0:"+iCount/1.0*iSum);

	   		sPersonRate=Double.parseDouble(df.format(Double.parseDouble(String.valueOf(iCount))/Double.parseDouble(String.valueOf(iSum))*100));
		   	System.out.println("sPersonRate1:"+sPersonRate);

	   	}
	   	
	   	i=0;
	   	i += i ;
	   	System.out.println(i+";"+(	i += i > 0 ? i++ : i --));
	   
	   	System.out.println(i);
	   	
	   	
	}

	

	
	
	
}

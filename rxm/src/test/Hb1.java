package test;

public class Hb1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 	java.text.DecimalFormat df=new java.text.DecimalFormat("#.00");  
	   	String s=df.format(23.1234);
	   	double a =Double.parseDouble(s);
System.out.println("aaaaaaaaaaaaaaaaaaaa:"+a);
String sPhaseChoice="同意123";
if(sPhaseChoice.startsWith("同意"))
System.out.println(12334);
	   	System.out.println(s+"::::::"+df.format(23.1254666*100));
	   	
	   	
	   	
		String sss="复议,否决";
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
	   	//获取算出来的比例，乘以100后四舍五入保留2位小数
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

package behavior;

public class Printer {
	public static void showMessage(Machine user, String message){
	      System.out.println(new java.util.Date().toString()
	         + " [" + user.getName() +"] : " + message);
	   }
}

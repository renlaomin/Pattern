package behavior;

public class EMailLogger extends Logger {
	   public EMailLogger(){
	   }
	   @Override
	   protected void log(String message) {    
	      System.out.println("EMail::Logger: " + message);
	   }
	}

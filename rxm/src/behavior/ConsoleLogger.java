package behavior;

public class ConsoleLogger extends Logger {
	   public ConsoleLogger(){
	   }
	   @Override
	   protected void log(String message) {    
	      System.out.println("Console::Logger: " + message);
	   }
	}

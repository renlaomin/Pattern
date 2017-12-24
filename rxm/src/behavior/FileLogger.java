package behavior;

public class FileLogger extends Logger {
	   public FileLogger(){
	   }
	   @Override
	   protected void log(String message) {    
	      System.out.println("File::Logger: " + message);
	   }
	}

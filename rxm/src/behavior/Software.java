package behavior;

public abstract class Software {
	 abstract void initialize();
	   abstract void start();
	   abstract void end();
	   //template method
	   public final void play(){
	      //initialize
	      initialize();
	      //start
	      start();
	      //end
	      end();
	   }
}

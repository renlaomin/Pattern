package behavior;

public class Main6 {
	public static void main(String[] args) {
	    Context context = new Context();

	    StartState startState = new StartState();
	    startState.doAction(context);

	    System.out.println(context.getState().toString());

	    PlayState playState = new PlayState();
	    playState.doAction(context);
	    System.out.println(context.getState().toString());

	    StopState stopState = new StopState();
	    stopState.doAction(context);

	    System.out.println(context.getState().toString());
	  }
}

package behavior;

public class Main3 {
	public static void main(String[] args) {
	      MyValue subject = new MyValue();

	      new FileObserver(subject);
	      new EmailObserver(subject);
	      new PrinterObserver(subject);

	      subject.setState(15);
	  
	      subject.setState(10);
	   }
}

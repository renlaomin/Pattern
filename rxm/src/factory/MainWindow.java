package factory;

public class MainWindow {
	private static MainWindow instance = new MainWindow();
	private MainWindow(){
	};
	  public static MainWindow getInstance(){
	      return instance;
	   }
		public void showMessage(){
		      System.out.println("Hello World!");
		   }
 
}

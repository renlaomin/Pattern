package factory;

public class Main2 {
	private static final Object[] String = null;
	private static Object name;

	public static void main(String[] args) {
	      //Get the only object available
	      MainWindow object = MainWindow.getInstance();

	      //show the message
	      object.showMessage();
for(int i=0;i<5;i++){
	
    MainWindow object1 = MainWindow.getInstance();
    System.out.println(object1.toString());
object1.showMessage();
}  

for(int m=0;m<5;m++){
	String string="object"+Integer.toString(m);
   System.out.println(string.toString()+";"+(Object) string.getClass());
}  


	   }
}

package adapter;

public class Main1 {
	 public static void main(String[] args) {
	      Shape redCircle = new Circle(100,100, 10, new ColorPrinter());
	      Shape blackCircle = new Circle(100,100, 10, new BlackPrinter());

	      redCircle.draw();
	      blackCircle.draw();
	   }
}

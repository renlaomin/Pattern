package factory;

public class Rectangle1  extends Shape1 {

	   public Rectangle1(){
	     type = "Rectangle";
	   }

	   @Override
	   public void draw() {
	      System.out.println("Inside Rectangle::draw() method.");
	   }
	}
	

package factory;

class Square1 extends Shape1 {

	   public Square1(){
	     type = "Square";
	   }

	   @Override
	   public void draw() {
	      System.out.println("Inside Square::draw() method.");
	   }
	}
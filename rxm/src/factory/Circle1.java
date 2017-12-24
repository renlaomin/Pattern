package factory;

class Circle1 extends Shape1 {

	   public Circle1(){
	     type = "Circle";
	   }

	   @Override
	   public void draw() {
	      System.out.println("Inside Circle::draw() method.");
	   }
	}


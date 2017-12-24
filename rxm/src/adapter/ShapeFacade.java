package adapter;

class ShapeFacade {
	  interface Shape {
	    void draw();
	  }
	  class Rectangle implements Shape {
	    @Override
	    public void draw() {
	      System.out.println("Rectangle::draw()");
	    }
	  }
	  class Square implements Shape {
	    @Override
	    public void draw() {
	      System.out.println("Square::draw()");
	    }
	  }
	  class Circle implements Shape {
	    @Override
	    public void draw() {
	      System.out.println("Circle::draw()");
	    }
	  }
	  private Shape circle = new Circle();
	  private Shape rectangle = new Rectangle();
	  private Shape square = new Square();

	  public ShapeFacade() {
	  }
	  public void drawCircle() {
	    circle.draw();
	  }
	  public void drawRectangle() {
	    rectangle.draw();
	  }
	  public void drawSquare() {
	    square.draw();
	  }
	}
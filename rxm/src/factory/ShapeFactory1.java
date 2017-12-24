package factory;

public class ShapeFactory1 extends  AbstractFactory {

	@Override
	public Printer getPrinter(String Type) {
		
	      return null;
	}

	@Override
	public Shape getShape(String shapeType) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				 if(shapeType == null){
			         return null;
			      }    
			      if(shapeType.equalsIgnoreCase("CIRCLE")){
			         return new Circle();
			      } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
			         return new Rectangle();
			      } else if(shapeType.equalsIgnoreCase("SQUARE")){
			         return new Square();
			      }	
	return null;		      
	}

}

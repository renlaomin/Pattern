package factory;

public class FactoryProducer {
	public static AbstractFactory getFactory(String choice){
	      if(choice.equalsIgnoreCase("SHAPE")){
	         return new ShapeFactory1();
	      } else if(choice.equalsIgnoreCase("Printer")){
	         return new PrinterFactory();
	      }
	      return null;
	   }
}

package factory;

public class Main4 {
	 public static void main(String[] args) {
	      ShapeProtoType1.loadCache();

	      Shape1 clonedShape = (Shape1) ShapeProtoType1.getShape("1");
	      System.out.println("Shape : " + clonedShape.getType());    

	      Shape1 clonedShape2 = (Shape1) ShapeProtoType1.getShape("2");
	      System.out.println("Shape : " + clonedShape2.getType());    

	      Shape1 clonedShape3 = (Shape1) ShapeProtoType1.getShape("3");
	      System.out.println("Shape : " + clonedShape3.getType());    
	   }
}

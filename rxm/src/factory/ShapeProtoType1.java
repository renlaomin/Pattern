package factory;

import java.util.Hashtable;

public class ShapeProtoType1 {
	 private static Hashtable<String, Shape1> shapeMap 
     = new Hashtable<String, Shape1>();

  public static Shape1 getShape(String shapeId) {
     Shape1 cachedShape = shapeMap.get(shapeId);
     return (Shape1) cachedShape.clone();
  }
  public static void loadCache() {
     Circle1 circle = new Circle1();
     circle.setId("1");
     shapeMap.put(circle.getId(),circle);

     Square1 square = new Square1();
     square.setId("2");
     shapeMap.put(square.getId(),square);

     Rectangle1 rectangle = new Rectangle1();
     rectangle.setId("3");
     shapeMap.put(rectangle.getId(),rectangle);
  }
}

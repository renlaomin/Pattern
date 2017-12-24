package adapter;

import java.util.ArrayList;
import java.util.List;

public class Employee1 {
	 private String name;
	   private String title;
	   private List<Employee1> subordinates;

	   public Employee1(String name,String title) {
	      this.name = name;
	      this.title = title;
	      subordinates = new ArrayList<Employee1>();
	   }

	   public void add(Employee1 e) {
	      subordinates.add(e);
	   }

	   public void remove(Employee1 e) {
	      subordinates.remove(e);
	   }

	   public List<Employee1> getSubordinates(){
	     return subordinates;
	   }

	   public String toString(){
	      return "Employee :[ Name : "+ name 
	      +", dept : "+ title +subordinates +" ]";
	   }   
}

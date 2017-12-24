package adapter;

public class Main3 {
	public static void main(String[] args) {
	      Employee1 CEO = new Employee1("John","CEO");

	      Employee1 headSales = new Employee1("Rob","Sales");

	      Employee1 headMarketing = new Employee1("Mike","Marketing");

	      Employee1 programmer1 = new Employee1("Lili","Programmer");
	      Employee1 programmer2 = new Employee1("Bob","Programmer");

	      Employee1 tester1 = new Employee1("Jack","Tester");
	      Employee1 tester2 = new Employee1("Tom","Tester");

	      CEO.add(headSales);
	      CEO.add(headMarketing);

	      headSales.add(tester1);
	      headSales.add(tester2);

	      headMarketing.add(programmer1);
	      headMarketing.add(programmer2);

	      //print all employees of the organization
	      System.out.println(CEO); 
	      for (Employee1 headEmployee : CEO.getSubordinates()) {
	         System.out.println(headEmployee);
	         for (Employee1 employee : headEmployee.getSubordinates()) {
	            System.out.println(employee);
	         }
	      }    
	   }
}

package adapter;

public class ConsolePrinter implements Printer2 {
	   private String fileName;

	   public ConsolePrinter(String fileName){
	      this.fileName = fileName;
	   }
	   @Override
	   public void print() {
	      System.out.println("Displaying " + fileName);
	   }
	}

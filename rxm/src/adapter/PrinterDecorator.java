package adapter;

abstract class PrinterDecorator implements Printer1 {
	   protected Printer1 decoratedPrinter;
	   public PrinterDecorator(Printer1 d){
	      this.decoratedPrinter = d;
	   }
	   public void print(){
	      decoratedPrinter.print();
	   }  
	}
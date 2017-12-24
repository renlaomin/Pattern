package adapter;

public class Main4 {
	public static void main(String[] args) {
	      Printer1 plasticPrinter = new PlasticPrinter1();
	      Printer1 plastic3DPrinter = new Printer3D(new PlasticPrinter1());
	      Printer1 paper3DPrinter = new Printer3D(new PaperPrinter1());
	      plasticPrinter.print();
	      plastic3DPrinter.print();
	      paper3DPrinter.print();
	   }
}

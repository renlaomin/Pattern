package behavior;

public class Main10 {
	 public static void main(String[] args) {

		    TreeNode computer = new TreeNode("w3cschool.cn");
		    computer.accept(new ConsoleVisitor());
		    computer.accept(new EmailVisitor());
		  }
}

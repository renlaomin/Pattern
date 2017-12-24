package behavior;

public class ConsoleVisitor implements NodeVisitor {
	  @Override
	  public void visit(TreeNode n) {
	    System.out.println("console:" + n.getName());
	  }

}

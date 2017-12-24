package behavior;

public class MathContext {
	private MathAlgorithm algorithm;

	   public MathContext(MathAlgorithm strategy){
	      this.algorithm = strategy;
	   }

	   public int execute(int num1, int num2){
	      return algorithm.calculate(num1, num2);
	   }
}

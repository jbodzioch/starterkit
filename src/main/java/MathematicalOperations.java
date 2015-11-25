/**
 * Created by ldrygala on 2015-11-20.
 */
public class MathematicalOperations {

	public int sum(int a, int b) {
		return a + b;
	}
	
	public int exponentiation(int value, int power){
		return (int) Math.pow(value, power);
	}
	
	public int subtraction(int minuend, int subtrahend) {
		return minuend - subtrahend;
	}
	
	public Integer calculateFactorial(int number) {
		Integer result = null;
		if (number < 0) {
			System.out.printf("%d is not a natural number", number);
		} else if (number == 0) {
			result = 1;
		}
		
		else {
			result = 1;
			for (int i = 1; i <= number; i++) {
				result *= i;
			}
		}
		
		return result;
	}
	
}

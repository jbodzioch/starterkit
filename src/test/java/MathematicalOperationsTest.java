import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Created by ldrygala on 2015-11-20.
 */
public class MathematicalOperationsTest {

	@Test
	public void testShouldReturnTwoWhenAddingOneAndOne() {
		// given
		MathematicalOperations sumOperation = new MathematicalOperations();
		// when
		int a = 1;
		int b = 1;
		int sumOperationResult = sumOperation.sum(a, b);
		// then
		assertEquals(2, sumOperationResult);

	}

	@Test
	public void testShouldReturnMinusTwoWhenAddingMinusOneAndMinusOne() {
		// given
		MathematicalOperations sumOperation = new MathematicalOperations();
		// when
		int a = -1;
		int b = -1;
		int sumOperationResult = sumOperation.sum(a, b);
		// then
		assertEquals(-2, sumOperationResult);
	}

	@Test
	public void testShouldReturnThreeWhenAddingThreeToZero() {
		// given
		MathematicalOperations sumOperation = new MathematicalOperations();
		// when
		int a = 3;
		int b = 0;
		int sumOperationResult = sumOperation.sum(a, b);
		// then
		assertEquals(3, sumOperationResult);
	}
}

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Created by ldrygala on 2015-11-20.
 */
public class MathematicalOperationsTest {

	@Test
	public void testShouldReturnTwoWhenAddindOneAndOne() {
		// given
		MathematicalOperations sumOperation = new MathematicalOperations();
		// when
		int a = 1;
		int b = 1;
		int sumOperationResult = sumOperation.sum(a, b);
		// then
		assertEquals(2, sumOperationResult);

	}
}

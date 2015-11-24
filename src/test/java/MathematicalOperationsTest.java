import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Created by ldrygala on 2015-11-20.
 */

public class MathematicalOperationsTest {
	
	@Test
	public void shouldReturnNullWhenSubtractNullAndNull() {
		// given
		MathematicalOperations subOperation = new MathematicalOperations();
		// when
		int subOperationResult = subOperation.subtraction(0,0);
		// then
		assertEquals(0, subOperationResult);
	}
	
	@Test
	public void shouldReturnEightWhenSubtractTenAndTwo() {
		// given
		MathematicalOperations subOperation = new MathematicalOperations();
		// when
		int subOperationResult = subOperation.subtraction(10,2);
		// then
		assertEquals(8, subOperationResult);
	}
	
	@Test
	public void shouldReturnNegativeFiveWhenSubtractNullAndFive() {
		// given
		MathematicalOperations subOperation = new MathematicalOperations();
		// when
		int subOperationResult = subOperation.subtraction(0,5);
		// then
		assertEquals(-5, subOperationResult);
	}
	
	@Test
	public void shouldReturnNegativeTwentyWhenSubtractNegativeTenAndTen() {
		// given
		MathematicalOperations subOperation = new MathematicalOperations();
		// when
		int subOperationResult = subOperation.subtraction(-10,10);
		// then
		assertEquals(-20, subOperationResult);
	}
	
}

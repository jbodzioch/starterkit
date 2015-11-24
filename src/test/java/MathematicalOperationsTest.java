import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Created by ldrygala on 2015-11-20.
 */

public class MathematicalOperationsTest {
	
	@Test
	public void shouldReturnNullWhenSubstractNullAndNull() {
		// given
		MathematicalOperations subOperation = new MathematicalOperations();
		// when
		int subOperationResult = subOperation.substraction(0,0);
		// then
		assertEquals(0, subOperationResult);
	}
	
	@Test
	public void shouldReturnEightWhenSubstractTenandTwo() {
		// given
		MathematicalOperations subOperation = new MathematicalOperations();
		// when
		int subOperationResult = subOperation.substraction(10,2);
		// then
		assertEquals(8, subOperationResult);
	}
	
	@Test
	public void shouldReturnNegativeFiveWhenSubstractNullAndFive() {
		// given
		MathematicalOperations subOperation = new MathematicalOperations();
		// when
		int subOperationResult = subOperation.substraction(0,5);
		// then
		assertEquals(-5, subOperationResult);
	}
	
	@Test
	public void shouldReturnNegativeTwentyWhenSubstractNegativeTenAndTen() {
		// given
		MathematicalOperations subOperation = new MathematicalOperations();
		// when
		int subOperationResult = subOperation.substraction(-10,10);
		// then
		assertEquals(-20, subOperationResult);
	}
	
}

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Created by ldrygala on 2015-11-20.
 */
public class MathematicalOperationsTest {
	
	MathematicalOperations math = new MathematicalOperations();

	@Test
	public void shouldReturn1ForAnyPositiveValueAnd0Power() {

		int randomValue = (int) (Math.random() * 100000);
		int power = 0;

		int expected = 1;
		int actual = math.exponentiation(randomValue, power);

		assertEquals(expected, actual);

	}

	@Test
	public void shouldReturn0For0ValueAndAnyPowerGreaterThenOne() {

		int value = 0;
		int randomPower = (int) (Math.random() * 100000 + 1);

		int expected = 0;
		int actual = math.exponentiation(value, randomPower);

		assertEquals(expected, actual);

	}

	@Test
	public void shouldReturnSameValueForAnyPositiveValueAnd1Power() {

		int randomValue = (int) (Math.random() * 100000);
		int power = 1;

		int expected = randomValue;
		int actual = math.exponentiation(randomValue, power);

		assertEquals(expected, actual);

	}

	@Test
	public void shouldReturn4For2ValueAnd2Power() {

		int value = 2;
		int power = 2;

		int expected = 4;
		int actual = math.exponentiation(value, power);

		assertEquals(expected, actual);

	}

	@Test
	public void shouldReturn27For3ValueAnd3Power() {

		int value = 3;
		int power = 3;

		int expected = 27;
		int actual = math.exponentiation(value, power);

		assertEquals(expected, actual);

	}

	@Test
	public void shouldReturn81For3ValueAnd4Power() {

		int value = 3;
		int power = 4;

		int expected = 81;
		int actual = math.exponentiation(value, power);

		assertEquals(expected, actual);

	}

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

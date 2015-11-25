import static org.junit.Assert.assertEquals;

import java.util.Random;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;
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
	@Test
	public void shouldReturnNullForNotNaturalNumber() {
		//given
		Integer expectedResult = null;
		Integer number = -1;
		MathematicalOperations calculator = new MathematicalOperations();
		//when
		Integer result = calculator.calculateFactorial(number);
		//then
		assertEquals(expectedResult, result);
	}
	@Test
	public void shouldReturn1For0() {
		//given
		Integer expectedResult = 1;
		Integer number = 0;
		MathematicalOperations calculator = new MathematicalOperations();
		//when
		Integer result = calculator.calculateFactorial(number);
		//then
		assertEquals(expectedResult, result);
	}
	@Test
	public void shouldReturn1For1() {
		//given
		Integer expectedResult = 1;
		Integer number = 1;
		MathematicalOperations calculator = new MathematicalOperations();
		//when
		Integer result = calculator.calculateFactorial(number);
		//then
		assertEquals(expectedResult, result);
	}
	@Test
	public void shouldReturn720For6() {
		//given
		Integer expectedResult = 720;
		Integer number = 6;
		MathematicalOperations calculator = new MathematicalOperations();
		//when
		Integer result = calculator.calculateFactorial(number);
		//then
		assertEquals(expectedResult, result);
	}
	
	
	
	@Test
	public void shouldReturn3000000000WhenMultiplying1000By3000000() {
		//given
		//when
		long result = math.multiplyIntegers(1000, 3000000);
		//then
		assertThat(result).isEqualTo(3000000000L);
	}
	
	@Test
	public void shouldReturnNegative64WhenMultiplying4ByNegative16() {
		//given
		//when
		long result = math.multiplyIntegers(4, -16);
		//then
		assertThat(result).isEqualTo(-64L);
	}
	
	@Test
	public void shouldReturn0WhenMultiplyingAnyNumberBy0() {
		//given
		Random randomGenerator = new Random();
		int firstFactor = randomGenerator.nextInt();
		//when
		long result = math.multiplyIntegers(firstFactor, 0);
		//then
		assertThat(result).isEqualTo(0L);
	}
	
	@Test
	public void shouldReturnMultiplicandWhenMultiplyingAnyNumberBy1() {
		//given
		Random randomGenerator = new Random();
		int firstFactor = randomGenerator.nextInt();
		//when
		long result = math.multiplyIntegers(firstFactor, 1);
		//then
		assertThat(result).isEqualTo((long)firstFactor);
	}
	
	@Test
	public void shouldReturnTheSameResultWhenMultiplyingInReverseOrder() {
		//given
		Random randomGenerator = new Random();
		int firstFactor = randomGenerator.nextInt();
		int secondFactor = randomGenerator.nextInt();;
		//when
		long result = math.multiplyIntegers(firstFactor, secondFactor);
		long inverseResult = math.multiplyIntegers(secondFactor, firstFactor);
		//then
		assertThat(result).isEqualTo(inverseResult);
	}
	
	@Test
	public void shouldReturnInverseOfNumberWhenMultiplyingNumberByNegative1() {
		//given
		Random randomGenerator = new Random();
		int firstFactor = randomGenerator.nextInt();
		//when
		long result = math.multiplyIntegers(firstFactor, -1);
		//then
		assertThat(result).isEqualTo(-(long)firstFactor);
	}

}

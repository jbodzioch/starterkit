import org.apache.commons.math3.complex.Complex;
import org.apache.commons.math3.random.GaussianRandomGenerator;
import org.apache.commons.math3.random.JDKRandomGenerator;
import org.apache.commons.math3.random.RandomGenerator;

public class ComplexNumbers {

	public Complex generateRandomComplexNumber() {
		RandomGenerator rGenerator = new JDKRandomGenerator();

		rGenerator.setSeed(1583056);
		GaussianRandomGenerator randomRealPart = new GaussianRandomGenerator(rGenerator);

		rGenerator.setSeed(767096);
		GaussianRandomGenerator randomImaginaryPart = new GaussianRandomGenerator(rGenerator);

		Complex newComplexNumber = new Complex(randomRealPart.nextNormalizedDouble(),
				randomImaginaryPart.nextNormalizedDouble());

		return newComplexNumber;
	}

}

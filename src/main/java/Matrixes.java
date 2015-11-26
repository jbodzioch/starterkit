import org.ejml.data.FixedMatrix3x3_64F;

public class Matrixes {
	
	FixedMatrix3x3_64F singleMatrix = new FixedMatrix3x3_64F();
			
	public double getDeterminantOf3x3Matrix(){
		
		double firstTerm= singleMatrix.a11*(singleMatrix.a22*singleMatrix.a33 - singleMatrix.a23*singleMatrix.a32);
		double secondTerm = singleMatrix.a12*(singleMatrix.a21*singleMatrix.a33 - singleMatrix.a23*singleMatrix.a31);
		double thirdTerm = singleMatrix.a13*(singleMatrix.a21*singleMatrix.a32 - singleMatrix.a22*singleMatrix.a31);
		
		return firstTerm - secondTerm  + thirdTerm ;
	}
}

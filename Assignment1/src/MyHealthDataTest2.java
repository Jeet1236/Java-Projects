import static org.junit.Assert.*;

import org.junit.Test;

/**
* This class tests the getBMI() method of the MyHealthData class
* 
* The expected and actual output are considered to be equal if they both have the difference 0.001 or less than that
* 
* <pre>Student name: Jeet Patel </pre> 
* <pre>Student number : 041060909 </pre>
* <pre>Class: CST8284</pre>
* <pre>Professor: Fedor Ilitchev</pre>
* <pre>Date: November 06, 2022</pre>
* @author Jeet Patel
* @version 11.0.15
*/
public class MyHealthDataTest2 {
	private static final double EPSILON = 1E-3;
	
	/**
	 * This method tests the BMI.
	 */
	@Test
	public void testGetBMI() {
		MyHealthData myHealthData = new MyHealthData();
		myHealthData.setHeight(85);
		myHealthData.setWeight(100);
		double expectedBMI = 9.73;
		double actualBMI = myHealthData.getBMI();
		assertEquals("The expected BMI and actual BMI are not the same",expectedBMI,actualBMI,EPSILON);
	}

}


import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class YourPurchasesTest2 {

	private static final double EPSILON = 1E-12;
	
    
	
	/*
	 * Tests Created by Jeet Patel
	 * This method tests whether the receivePayment() method is the working or not
	 * result: It works correctly so there is no error associated with this method
	 */
	 @Test
	public void testReceivePayment(){
		  YourPurchases test1 = new YourPurchases();
	      test1.receivePayment(5,0,0,0,0);
	      double ExpectedPayment = 5.0;
	      Assert.assertEquals(ExpectedPayment,test1.getPayment(),EPSILON);
	      

	}
	
	 
	 
	 /*
	  * This method checks whether the testRecordPurchase is working or not
	  * result: It works correctly so there is no error in this method
	  */
	 @Test
	 public void testRecordPurchase() {
		  YourPurchases test2 = new YourPurchases();
		  test2.recordPurchase(1.5);
		  double actualPurchase = test2.getPurchase();
		  double expectedPurchase = 1.5;
		  Assert.assertEquals(expectedPurchase, actualPurchase,EPSILON);

	 }
	 
	 /*
	  * This method tests whether the calculateChange() method is working perfectly or not
	  * result: This method has error
	  */
		@Test
		public void testCalculateChange() {
			YourPurchases test3 = new YourPurchases();
			test3.recordPurchase(1.5);
			test3.receivePayment(5, 0, 0, 0, 0);
			double changeResult = test3.CalculateChange();
			double expected = 3.50;
		    Assert.assertEquals(expected, changeResult, EPSILON);
			
		}
	
}

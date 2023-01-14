
/**
 * 
 * This class tests the SalesAgent and the class SalesSupervisor. 
 * toString()method of SalesAgent will print the name and age.
 * toString() method of
 * SalesSupervisor class print the name,age and the location.
 * 
 * <pre>
 * Student name: Jeet Patel
 * </pre>
 * 
 * <pre>
 *  Student number : 041060909
 * </pre>
 * 
 * <pre>
 * Class: CST8284
 * </pre>
 * 
 * <pre>
 * Professor: Fedor Ilitchev
 * </pre>
 * 
 * <pre>
 * Date: November 15, 2022
 * </pre>
 * 
 * 
 * 
 * @author Jeet Patel
 * @version 11.0.15
 */

public class SalesAgentTest {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SalesAgent salesAgent = new SalesAgent("Andrew", 20);
		System.out.println(salesAgent.toString());

		SalesSupervisor salesSupervisor = new SalesSupervisor("James", 26, "Toronto");
		System.out.println(salesSupervisor.toString());
	}
}
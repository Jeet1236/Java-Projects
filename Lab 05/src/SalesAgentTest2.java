/**
 * 
 * This program is the second test for the SalesAgent class including the
 * subclasses. toString() method of SalesAgent class print the name and age of
 * the agent. toString() method of SalesSupervisor class print the name,age and
 * the location. toString() method of SalesChief class print the
 * name,age,location and department.
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
 * @author Jeet Patel
 * @version 11.0.15
 * 
 */
public class SalesAgentTest2 {
	public static void main(String[] args) {

		SalesAgent salesAgent = new SalesAgent("Peter", 56);
		System.out.println(salesAgent.toString());

		SalesAgent salesAgent2 = new SalesAgent("John", 48);
		System.out.println(salesAgent2.toString());

		SalesSupervisor salesSupervisor = new SalesSupervisor("Ifeoma", 53, "Toronto");
		System.out.println(salesSupervisor.toString());

		SalesChief salesChief = new SalesChief("Jeet Patel", 20, "Ottawa", "sales");
		System.out.println(salesChief.toString());

	}
}
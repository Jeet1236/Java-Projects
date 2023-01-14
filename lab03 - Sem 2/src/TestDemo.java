import java.util.Scanner;
//package studentlab;

/**
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
 * Date: October 07, 2022
 * </pre>
 */

/**
 * WELCOME TO LAB 3!
 * The essence of this lab is to work with constructors and to show overloaded constructor calls.
 * It demonstrates chaining overloaded constructors using "this" keyword.
 * It helps to consolidate understanding of the chaining rules learned in the theory class
 * This program also displays a good example of writing comments in your code using the Javadoc style.  
 */

/**
 * This is the driver class for this program. This means that it just runs the
 * application with a method main.
 * 
 * @author Jeet Patel
 * @version 11.0.15
 */
public class TestDemo {

	/**
	 * This is the entry point for the application, it instantiates 4 EventSchedule
	 * objects to show-case the constructors. Anonymous objects are used and each
	 * one is only retained long enough to call method create report on each. No
	 * variable names were used, just new Constructor().methodCall().
	 * 
	 * @param args Command line arguments are not used by this program.
	 */

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the year of Event");
		int inputYear = input.nextInt();

		System.out.println("Enter the Month of Event");
		int inputMonth = input.nextInt();

		System.out.println("Enter the day of the Event");
		int inputDay = input.nextInt();

		/*
		 * Instatiating 4 objects named EventSchedule1,
		 * EventSchedule2,EventSchedule3,EventSchedule4 from the same class and
		 * different constructors
		 * 
		 */

		System.out.println("EventSchedule1");
		EventSchedule EventSchedule1 = new EventSchedule();
		System.out.println("EventSchedule(int,int,int) was called");
		System.out.println("EventSchedule() was called");
		System.out.println(EventSchedule1.createReport());

		System.out.println("EventSchedule2");
		EventSchedule EventSchedule2 = new EventSchedule(inputYear);
		System.out.println("EventSchedule(int,int,int) was called");
		System.out.println("EventSchedule(int) was called");
		System.out.println(EventSchedule2.createReport());

		System.out.println("EventSchedule3");
		EventSchedule EventSchedule3 = new EventSchedule(inputYear, inputMonth);
		System.out.println("EventSchedule(int,int,int) was called");
		System.out.println("EventSchedule(int,int) was called");
		System.out.println(EventSchedule3.createReport());

		System.out.println("EventSchedule4");
		EventSchedule EventSchedule4 = new EventSchedule(inputYear, inputMonth, inputDay);
		System.out.println("EventSchedule(int,int,int) was called");
		System.out.println(EventSchedule4.createReport());

	}

}

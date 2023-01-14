
import java.util.Scanner;

/**
 * This class takes the input from the user and instantiates MyHealthData object and print the report 
 * <pre>Student name: Jeet Patel </pre> 
 * <pre>Student number : 041060909 </pre>
 * <pre>Class: CST8284</pre>
 * <pre>Professor: Fedor Ilitchev</pre>
 * <pre>Date: November 06, 2022</pre>
 * @author Jeet Patel
 * @version 11.0.15
 */



public class MyHealthDataTest {

	public static void main(String[] args) {
		 
		 // Declaring the variables to store the input of the users
		 String firstName;
		 String lastName;
	     String gender;
	     int birthYear;
		 int currentYear;
		 double height;
		 double weight;
		
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter First Name: ");
		firstName= input.nextLine();
		
		System.out.println("Enter Last Name: ");
		lastName= input.nextLine();
		
		System.out.println("Enter Gender: ");
		gender = input.nextLine();
		
		System.out.println("Enter Birth Year: ");
		birthYear = input.nextInt();
		
		System.out.println("Enter current Year: ");
		currentYear =input.nextInt();
		
		System.out.println("Enter Height(inches): ");
		height = input.nextDouble();
		
		System.out.println("Enter Weight(pounds): ");
		weight = input.nextDouble();
		
		
		
		// Instantiating MyHealthData with the entered inputs as the parameters
		MyHealthData healthData = new MyHealthData(firstName,lastName,gender,birthYear,currentYear,height,weight);
		
		// Printing the health report of the patient
		healthData.displayMyHealthData();

		
	}

}

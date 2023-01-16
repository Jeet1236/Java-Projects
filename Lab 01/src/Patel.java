
import java.time.LocalDate; 
import java.time.temporal.ChronoUnit;
import java.time.Month;
import  java.util.Calendar;
import java.util.Scanner;


/**
 * This class takes the student number,student name and two reasons for joining the course from the user
 * if the student number is odd then one is subtracted from the remaining weeks for the course from current date
 * and it is shown as output
 * If the student number is even then one is added to the remaining month of the current year and shown as the output
 * <pre>Student name: Jeet Patel </pre> 
 * <pre> Student number : 041060909 </pre>
 * <pre>Class: CST8284</pre>
 * <pre>Professor: Fedor Ilitchev</pre>
 * <pre>Date: Sept. 12, 2022</pre>
 * @author Jeet Patel
 * @version 11.0.15
 *
 */
// importing various packages




public class Patel {
	 
 /**  This method gives the output according to the student number being odd or even
 * @param args arguments passed from command line
 */
	public static void main(String[] args) {

  
         int studentNumber;
         String studentName;
         String firstReason;
         String secondReason;
         
   
         LocalDate courseEndDate = LocalDate.of(2024, 6, 30); 
  		 LocalDate currentDate = LocalDate.now();

 	
  	   	 Calendar cal = Calendar.getInstance();

  
         System.out.println("Input your student Number");
         studentNumber = inputInteger();
        
   
         System.out.println("Enter your name:");
         studentName = inputString();
  
         System.out.println("Enter two reasons for taking this course");
         System.out.println("Enter first reason for choosing this course");
         firstReason = inputString();
         
         System.out.println("Enter first reason for choosing this course");
         secondReason = inputString();
         
/** if the student number is even then below condition is implemented
*/   
         if (studentNumber%2==0) {
             int differenceOfMonth = 12 - cal.get(Calendar.MONTH);
             System.out.println("Answer: "+differenceOfMonth);
         }

/** if the number is odd then below condition is implemented
*/   
         else {
     		long diffInDays = ChronoUnit.DAYS.between(currentDate, courseEndDate); 
     		long Finalweeks = (diffInDays / 7)-1;
         	System.out.println("Answer: "+Finalweeks);	
         }
		
}
	

	/**
	 * This method is used to take input of string from the user and return it
	 * @return Returns the string entered
	 */
    public static String inputString() {
   	 Scanner input = new Scanner(System.in);
   	 String inputStorage;
   	 return inputStorage = input.nextLine();
   	 
	}
    
    /**
     * This method is used to take input of integer from the user and return that input
     * @return Returns the integer entered 
     */
    public static int inputInteger() {
   	 Scanner input = new Scanner(System.in);
   	 int integerStorage;
   	 integerStorage = input.nextInt();
   	 input.nextLine();
   	 return integerStorage;
    }
	

}

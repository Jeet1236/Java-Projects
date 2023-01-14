
/**
 * This class contains two arrays. These arrays are then merged into a linkedList array. This class contains
 * various methods to delte,sort,remove duplicates etc. for this linked array and the outputs are then shown
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
 * Date: 7th December, 2022
 * </pre>
 * 
 * @author Jeet Patel
 * @version 11.0.15
 */

import java.util.*;
public class CarBrandsList {

    /**
    * @param args - commans line argument
    * This method calls the methods which delete, sort, remove duplicates and convert to uppercases.
    */
    public static void main(String[] args) {

	LinkedList<String> list1 = new LinkedList<>();
	LinkedList<String> list2 = new LinkedList<>();
  
    String[] rides = {"cardillac", "toyota", "suzuki", "chevrolet", "hyundai",  "mercedies", "keke"};
   	String[] rides2 = {"volvo", "subaru", "volkswagen", "nissan", "cardillac", "toyota", "honda"};
   	 
    // Adding the arrays to LinkedList array
    for(int i=0;i<rides.length;i++){
      list1.addLast(rides[i]);
      list2.addLast(rides2[i]);
    }
   
   System.out.printf("The list is: \n");
   list1.addAll(list2);
   printList(list1);
   System.out.println("");

   System.out.printf("This is showing the Car Brands in uppercase letters...\r\n");
   toUpperCase(list1);
 
   System.out.printf("%nDeleting car brands 5 to 7...\n");
   deleteItems(list1);
   
   System.out.printf("%nHere is the current list of car brands...\n");
   printList(list1);

   System.out.printf("%nReversed List:\n");
   printReversedList(list1);

   System.out.printf("%nSorted car brands in alphabetical order...\n");
   sortList(list1);

   System.out.printf("%nRemoving duplicate car brands...\n");
   System.out.printf("Non-duplicates are:");
   removeDuplicate(list1);
   
   printIterator(list1);
  
} 

  	/**
  	 * @param LinkedList<String> list
  	 * This method prints the linked list of the passed array
  	 * 
  	 * */
	public static void printList(LinkedList<String> list1){
		printIterator(list1);
	}
	/**
	 * @param LinkedList<String> list
	 * This method converts all the array elements to upper case
	 * */
	public static void toUpperCase(LinkedList<String> list1) {
		list1.replaceAll(String::toUpperCase);
		printIterator(list1);
	}
	/**
	 * @param LinkedList<String> list
	 * This method removes all the duplicate elements from the passed array
	 * */
	public static void removeDuplicate(LinkedList<String> list1) {	
		for(int x=0;x<list1.size();x++) {
			for(int y=0;y<list1.size();y++) {
				if(list1.get(x).equals(list1.get(y)) && x!=y) {
					list1.remove(y);
					x=0;
					y=0;
				}
			}
		}
	}
	/**
	 * @param LinkedList<String> list
	 * This method removes 5,6,7th elements and prints the output
	 * */
	public static void deleteItems(LinkedList<String> list1) {
		list1.subList(5, 8).clear();	
		printIterator(list1);
	}

	/**
	 * @param LinkedList<String> list
	 * This method reverses the order of the elements of array and print the output
	 * */
   public static void printReversedList(LinkedList<String> list1) {
	   Collections.reverse(list1);
	   printIterator(list1);
   }
   /**
	 * @param LinkedList<String> list
	 * This method sorts the list alphabetically and prints the output
	 * */
   public static void sortList(LinkedList<String> list1) {
	   Collections.sort(list1);
	   printIterator(list1);
   }
   /**
	 * @param LinkedList<String> list
	 * This method prints the array element in a single line
	 * */
   public static void printIterator(LinkedList<String> list1) {
	   ListIterator iterator = list1.listIterator();
	   while(iterator.hasNext()){
		   System.out.printf("%s ",iterator.next() );
			}
	   System.out.println("");
   }
}



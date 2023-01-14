import java.util.Scanner;
import java.util.ArrayList;

/**
 * this class RecipeManager inherits all properties from RecipeTemplate and used in main mathos to call the method run
 */

public class RecipeManager extends RecipeTemplate {
    /**
     * method run has all the main list such as menu
     */
    void run(){
        int menu;
        int enteredBread = 0;
        ArrayList<Integer> choice = new ArrayList<>();
        ArrayList<Integer> bread = new ArrayList<>();

        
        Scanner sc = new Scanner(System.in);
        /**
         * do while loop is used to run the program till user enter 4 (to exit)
         */
        do {
            System.out.println("Please select one of the following options:");
            System.out.println("1. Show available recipes.");
            System.out.println("2. Create Shopping List.");
            System.out.println("3. Print Shopping List.");
            System.out.println("4. Quit Program.");
            System.out.println("0. to reprint this menu.");
            System.out.println("Please enter your choice:");

            menu = sc.nextInt();
/**
 * Using the conditional statements if-else
 * 1 for menu
 */
            if (menu == 1) {
                System.out.println("Available Recipes:");
                System.out.println("1. Banh mi tay");
                System.out.println("2. Brioche");
                System.out.println("3. Challah");
                System.out.println("4. Generic White Loaf");
                System.out.println("5. Gyeren-ppang");
                System.out.println("6. Naan");
                System.out.println("7. Pita");
/**
 * 3 for create the shopping list
 */

            } else if (menu == 2) {
                System.out.print("Which bread would you like? ");
                int enteredChoice = sc.nextInt();
                if(choice.contains(enteredChoice)) {
                      
                	 System.out.print("How much bread would you like to have ");
                	 enteredBread = enteredBread + sc.nextInt();
                	 bread.set(choice.indexOf(enteredChoice),enteredBread);
                }
                else {
                	 System.out.print("How much bread would you like to have ");
                	 int x =  sc.nextInt();
                		choice.add(enteredChoice);
                		bread.add(x);
            }
             
               
               

            }
            /**
             * 3 for the list all the shopping list
             */
            else if (menu==3) {
            	for(int i=0;i<choice.size();i++) {
            	System.out.format("%d %s. ",choice.get(i),super.names[choice.get(i)]);
            	}
            	
            	
            }
            /**
             * 4 is used to quit the program
             */
             else if (menu == 4) {
                System.out.println("Quit");
            }
            /**
             * 0 is to reprint the whole program
             */
            
            else if (menu == 0) {

            }
            /**
             * anything else will be consider invalid
             * user will have another chance to enter the right and valid input
             */

            else {
                System.out.println("Please enter valid number ");
            }

        } while (!(menu == 4));
        //4 is to exit from the loop
    }
}

/**
 * this class call the method from RecipeManager and uses exception handling to mange the invalid output to prevent the program from crashes
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab5 {
    public static void main(String[] args) {
//creating the new object from RecipeManager name cm to calll the main method
        RecipeManager cm= new RecipeManager();

        System.out.println("Welcome to Meet recipe manager");
        /**
         * try ctach to hadle the input mismatch execption
         */
       try {
         cm.run();


       }catch (InputMismatchException e){
           /**
            * catching the input mistach error
            */
           System.out.println("Please input numerics value");
           e.getMessage();
            cm.run();
       }
       catch (ArithmeticException e){
           /**
            * catching the arthemetic expection
            */
           System.out.println("Unknown input!!!");
           e.getMessage();
           cm.run();
       }
       //to hadle the all type of exception
       catch (Exception e){
           System.out.println("Invalid Input");
           cm.run();
       }
       finally {
         cm.run();
       }
        System.out.println("This bread recipe manager by Meet Kotadiya");


    }
}

/**
 * a program that compares integers to 10
 *
 * @author J. Parish
 * @since 6/29/21
 */

import java.util.Scanner; // Because, Greg.

public class Compare {

  public static void main (String[] args) {

    compareNum();
    System.out.print("\nProgram finished!\n");
}

 // ========== INSERT YOUR CODE HERE ==========
 public static void compareNum(){
    //instatiate variables
    final int comp = 10;
    Scanner sc = new Scanner(System.in);
    
    // request user input
    System.out.println("Enter an integer:");
    int pick = sc.nextInt();

    //output comparison
    if(pick == comp){
      System.out.print("The number " + pick + " is NOT GREATER than " + comp + ".");
    }if( pick > comp ){
      System.out.print("The number " + pick + " is GREATER than " + comp + ".");
    } else if (pick < comp){
      System.out.print("The number " + pick + " is NOT GREATER than " + comp + ".");
    }
    // ===========================================
    
  }
}

// =============== LAB SUMMARY ===============

/*
1. What was the hardest part of this lab?
Debugging syntax errors.


2. What will you always remember (never forget) from this exercise?
How hilarious it is that syntax errors are constantly by biggest hiccup.


*/

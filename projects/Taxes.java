/**
 * Takes yearly income and returns taxes owed then displays results based on tax bracket.
 *
 * @author Student Name
 * @since Date Started
 */

    // Write methods that:
    //  - takes the yearly income and returns the income bracket
    //  - takes the yearly income and returns the amount of federal taxes owed
    //  - display results
import java.util.*;

public class Taxes{
  public static void main(String[] args){


    // ========== INSERT YOUR CODE HERE ==========
      //request input
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your yearly income:");
      double income = sc.nextDouble();

      //calculate money owed
      double owed1 = income * .15;

      //Round owed to nearest cent
      double owed = owed1 * 100;
      owed = Math.round(owed)/100.0;

      //method list
      moneyOwed(income);//calculate money owed
      roundOwed(owed,owed1);// round owed to nearest cent
      bracketCalc(income, owed);// decide which bracket
  }

  public static double moneyOwed(double income){
    //calculate money owed
    double owed1 = income * .15;
    return owed1;
  }

  public static double roundOwed(double owed, double owed1){
    owed = Math.round(owed)/100.0;
    return owed;

  }
   public static void bracketCalc(double income, double owed){
    //decide which bracket
      if (income < 50000){
        System.out.println("\nIncome Bracket 1");
        System.out.print("You owe $" + owed + " in Federal taxes.\n");
      }else if(income >= 50000 && income < 99999.99){
        System.out.println("\nIncome Bracket 2");
        System.out.println("You owe $" + owed + " in Federal taxes.\n");
      } else if (income >= 100000){
        System.out.println("\nIncome Bracket 3");
        System.out.println("You owe $" + owed + " in Federal taxes.\n");
      }
    }
   // ===========================================

  
}






// =============== LAB SUMMARY ===============

/*
1. What was the hardest part of this lab?
Figuring out a process that works for testing.


2. What will you always remember (never forget) from this exercise?
that certain variables must be declared in the main method before they can be called.

*/

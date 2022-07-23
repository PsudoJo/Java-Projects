/**
 * A program to calculate and print based on user input
 *
 * @author J. Parish
 * @since  6/24/21
 */
 
import java.util.Scanner;

public class CoinStar {

        public static void main(String[] args) {

                coins(); // the method to read info, calculate, print
                

        }
        
        // the method to read info, calculate, print
        public static void coins() {

    // ========== INSERT YOUR CODE HERE ==========
    // init scanner and set double
    final double PERCENT = .20;
    Scanner scanner = new Scanner(System.in);


    //get input from user as integer
    System.out.println("How many pennies did you insert?");
    int pennies = scanner.nextInt();

    //deposit
    System.out.println("You have deposited $" + pennies * .01);

    //calculate processing fee with input multiplied by constant
    double fee = pennies * PERCENT ;
    System.out.println("The processing fee is: $" + fee * .01);

    //calculate receipt with subtracting fee from pennies
    double receipt = pennies - fee;
    System.out.println("You earned $" + receipt * .01 );

scanner.close();
    
    
    
    // ===========================================            

        }
}







// =============== LAB SUMMARY ===============

/*
1. What was the hardest part of this lab?

Debugging


2. What will you always remember (never forget) from this exercise?

How i really thought my math was wrong when all my bugs were simple typos

*/

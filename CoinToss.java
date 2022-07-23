/**
 * Use the random class and user input to simulate flipping a coin.
 *
 * @author J. Parish
 * @since 6/29/21
 */

import java.util.*;

public class CoinToss {

	public static void main(String[] args) {
		
		headsOrTails(); // the computer simulates flipping a coin 
						// and the user guesses the result

	}
	
	// In this method, the computer simulates flipping a coin.
	// The user guesses the result, and the computer reports if they are correct.
	
	// The computer will use 0 to represent "heads" and 1 to represent "tails"
	// on the coin toss.
	
	public static void headsOrTails(){


		// computer randomly picks a number 0 or 1
		int flip = (int)(Math.random()*2);
		
        // ========== INSERT YOUR CODE HERE ==========

		// Create scanner & point it at keyboard input
		Scanner sc = new Scanner(System.in);

		//request user input
		System.out.print("0 is heads and 1 is tails.");
		System.out.println("What is your guess (0 or 1)?");
		int pick = sc.nextInt();
        
		// extra space
		System.out.println();

        //print computer's guess
        System.out.println("The computer got " + flip + ".");

        // resonse loop
        if (pick == flip){
        	System.out.println("You guessed right!");
        }	else {
        	System.out.println("Sorry, try again next time!");
        }
        
        
        
        
        
        
        
        
        // ===========================================

	}

}

// =============== LAB SUMMARY ===============

/*
1. What was the hardest part of this lab?
remebering to debug before I submit & avoiding Syntax errors.


2. What will you always remember (never forget) from this exercise?
The feeling of getting better at programming, all the work i've put in till this point
served as an amazing reference


*/

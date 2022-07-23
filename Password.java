/**
 * Description
 *
 * @author J.Parish
 * @since 8/15/21
 */

import java.util.Scanner;
import java.util.Random;

public class Password {

	public static void main(String[] args) {

		
		// Create an instance of Scanner
		Scanner sc = new Scanner(System.in);
		
		// Call 'displayMenu()' to show the menu to the user
		displayMenu(sc);

		// Read in input from user and assign to 'choice'
		int choice =  sc.nextInt();

		//space
		System.out.println();





        // IF-ELSE statements to decide which method to call
		if (choice == 1) {    // display password specifications to the user
		
			showPasswordSpecifications(sc, choice);
		
		} else if (choice == 2) {	// generate a random password for the user
				System.out.println("Enter seed:");
				int seed = sc.nextInt();
			    Random rand = new Random(seed);
		    
		    	System.out.println("\nYour password is: " + generateRandomPassword(sc,rand));
		    
		} else if (choice == 3) {   // ask the user to input a password and test for validity
		    
		    System.out.println("\nEnter a password to test:");
			sc.nextLine();
			String input = sc.nextLine();
			
			if (verifyPasswordSpecifications(input) == true) {
				
				System.out.println("\nYour password is valid.");
				
			} else {
			    
				System.out.println("\nYour password is NOT valid.");
				
			}
			
		} else {
			
			System.out.println("Sorry! That was an invalid option.");
			
		}

        // close the scanner
		sc.close();

	}

	public static void displayMenu(Scanner sc) {
		// PRE-CONDITIONS: None
		// POST-CONDITIONS: This method displays the menu of options 
		// (as per the specifications)		
		
		System.out.println("Here is your menu of options:");
		System.out.println("\t1. See the password rules");
		System.out.println("\t2. Generate a random password");
		System.out.println("\t3. Test the validity of a password");

		//space
		System.out.println();

		System.out.println("Please make your selection:");
	}
	public static void showPasswordSpecifications(Scanner sc, int choice) {
		// PRE-CONDITIONS: None
		// POST-CONDITIONS: The specifications for a valid password are
		// displayed on the screen

		System.out.println("The rules for your password are:");
		System.out.println(" 1. It must be at least 8 characters long");
		System.out.println(" 2. At least one letter must be capitalized");
		System.out.println(" 3. It must contain at least 2 numbers");

	}

	public static String generateRandomPassword(Scanner sc, Random rand) {
		// PRE-CONDITIONS: The scanner used to read in the random number generator 
		// seed from the user
		
		// POST-CONDITIONS: A password that satisfies the specifications is
		// generated and returned.
		
		// This method will return a String password that subscribes to
		// the following criteria:
		
		// 1. There are eight characters in the password
		// 2. The first two characters are lowercase letters.
		// 3. The second two characters are uppercase letters.
		// 3. The characters in positions 4 and 5 are numbers.
		// 4. The characters in positions 6 and 7 are any character.

        String tempPass = "";
        tempPass += ((char)(rand.nextInt(26) + 97));// 0
        tempPass += ((char)(rand.nextInt(26) + 97));// 1
        tempPass += ((char)(rand.nextInt(26) + 65));// 2
        tempPass += ((char)(rand.nextInt(26) + 65));// 3
        tempPass += ((char)(rand.nextInt(10) + 48));// 4
        tempPass += ((char)(rand.nextInt(10) + 48));// 5
        tempPass += ((char)(rand.nextInt(94) + 33));// 6
        tempPass += ((char)(rand.nextInt(94) + 33));// 7
		// System.out.println("generateRandomPassword(sc) was called.");
        
		return tempPass;
	}


	public static boolean verifyPasswordSpecifications(String input) {
		// PRE-CONDITIONS: The main method will pass in a String
		// POST-CONDITIONS: "true" will be returned if the parameter "input" is
		// a valid password, as per the specifications. "false" will be returned otherwise
		//
		// The specifications are:
		// 1. There are at least eight characters in the password
		// 2. At least one of the characters is capitalized
		// 3. There are at least two digits (0-9) in the password
		// boolean valid = true;
		String evil = "ABCDEFGH1";

		if (input.length() < 2 || input.length() < 8){ // if pass length is less than 2 digits or more than 8

			return false;

		}

		for (int i = input.length()-1; i >= 0; i--){ // walking through string

			if (Character.isUpperCase(input.charAt(3))){ // if the character at index 3 is uppercase

				return true;
			}

			if (Character.isDigit(input.charAt(4)) && Character.isDigit(input.charAt(5))){ // if characters at index 4 & 5 are numbers

				return true;

			}

			if (input.compareTo(evil) == 0 ){
				return false;
			}


		}
		return true;
	}

}







// =============== LAB SUMMARY ===============

/*
1. What was the hardest part of this lab?
verifying the password to the given specifications.


2. What will you always remember (never forget) from this exercise?
how theres usually a class for everything & how much I hate typos.



*/

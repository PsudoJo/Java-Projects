	/**
 * Generate Random bytes from user input
 *
 * @author J. Parish
 * @since 6/24/21
 */
 

import java.util.*;//imports every class , only using Random and Scanner


public class RandomChars {
	public static void main(String[] args) {


       makeRandoms(); // ask the user for a seed and make all the random things
       //System.out.println(" \nMission Accomplished");
     }
	
	// this method asks the user for a seed for the random number generator and 
	// then generates a random uppercase char, lowercase char, digit char
	public static void makeRandoms() {

    // ========== INSERT YOUR CODE HERE ==========

	// Tell scanner to check for keyboard input
	Scanner scanner = new Scanner(System.in);
	//Random  rand = new Random();

	// request int from user
	System.out.println("Enter a seed for the random number generator: ");
	int pick = scanner.nextInt();
	Random rand = new Random(pick);

	//Title
	System.out.println("RANDOM: ");

	// generate random uppercase
	System.out.print("Uppercase = ");
	System.out.println( (char)(rand.nextInt(26) + 65) );

	//generate random lowercase
	System.out.print("Lowercase = ");
	System.out.println( (char)(rand.nextInt(26) + 97) );

	// Random digit
	System.out.println("Digit:" + rand.nextInt(10));



    
    

    
    
    
    scanner.close();
    // ===========================================        
    
	
	
	}
        

}








// =============== LAB SUMMARY ===============

/*
1. What was the hardest part of this lab?

1)Figuring out the usage for the random class of the java.util package

2) realizing that i could cast (char) to use the random integer output of the random generator to generate
ascii values

3)finding the proper math equations to generate Uppercase and Lowecase ascii values

2. What will you always remember (never forget) from this exercise?

1) CHECK FOR LESSONS THAT APPLY BEFORE I TRY hahaha
2) using the lowest value of my desired ascii range as the value * rand.nextInt(26) * and concatenating it
with the highest value in my desired ascii range * + 97 * is the way to generate characters in the range
i want randomly
3)pseudo random characters are the enemy


*/

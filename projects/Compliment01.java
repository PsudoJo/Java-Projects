/**
 * Give user compliment if they want it and
 *  print "Game Over" at the end regardless
 *
 * @author J. Parish
 * @since 6/20/21
 */

import java.util.Scanner;
public class Compliment01 {
    public static void main (String[] args) {
    Compliment01();
    System.out.println("Game over");
}
// ========== INSERT YOUR CODE HERE ==========

public static void Compliment01(){
    // scan for input
    Scanner sc = new Scanner(System.in);
    //Print request from user
    System.out.println("Would you like a compliment (\"1\" for Yes and \"2\" for No )? ");
    // read input assign variable
    int ans = sc.nextInt();
    //response loop
    if (ans == 1){
        System.out.println("You are a Genius !!");
    } else {

    }

}
    
    
    
    // ===========================================        


}






// =============== LAB SUMMARY ===============

/*
1. What was the hardest part of this lab?

Figuring out that i had to use the Int data type

instead of fumbling with the String class.


2. What will you always remember (never forget) from this exercise?

The sweet satisfaction of an error-free compile.


*/

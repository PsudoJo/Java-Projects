/**
 * a program that decides what a donator gets in return for contribution
 *
 * @author J.Parish
 * @since 7/8/21
 */

import java.util.Scanner;

public class KickStarter {
    public static void main (String[] args) {
 

    // ========== INSERT YOUR CODE HERE ==========
    kickStartyFarty(); //calling the method
    //System.out.print("\nMission Accomplished\n");
}
public static void kickStartyFarty(){
    //greeting
    System.out.println("Welcome to Kickstarter!");
    System.out.println();

    //scan for keyboard input
    Scanner sc = new Scanner(System.in);
    //request input
    System.out.println("How much would you like to contribute to the \'Cones of Dunshire\' project?");
    int ans = sc.nextInt();
    String reward = "";
    System.out.println();


    //falling through technique / switch statement
    switch (ans) {
        case 150: reward += "You will receive the \'Cone of Dunshire\' hat.\n";
        case 100: reward += "You will receive the Founders Edition of the tabletop version of \'Cones of Dunshire\'.\n";
        case 50: reward += "You will receive a copy of the tabletop version of \'Cones of Dunshire\'.\n";
        case 20: reward += "You will receive a copy of the mobile app version of \'Cones of Dunshire\'.\n";
        case 5: reward += "You will have your name put on a list of backers on our website.\n";
        case 1: reward += "You will receive a thank-you email.\n";
        break;
        default: reward = "\nYou did not enter a valid amount\n";
    }
    System.out.println(reward);

    System.out.println();

    System.out.println("Thanks for backing \'Cones of Dunshire\'.");
 }
    

    
    
    
    
    // ===========================================      


}










/*
1. What was the hardest part of this lab?
nothing really , working through the reading material first played a major part



2. What will you always remember (never forget) from this exercise?
the feeling of knowing exactly what to do !!

*/

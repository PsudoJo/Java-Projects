/**
 * Gather 12 words or phrases from user to make a story
 *
 * @author J. Parish
 * @since 6/23/21
 */

import java.util.Scanner;

public class MadLibs {
    public static void main (String[] args) {
        madness();
}
public static void madness(){
    // ========== INSERT YOUR CODE HERE ==========
    // watch for input
    Scanner scanner = new Scanner(System.in);

    //request input
    System.out.println("Enter a proper noun");//specific who or where
    // assign input as variable
    String pn1 = scanner.nextLine();

    System.out.println("Enter a proper noun");
    String pn2 = scanner.nextLine();

    System.out.println("Enter an adjective");//describes who where or what
    String adj1 = scanner.nextLine();

    System.out.println("Enter a verb");// action, running jumpin moving
    String v1 = scanner.nextLine();

    System.out.println("Enter an adverb"); //describe how I ran jumped or moved
    String adv1 = scanner.nextLine();

    System.out.println("Enter a noun"); // who where or what
    String n1 = scanner.nextLine();

    System.out.println("Enter a proper noun");
    String pn3 = scanner.nextLine();

    System.out.println("Enter a proper noun");
    String pn4 = scanner.nextLine();

    System.out.println("Enter an adjective");
    String adj2 = scanner.nextLine();

    System.out.println("Enter a verb");
    String v2 = scanner.nextLine();

    System.out.println("Enter an adverb");
    String adv2 = scanner.nextLine();

    System.out.println("Enter a noun");
    String n2 = scanner.nextLine();

    System.out.println("Enter a verb");
    String v3 = scanner.nextLine();


    //Story Time!!
    System.out.println();

    System.out.println("Story Time!!");
    System.out.println();

    System.out.println( pn1 + " is my what they call me " + "and I had the craziest dream about " + pn2 + ".");
    System.out.println("I didn't know them well, very " + adj1 + " person, " + "especially when they were " + v1 + ".");
    System.out.println(pn3 + " was there to. " + "Quite " + adj2 + " person if im being honest." );
    System.out.println("I saw them " + v3 + " one time and it blew my mind. They did it so " + adv1 + ".");
    System.out.println(pn4 + " couldn't believe it either, funny how they made it there as well");
    System.out.println("We were all " + v2 + " so " + adv2 + " next thing I knew was at the " + n2 + ".");
    System.out.println("Then I just woke up, weirdest dream ever man.");



    // ===========================================


    }

}






// =============== LAB SUMMARY ===============

/*
1. What was the hardest part of this lab?
Aside from 1 typo making my code explode, making a list
and checking it twice played a major part in making this easy & fun.



2. What will you always remember (never forget) from this exercise?
How vulgar and hilarious the original was



*/

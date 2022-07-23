/**
 * A program that uses String methods to output positions of characters
 *
 * @author J.Parish
 * @since 6/26/21
 */

import java.util.Scanner;

public class StringLab01 {
    public static void main (String[] args) {

        stringLab();
        // System.out.println("\nMission Accomplished");

    }

    public static void stringLab() {

    // ========== INSERT YOUR CODE HERE ==========
    // tell scanner to look for keyboard input
    Scanner sc = new Scanner(System.in);

    //Request phrase
    System.out.println("Please enter a phrase:");
    String ph = sc.nextLine();

    System.out.println();

    //request character to search for and store it in char variable type
    System.out.println("Please enter a character to search for:");
    char pick = sc.nextLine().charAt(0);

    System.out.println();

    //print length of string
    System.out.println("The length of your String is " + (ph.length()) + ".");

    //print character in 0 index
    System.out.println("The character in the first position is " + "'" + ph.charAt(0) + "'" + ".");

    // print character in last index using given phrase
    System.out.println("The character in the last position is " + "'" + ph.charAt(ph.length() - 1) + "'" + ".");


    //print first occurrence of given character
    System.out.println("The first occurrence of " + "'" + pick + "'" + " is in position " + (ph.indexOf(pick)+1) + ".");



    // ===========================================

    }
}






// =============== LAB SUMMARY ===============

/*
1. What was the hardest part of this lab?
Finding the proper usage of the methods


2. What will you always remember (never forget) from this exercise?
How to find specific characters in a string from a user



*/

/**
 * Description
 *
 * @author J.Parish
 * @since 6/2/21
 */

import java.util.Scanner;
public class InchesToFeet{
    public static void main (String[] args) {
        // Where the magic is happening 
        convert();
    }
//asks user for input to convert 
public static void convert(){
    //scanner to read input from user 
    Scanner scanner = new Scanner(System.in);
    
    //Prompt user and store input in 'totalInches'
    System.out.println("Enter the number of inches:");
    int totalInches = scanner.nextInt();

    //convert feet to inches and remainder
    int inchestoFeet = totalInches / 12;
    int remainder = totalInches % 12;
    
    //print inches converted to feet and remainder
    System.out.print(totalInches + " inches is " + inchestoFeet);
    System.out.print(" feet, and " + remainder + " inches");

    
    scanner.close();



   }
    
}


// =============== LAB SUMMARY ===============

/*
1. What was the hardest part of this lab?

Figuring out modulus


2. What will you always remember (never forget) from this exercise?

How simple concatenation makes life


*/

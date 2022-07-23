/**
 * a String test based on user input
 *
 * @author J.Parish
 * @since 7/10/21
 */

import java.util.Scanner;

public class StringLab02 {
    
    public static void main (String[] args) {
    	
    	stringMethod();  // do all the String things
    }
    
    // this method does all the String things
    public static void stringMethod()
    {
        
        Scanner sc = new Scanner(System.in);

    // ========== INSERT YOUR CODE HERE ==========
    
    //request string input
    System.out.println("Please enter a phrase:");
    String ph = sc.nextLine();
    //space
    System.out.println();

    
    //print menu
    System.out.println("1. Find the length of the string");
    System.out.println("2. Perfom charAt");
    System.out.println("3. Perform equals");
    System.out.println("4. Perform compareTo");
    System.out.println("5. Perfom indexOf");
    System.out.println("6. Perform substring");
    System.out.println("7. Perform toLowerCase");
    System.out.println("8. Perform toUpperCase");

    //space
    System.out.println();

    //request menu selection
    System.out.println("Please make a selection:");
    int sel = sc.nextInt();

    //space
    System.out.println();

    //loop
    if (sel == 1){
        //print length of string
        System.out.println("The length of the phrase is " + (ph.length()));

    } else if (sel == 2 ){
        //print string range
        System.out.println("Enter a number between 0 and " + (ph.length()-1) + ":");
        int pick1 = sc.nextInt();
        //space
        System.out.println();
        //print charAt selected range
        System.out.println("The character at index " + pick1 + " is " + "\'" + ph.charAt(pick1) + "\'");

    } else if (sel == 3){
        //force scanner to keep reading
        sc.nextLine();
        // input request
        System.out.println("Enter a phrase that will be compared with " + "\"" + ph + "\"" + ":");
        String ph2 = sc.nextLine();
        //space
        System.out.println();
        //response loop
        if (ph.equals(ph2)){
            System.out.println("The two phrases DO have the same sequence of characters.");
        }else{
            System.out.println("The two phrases DO NOT have the same sequence of characters.");
        }

    }else if (sel == 4){
        //force scanner to keep reading
        sc.nextLine();
        //input request
        System.out.println("Enter a phrase that will be compared with " + "\"" + ph + "\"" + ":");
        String ph3 = sc.nextLine();
        //space
        System.out.println();
        //response loop
        if (ph.compareTo(ph3) == 0 ){
            System.out.println("The two phrases are equivalent.");
        }else if (ph.compareTo(ph3) > 0){
            System.out.println("Alphabetically, " + "\""+ ph + "\"" + " comes after " + "\"" + ph3 + "\"");
        }else {
            System.out.println("Alphabetically, " + "\""+ ph + "\"" + " comes before " + "\"" + ph3 + "\"");
        }

    }else if (sel == 5){
        //force scanner to keep reading
        sc.nextLine();
        //input request
        System.out.println("Enter a String to search " + "\"" + ph + "\"" + " for:");
        String ph4 = sc.nextLine();
        //int dex = ((char)(ph.indexOf(ph4)+1));
        //space
        System.out.println();
        //response loop
        if (ph.contains(ph4)){
            System.out.println("The first occurrence of " + "\"" + ph4 + "\"" + " is at index " + ph.indexOf(ph4));
        }else{
            System.out.println("\"" + ph4 + "\"" + " is not in the phrase " + "\"" + ph + "\"");
        }

   }else if (sel == 6){
        //force scanner to keep reading
        sc.nextLine();

        //input option menu
        System.out.println("Choose one of the methods:");
        System.out.println("1. Create a substring from a selected index until the end");
        System.out.println("2. Create a substring from a selected index until another selected index");
        //space
        System.out.println();
        //input request
        System.out.println("Enter selection:");
        int pick2 = sc.nextInt();
        //space
        System.out.println();
        //if 1 is picked
        if (pick2 == 1){
            System.out.println("Which index (between 0 and " + (ph.length()-1) + ")" + " would you like to start with?");
            int pick3 = sc.nextInt();
            //space
            System.out.println();
            System.out.println("The new phrase is: " + "\"" + ph.substring(pick3) + "\"");
        //if 2 is picked
        }else if (pick2 == 2){
            System.out.println("Which index (between 0 and " + (ph.length()-1) + ")" + " would you like to start with?");
            int pick4 = sc.nextInt();
            //space
            System.out.println();

            System.out.println("Which index (between " + pick4 + " and " + (ph.length()-1) + ")" + " would you like to end with?");
            int pick5 = sc.nextInt();
            //space
            System.out.println();
            System.out.println("The new phrase is: " + "\"" + ph.substring(pick4 , pick5) + "\"");
        }
   }else if (sel == 7){
        //force scanner to keep reading
        //sc.nextLine();
        //print phrase lowercase
        System.out.println("All lowercase looks like this: " + "\"" + ph.toLowerCase() + "\"");
   }else if (sel == 8 ){
        //force scanner to keep reading
        //sc.nextLine();
        System.out.println("All uppercase looks like this: " + "\"" + ph.toUpperCase() + "\"");
   }else {
    System.out.println("Not a valid number!");
   }
    
    
    
    // ===========================================		


        sc.close();
        
    }
    
}








// =============== LAB SUMMARY ===============

/*
1. What was the hardest part of this lab?
Typing it all out, but it was fun

2. What will you always remember (never forget) from this exercise?
the feeling of not needing to consult a teacher, actually being able to look at the documentation and understand it & feeling like i have a superpower.



*/

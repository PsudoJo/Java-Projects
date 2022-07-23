/**
 * A Password generator that adds characters to given input 
 *
 * @author J.Parish
 * @since 6/25/21
 */
 
import java.util.*;
//import java.util.Random;

public class SaltPassword {
    public static void main (String[] args) {
        
      saltIt();
      //System.out.println("Mission Accomplished");
    }
    
    public static void saltIt() {
    
    // ========== INSERT YOUR CODE HERE ==========
    
    //scan for user input from keyboard
      Scanner sc = new Scanner(System.in);

      //request seed
      System.out.println("Enter seed:");
      int pick = sc.nextInt();
      Random rand = new Random(pick);

      //force scanner to keep reading
      sc.nextLine();

      //request unsalted pass
      // System.out.println("Enter a password:");
      // String pass = sc.nextLine();
      //String pass = sc.nextLine();



      // print salt
      System.out.print("Salt: ");
      String salt = "";
      salt += ((char)(rand.nextInt(26) + 97));
      salt += ((char)(rand.nextInt(26) + 97));
      salt += ((char)(rand.nextInt(26) + 65));
      salt += ((char)(rand.nextInt(26) + 65));
      salt += ((char)(rand.nextInt(10) + 48));
      salt += ((char)(rand.nextInt(10) + 48));
      salt += ((char)(rand.nextInt(94) + 33));
      salt += ((char)(rand.nextInt(94) + 33));
      // System.out.println(salt);


      //Print Salted password
      System.out.print("Salted password: "+ salt+ "\n");
      if(Character.isDigit(salt.charAt(4))){
        System.out.print(salt.charAt(5));
        }


    
    sc.close();
    // ===========================================        
    
    }
}






// =============== LAB SUMMARY ===============

/*
1. What was the hardest part of this lab?

1) Generating 5 characters of salt from random ascii characters 
2) Finding the proper range , java math is NOT my strong suit.
3) Finding a way to concatenate int data types to String variables 

2. What will you always remember (never forget) from this exercise?

When i finally got that first uppercase Y , & i knew i was on the right track.
A£s well as how fast my typing has gotten from hammering away at this daily.



*/

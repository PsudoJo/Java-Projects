/**
 * Description
 *
 * @author J. Parish
 * @since 8/9/21
 */
// You will need a switch statement

// You will also need to include at least 11 methods (displayMenu() and
// methods to handle each choice from the switch statement).

import java.util.Scanner;
import java.util.Random;

public class SciCalc {
    
    public static void main (String[] args) {
        
        System.out.println("=======================");
        System.out.println("        SCICALC");
        System.out.println("=======================");
        System.out.println();
		
        // ========== INSERT YOUR CODE HERE ==========
        //TO DO LIST
        //maybe print entire menu in the main method and pass output to display method
        // maybe print entire menu in the display menu method and call method somehow based on pick

        Scanner sc = new Scanner(System.in);

        //request input
        System.out.println("Enter the first number:");
        int n1 = sc.nextInt();
        System.out.println("Enter the second number:");
        int n2 = sc.nextInt();
        // System.out.println("Please choose from the following menu:");
        // int p1 = sc.nextInt();
        // String p2 = "";





		displayMenu(sc,n1,n2); //take no parameters and returns nothing
        add(n1,n2);// take two int types and return sum
        sub(n1,n2);// take two int types and return difference
        mult(n1,n2);//take two int types, multiply, return product
        div(n1,n2);// take two int, divide, return quotient in order they are passed
        mod(n1,n2); // take two int, calculate modulous, return result, in order they are passed
        pow(n1,n2); // take two int, find power of first using second
        hailed(n1);//take one int and return number using hailstone sequence
        hailed2(n2);//take one int and return number using hailstone sequence
        hyp(n1,n2); //take two int, use them as lenth of two legs ,return length of hypotenuse
        max(n1,n2);//take two int and return larget of the two
        // min(n1,n2); // take two int and return smallest of the two

}
    public static void displayMenu(Scanner sc, int n1, int n2){

        //print menu
        System.out.println("Please choose from the following menu:");
        System.out.println("\t1. Add two numbers");
        System.out.println("\t2. Subtract two numbers");
        System.out.println("\t3. Multiply two numbers");
        System.out.println("\t4. Divide two numbers");
        System.out.println("\t5. Mod two numbers");
        System.out.println("\t6. Exponentiate two numbers");
        System.out.println("\t7. Find next Hailstone numbers for each of the two numbers");
        System.out.println("\t8. Find the hypotenuse using two numbers as legs of a right triangle");
        System.out.println("\t9. Find the largest of the two numbers");
        System.out.println("\t10. Find the smallest of the two numbers");
        System.out.println("Please select a function:");
        //switch loop that uses user selection
        int p1 = sc.nextInt();
        //Space
        System.out.println();
        String p2 = "";

        switch(p1){
            case 1: p2 += "The result of " + n1 + " + "  + n2 + " is " + add(n1,n2);
                break;
            case 2: p2 += "The result of " + n1 + " - " + n2 + " is " + sub(n1,n2);
                break;
            case 3: p2 += "The result of " + n1 + " * " + n2 + " is " + mult(n1,n2);
                break;
            case 4: p2 += "The result of " + n1 + " / " + n2 + " is " + div(n1,n2);
                break;
            case 5: p2 += "The result of " + n1 + " % " + n2 + " is " + mod(n1,n2);
                break;
            case 6: p2 += "The result of " + n1 + " ^ " + n2 + " is " + pow(n1,n2);
                break;
            case 7: p2 +="The result of " + n1 + " hailed is " + hailed(n1) + " and the result of " + n2 + " hailed is " + hailed2(n2);
                break;
            case 8: p2 += "The hypotenuse of a right triangle with legs " + n1 + " and " + n2 + " is " + hyp(n1,n2);
                break;
            case 9: p2 += "The largest number of " + n1 + " and " + n2 + " is " + max(n1,n2);
                break;
            case 10: p2 +="The smallest number of " + n1 + " and " + n2 + " is " + min(n1,n2);
                break;
            default: p2 = "You did not enter a valid choice.\n";
        }

System.out.println(p2);
//Space
System.out.println();
System.out.println("Thank you for using =====SCICALC===== ");

    }

public static int add(int n1 , int n2){
    int sum = n1 + n2;
    return sum;
    }
public static int sub(int n1, int n2){
    int difference = n1 - n2;
    return difference;
    }
public static int mult(int n1, int n2){
    int product = n1 * n2;
    return product;
    }
public static double div(int n1, int n2){
    double quotient = n1 / n2;
    return quotient;
    }
public static int mod(int n1, int n2){
    int equivalence = n1 % n2;
    return equivalence;
    }
public static double pow(int n1, int n2){
    double powerOf = (double)(Math.pow(n1, n2));
    return powerOf;
    }
public static int hailed(int n1){
    int hailed1 = 0 ;
    // String ans = " ";
        if ( n1 % 2 == 0){
            hailed1 = n1 / 2;
            // System.out.println("The result of " + n1 + " hailed is " + hailed1);
            // ans = "The result of " + n1 + " hailed is " + hailed1;
        }else if (n1 % 2 != 0){
             hailed1 = n1 * 3 + 1;
             //ans = "The result of " + n1 + " hailed is " + hailed1;
             // System.out.println("The result of " + n1 + " hailed is " + hailed1);
        }
         // System.out.println(ans);
         return hailed1;
    }
public static int hailed2(int n2){
    int hailed2 = 0 ;
        if ( n2 % 2 == 0){
        hailed2 = n2 / 2;
        // System.out.println("The result of " + n1 + " hailed is " + hailed1);
        // ans = "The result of " + n1 + " hailed is " + hailed1;
        }else if (n2 % 2 != 0){
         hailed2 = n2 * 3 + 1;
         //ans = "The result of " + n1 + " hailed is " + hailed1;
         // System.out.println("The result of " + n1 + " hailed is " + hailed1);
        }
         // System.out.println(ans);
         return hailed2;
}
public static double hyp(int n1, int n2){
    double ans = (double)(Math.sqrt(Math.pow(n1,2) + Math.pow(n2,2)));
    return ans;
    }
public static int max(int n1, int n2){
    int ans = Math.max(n1, n2);
    return ans;
    }
public static int min(int n1, int n2){
    int ans = Math.min(n1, n2);
    return ans;
    }

}








// =============== LAB SUMMARY ===============

/*
1. What was the hardest part of this lab?




2. What will you always remember (never forget) from this exercise?




*/

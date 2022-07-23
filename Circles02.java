 /**
 * A program that
 * - gets radius from user
 * - calculates the circumference and area using radius
 * - rounds area to whole number
 *
 * @author J. Parish
 * @since 6/17/21
 */
 
import java.util.Scanner;

public class Circles02 {

    public static void main(String[] args) {

        circleMath(); // get input, compute, output
        // System.out.print("Mission Accomplished");

    }
    
    // this method asks for a radius, calculates the circumference and area,
    // and prints
    
    public static void circleMath() {
        
        // instantiate a new Scanner
    Scanner sc = new Scanner(System.in);
        
    // prompt the user for a number
        System.out.println("Radius:");
        
    // store the input from the user in 'radius'
        double radius = sc.nextDouble();
        
    // ========== INSERT YOUR CODE HERE ==========
    
    // calculate circumference 
        double circumference = 2 * Math.PI * radius;
        System.out.println("CIRCUMFERENCE = " + circumference);

    // calculate area 
        double radius1 = Math.pow(radius , 2);
        double radius2 = radius1 * Math.PI;
        System.out.println("AREA = " + radius2);
        
    // round area using trunication
        long area = (int)Math.round(radius2);
        System.out.println("ROUNDED AREA = " + area);
    
    
    
    // ===========================================        
    
    // close the scanner
        sc.close();
        
    }

}



// =============== LAB SUMMARY ===============

/*
1. What was the hardest part of this lab?
dropping the decimal point in the rounded area


2. What will you always remember (never forget) from this exercise?
the feeling of getting it right


*/

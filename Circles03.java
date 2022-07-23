/**
 * CALCULATES CIRCUMFERENCE , AREA, AND ROUNDS AREA USING METHODS
 *
 * @author J. Parish
 * @since 7/16
 */
    // You should have methods to:
    //  - Calculate the circumference
    //  - Calculate the area
    //  - Calculate the rounded area

 import java.util.*;

    public class Circles03 {



    // static Scanner sc = new Scanner(System.in);
    // static double radius = sc.nextDouble();

    // ========== INSERT YOUR CODE HERE ==========
    public static void main(String[] args) {

        //instantiate scanner
        Scanner sc = new Scanner(System.in);
        // request input
        System.out.println("Radius: ");
        // instantiate variable for passing as parameter
        double radius = sc.nextDouble();

        //instatiate variables
       // String f1 = "";



        // calculate circumference
        double circumference = 2 * Math.PI * radius;

       //calculate area
     // double radius2 = radius1 * Math.PI;


        //Method list
        System.out.println( "CIRCUMFERENCE = " + circumferenceCalc(radius)); // Method to calculate circumference
        System.out.println("AREA = " + areaCalc(radius)); // method to calculate area
        System.out.println("ROUNDED AREA = " + roundedCalc(radius)); // Method to round area
        //findings(f1, circumference);// output to display results

        //System.out.print("\n Mission Accomplished \n");
        // String f1 = System.out.println("CIRCUMFERENCE = " + circumference);
  }




    public static double circumferenceCalc(double r){
        // calculate circumference
        double circumference = 2 * Math.PI * r;
        return circumference;
    }



    public static double areaCalc(double r){

        //calculate area using radius
        double radius1 = Math.pow(r, 2);
        double radius2 = radius1 * Math.PI;
       //System.out.println("AREA = " + radius2);


        return radius2;
    }

    public static int roundedCalc(double r){
        // some code to calculate rounded area
        double radius1 = Math.pow(r, 2);
        double radius2 = radius1 * Math.PI;
        int area = (int)Math.round(radius2);
        return area;


    }

    // public static void findings(String f1, double circumference){
    //     // some code to output results

    //   System.out.println( f1 += "CIRCUMFERENCE = " + circumference);

    // }


    
    
    
    
    // ===========================================        

}







// =============== LAB SUMMARY ===============

/*
1. What was the hardest part of this lab?

getting the output correct


2. What will you always remember (never forget) from this exercise?

how annoying methods and passing variables between methods are


*/

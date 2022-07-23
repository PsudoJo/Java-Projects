/*
J. Parish
6/5/21
*/
import java.util.Scanner;
public class TriangleArea {
    public static void main (String[] args) {
        findArea();// get number from user and output area 
    }

    //get numbers from user, find area of the triangle 
     public static void findArea(){ 
        Scanner scanner = new Scanner(System.in);
        
        //get 'height' from user & store input in variable 
        System.out.println("Enter the height:");
        int height = scanner.nextInt();
    
        // get 'base' from user and store input in variable
        System.out.println("Enter the base:");
        System.out.println("");
        int base = scanner.nextInt();
        
        //Find area of triangle 
        double Area = .5 * base * height;
        System.out.print("The area of the triangle is ");
        System.out.println(Area);
         
     }   
}


// =============== LAB SUMMARY ===============

/*
1. What was the hardest part of this lab?
Converting the formula into a format that could be understood by java


2. What will you always remember (never forget) from this exercise?
The feeling of figuring it out.



*/

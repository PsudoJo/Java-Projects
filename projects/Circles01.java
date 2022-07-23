/* A program that finds the area of a circle
J.Parish
6/15/21
*/

import java.util.Scanner;
public class Circles01{
    public static void main (String[] args) {
        // Calling the circleArea() method
            circleArea();
     }

    public static void circleArea(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Radius: ");
        double radius = scanner.nextDouble();
    
    
    System.out.println();
        
        

        double radius1 = Math.pow(radius , 2);
        double radius2 = radius1 * 3.14;
        System.out.print("AREA = ");
        System.out.print(radius2);
        
        
        
    }
    
}

/*
1. What was the hardest part of this lab?
Finding out about Math.Pow



2. What will you always remember (never forget) from this exercise?
the sweet feeling of a clean error free compile.


*/

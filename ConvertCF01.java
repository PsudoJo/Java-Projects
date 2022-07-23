/*
J. Parish
6/2/21
*/

import java.util.Scanner;
public class ConvertCF01{
    public static void main (String[] args) {
        //calling convert method 
        convert();
    }

    public static void convert(){
        //Scan for user input
        Scanner scanner = new Scanner(System.in);
            //prompt user for temp
        System.out.println("Enter a temperature in Celsius: ");
        //Read and store user input as 'celsius'
            int celsius = scanner.nextInt();
        //convert celsius to Farenheit
            double fahrenheit = celsius * 9.0/5 + 32;
        //print out converted value 
            System.out.print(celsius);
            System.out.print(" degrees Celsius is ");
            System.out.print(fahrenheit);
            System.out.print(" degrees Fahrenheit.");
        
        } 
    }

/*
Get Celsius from user and convert to Fahrenheit
J. Parish
6/2/21
*/

import java.util.Scanner;
public class ConvertCF02{
    public static void main (String[] args) {
        //calling convert method 
        convert();

    }

    public static void convert(){
        //Scan for user input
        Scanner scanner = new Scanner(System.in);
            //prompt user for temp
        System.out.println("Temperature: ");
        //Read and store user input as 'celsius'
            double celsius = scanner.nextDouble();
        //convert celsius to Farenheit
            double fahrenheit = celsius * 1.8 + 32;

        //print out converted value 
        System.out.println(" In Fahrenheit, the temperature is " + fahrenheit);
        
        } 
    }


// =============== LAB SUMMARY ===============

/*
1. What was the hardest part of this lab?
Figuring out that the nextDouble(); method can convert int data types into double data types
but NEVER the other way around



2. What will you always remember (never forget) from this exercise?
How disrespectful bugs can be



*/


import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class arrayTest {
    public static void main (String[] args) {
        
        // instantiate a Scanner object
        Scanner sc = new Scanner(System.in);
        
        // get input from user for a seed for the RNG
        System.out.println("seed:");
        int seed = sc.nextInt();
        
        // get input from user for the size of the array
        System.out.println("length:");
        int size = sc.nextInt();
        System.out.println();
        
        // instantiate a RNG with the seed
        Random rand = new Random(seed);
        
        
    
        
        // STEP 1: Create an array of size 'size'
        int[] arr = new int[size];

        
        //Display the array - DONE
        displayArray(arr);
        // displayArrayBackwards(arr,rand);
        arrayDemo01();
        
        
    }
    
public static void arrayDemo01() {

        // System.out.println("DEBUG: 'arrayDemo()'");

        int[] grades = new int[15];

        grades[0] = 100;
        grades[1] = 90;
        grades[2] = 55;
        grades[3] = 83;
        grades[4] = 38;
        grades[5] = 0;
        grades[6] = 34;
        grades[7] = 101;
        grades[8] = 100;
        grades[9] = 93;
        grades[10] = 76;
        grades[11] = 99;
        grades[12] = 66;
        grades[13] = 76;
        grades[14] = 77;
        // grades[15] = 88;

        System.out.println("Your grades are: " + grades);
        System.out.println();

        for (int i = 0; i < grades.length; i++) {
            System.out.println("Grade " + i + ": " + grades[i]);
            }

        }
     // public static void displayArrayBackwards(int [] arr, Random rand){
     //     for (int i = arr.length - 1  ; i > 0 ; i--) {
     //        System.out.print(arr[i] + " ");
     //    }

     //    System.out.println(arr[0]);

     // }


}

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class ArrayBackwards {
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
        
        
        // INSERT YOUR CODE HERE
        
        // STEP 1: Create an array of size 'size'
        int[] arr = new int[size];
        
        // STEP 2: Iterate through the array and insert a random 
        //         number between 1 and 100
       // int[] randarr = new int[101];
        
        // STEP 3: Display the array - DONE
        displayArray(arr,rand);
        displayArrayBackwards(arr,rand);
        
        // STEP 4: Display the array backwards

        // Array BEFORE shift: 28 70 88 91 41 74 29 50 85 65 
        // Array AFTER shift:  65 85 50 29 74 41 91 88 70 28
        
    }
    
    public static void displayArray(int[] arr , Random rand){
    
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100) + 1;
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

        
     public static void displayArrayBackwards(int [] arr, Random rand){
         for (int i = arr.length - 1 ; i > 0; i--) {
            System.out.print(arr[i] + " ");
        }

        System.out.println(arr[0]);

     }


}

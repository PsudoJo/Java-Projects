import java.util.Scanner;
import java.util.Random;


public class ArrayShiftRight {
    public static void main (String[] args) {
        
        // instantiate a Scanner object
        Scanner sc = new Scanner(System.in);
        
        // get input from user for a seed for the RNG
        System.out.println("seed:");
        int seed = sc.nextInt();
        
        // get input from user for the size of the array
        System.out.println("length:");
        int size = sc.nextInt();
        
        // instantiate a RNG with the seed
        Random rand = new Random(seed);
        
        
        
        // INSERT YOUR CODE HERE
        
        // STEP 1: Create an array of size 'size'
        int arr[] = new int[size];
        
        // STEP 2: Iterate through the array and insert a random 
        //         number between 1 and 100
        
        // STEP 3: Display the array - DONE
        displayArray(arr,rand);
        
        // STEP 4: Iterate through the array and shift each value
        //         one spot to the right, and move the last value
        //         to index 0
        
        // Array BEFORE shift: 28 70 88 91 41 74 29 50 85 65
        // Array AFTER shift:  65 28 70 88 91 41 74 29 50 85 
        
        // STEP 5: Display the array again - DONE
        displayArrayShifted(arr, rand);
        
    }
    
    public static void displayArray(int[] arr, Random rand) {
        //code that displays array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100) + 1;
            System.out.print(arr[i] + " ");

        }
        
        System.out.println();
    }

    public static void displayArrayShifted(int [] arr, Random rand) {
        //insert first element
        System.out.print(arr[arr.length - 1] + " ");
        // print array from 0 to second to last element
        for (int i = 0 ; i < arr.length - 1 ; i++) {
            System.out.print(arr[i] + " ");
        }




     }
}

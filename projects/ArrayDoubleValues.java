import java.util.Scanner;
import java.util.Random;

public class ArrayDoubleValues {
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
        displayArray(arr, rand);
        
        // STEP 4: Iterate through the array and double each value

        // Array BEFORE shift: 28 70 88 91 41 74 29 50 85 65 
        // Array AFTER shift:  56 140 176 182 82 148 58 100 170 130 
        
        // STEP 5: Display the array again - DONE
        displayArrayDoubled(arr, rand);
        
    }
    
    public static void displayArray(int[] arr, Random rand){
    
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100) + 1;
            System.out.print(arr[i] + " ");
        }
        
        System.out.println();
    }
        
    public static void displayArrayDoubled(int [] arr, Random rand){

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] * 2 + " ");
        }
        
    }
    
}

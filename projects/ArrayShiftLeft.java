import java.util.*;



public class ArrayShiftLeft {
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
        int[] arr = new int[size];
        
        // STEP 2: Iterate through the array and insert a random 
        //         number between 1 and 100
        
        // STEP 3: Display the array - DONE
        displayArray(arr,rand);
        
        // STEP 4: Iterate through the array and shift each value
        //         one spot to the left, and move the first value
        //         to last index
        
        // Array BEFORE shift: 28 70 88 91 41 74 29 50 85 65 
        // Array AFTER shift:  70 88 91 41 74 29 50 85 65 28
        
        // STEP 5: Display the array again - DONE
        displayArrayShifted(arr, rand);

        // System.out.println("\nMission Accomplished\n");
        
    }
    
    public static void displayArray(int[] arr, Random rand) {
        //code that displays array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100) + 1;
            System.out.print(arr[i] + " ");
        }
        
        System.out.println();
    }
    public static void displayArrayShifted(int [] arr, Random rand){
        //code that displays shifted array
        for (int i = 1 ; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println(arr[0]);

     }
}


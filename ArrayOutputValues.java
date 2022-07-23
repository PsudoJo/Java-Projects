import java.util.Random;
import java.util.Scanner;

public class ArrayOutputValues {
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

        // Create an array of size 'size'
        int[] arr = new int[size];


        // Display the array - DONE
        displayArray(arr,rand);

    }

    public static void displayArray(int[] arr , Random rand){

         for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100) + 1;
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }


}

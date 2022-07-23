import java.util.Scanner;
import java.util.Random;

public class RandomCompliment02 {
    public static void main (String[] args) {
    //space
    System.out.println();

    System.out.println("Welcome to Random Complimentor");

    //space
    System.out.println();

    //instatiate Scanner & Random Variables
    Scanner sc = new Scanner(System.in);
    System.out.println("RANDOM SEED:");
    int seed = sc.nextInt();
    Random rand = new Random(seed);

    compGenerator(sc,rand); // generate compliments         
    }

public static void compGenerator(Scanner sc, Random rand){
    //space
    System.out.println();
    
    //prompt for compliments
    System.out.println("How many compliments would you like to add?");
    int amt = sc.nextInt();

    //space
    System.out.println();


    //keep scanning
    sc.nextLine();

    //size of the array
    String[] comp = new String[amt] ;
    for (int i = 0 ; i < comp.length; i++){
        System.out.println("Please enter a compliment:");
        comp[i] = sc.nextLine();
        //space
        System.out.println();
    }

    System.out.println("The compliments have been loaded.");

    //space
    System.out.println();
    //space
    System.out.println();


    // on-off switch
    boolean okay = true;
    do {
    //Prompt for compliments
    System.out.println("How many compliments would you like? (\'0\' to quit)");
    //space
    System.out.println();

    int pick = sc.nextInt();
    if (pick > 0){
        okay = true;

        //loop for amount of compliments
        for (int i = 0; i < pick; i++){
        int comps = rand.nextInt(amt);
        System.out.println(comp[comps]);
        // //space
        // System.out.println();

        }

        //space
        System.out.println();

        }else if (pick == 0){
        okay = false;
        //space
        System.out.println();
        System.out.println("Have a great day!");
        }
    } while (okay);

}










}

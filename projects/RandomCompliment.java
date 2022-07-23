import java.util.*;
public class RandomCompliment {
public static void main(String[] args) {
    //instatiate Scanner & Random Variables
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a seed for the random number generator: ");
    int seed = sc.nextInt();
    Random rand = new Random(seed);

    compGenerator(sc,rand); // generate

    System.out.print("Mission Accomplished \n");
    }
    
public static void compGenerator(Scanner sc, Random rand){
    System.out.println();
    System.out.println("Welcome to Random Complimentor ");
    boolean okay = true;

    do {
    //Prompt for compliments

    System.out.println("How many compliments would you like? (\'0\' to quit)");
    int pick = sc.nextInt();
    if (pick > 0){
        okay = true;

        //loop for amount of compliments
        for (int i = 0; i < pick; i++){
        String say = "";
        int comp = rand.nextInt(3);
        //switch method
        switch(comp){
            case 0: say = "wow you\'re pretty" ;
            break;
            case 1: say = "okay, you are smart!" ;
            break;
            case 2: say = "you got this!" ;
            break;
            }

        System.out.println(say);
            }

        }else if (pick == 0){
        okay = false;
        }
    } while (okay);

}




}

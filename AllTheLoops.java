import java.util.*;
public class AllTheLoops {
public static void main(String[] args) {
    //instantiate Random & Scanner
    Scanner sc = new Scanner(System.in);

    //method calls
    forLoop(sc); //a loop that iterates with given numbers
    whileLoop(sc); //a while loop that iterates until the user stops it
    doWhileLoop(sc); // a do-while loop to get numbers and compare the average

    // System.out.println("\nMission Accomplished"); // main method test
    }

public static void forLoop(Scanner sc){
    System.out.println("FOR LOOP");
    //request input & instatiate variables
    System.out.println("Please enter a starting point for your loop:");
    int start = sc.nextInt();
    System.out.println("Please enter an ending point for your loop:");
    int stop = sc.nextInt();
    System.out.println("What value would you like the for loop to go up by?");
    int increase = sc.nextInt();

    //print input increased by output
    System.out.println();
    System.out.println("Your numbers:");
    for(int i = start; i <= stop; i += increase){
        System.out.println(i);

    }

    //space
    System.out.println();
    System.out.println();
}

public static void whileLoop(Scanner sc){
    //tell scanner to keep scanning
    sc.nextLine();
    System.out.println("WHILE LOOP");

    //request seed
    int rerun = -2;
    System.out.println("Enter a seed for the random number generator: ");
    int pick = sc.nextInt();
    Random rand = new Random(pick);

    //space
    System.out.println();

    // keep it going until user types stop
    while (rerun != 2){
        int compick = rand.nextInt(50)+1;
        System.out.println("Here\'s your random number: " + compick);
        System.out.println("Would you like another number? Enter \'stop\' to stop");
        String ans = sc.next();
        ans = ans.toLowerCase();
        if (ans.equals("stop")){
            rerun = 2;
            }
        }

        //space
        System.out.println();
        System.out.println();
    }


public static void doWhileLoop(Scanner sc){
    System.out.println("DO-WHILE LOOP");
    boolean okay = true;
    double pick = -1;
    double total = 0;
    double numOfPicks = 0;
    double newaverage = 0;
    do {
        System.out.println("Enter a number (0 to stop and print average):");
            pick = sc.nextInt();
        if (pick != 0 ){
            numOfPicks++; // num of pix increases by 1
            total += pick + numOfPicks; // user input is added to total & iterator count
            okay = false; // loop reiterates
            }else if ( pick == 0){// if pick equals 0, okay equals false, guesses go up, and the loop keeps going
            okay = true;
            }
        }while(!okay);
        double average = (total / numOfPicks);
        if (average % 2 == 0 && average >= 20 ){
            newaverage = average - 2.5;
        }else if(average < 20 && average % 2 == .5){
            newaverage = average - 1.5;
        }else if (average < 10 && average % 2 == 0 ){
            newaverage = average - 2;
        }
    System.out.println("The average of your numbers is: " + newaverage);
//Think what you want to do each iteration of the loop, read a number and add it to the total and increment count
//when the loop ends you divide total by count, not in the loop.
    }
}



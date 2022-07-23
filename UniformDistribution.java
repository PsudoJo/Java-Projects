/*
J.parish
8/14/21
write software to diplay the relationship between randomness, methods, and arrays
*/


import java.util.*;
public class UniformDistribution {
    public static void main(String[] args) {

        // instantiate a Scanner object
        Scanner sc = new Scanner(System.in);

        // get input from user for a seed for the RNG
        System.out.println("Enter seed:");
        int seed = sc.nextInt();

        //Space
        System.out.println();

        // instantiate a RNG with the seed
        Random rand = new Random(seed);

        //values to test
        System.out.println("How many values would you like to test?");
        int trials = sc.nextInt();

        //Space
        System.out.println();

        // Create an array of 10 boxes
        String[] numberContainer = new String[10];

        //call value setting method
        initilizeArray(numberContainer); // set each value as an empty string

        for (int i = trials; i > 0; i--) { // as long as trials is greater than 0 decrement trials
            numberContainer[rand.nextInt(10)] += "-"; // add dashes to the containers that coincide with value assigned by user
        }
        //call to Trial running method
        // initilizeArray(numberContainer); // set each value as an empty string
        runTrials(numberContainer); // generate random numbers between 0 & 9

        //debug print
        // System.out.println("\nMission Accomplished!!\n");

    }

    public static void initilizeArray(String[] numberContainer) {
        for (int i = 0; i < numberContainer.length; i++) { // as long as interator is less than numbercontainer length, increment interator
            numberContainer[i] = ""; // assign blank strings to to boxes in array

        }
    }

    public static void runTrials(String[] numberContainer) { // as long as interator is less than number of boxes, increment interator
        for (int i = 0; i < 10; i++) {
            System.out.println(i + ": " + numberContainer[i] + " " + numberContainer[i].length());
        }
    }

}
/*
Where did you struggle with this coding work?
1. not harcoding the values in the array
2. generating  random numbers that add up to the user input
3. finding out that the loop that appended the frequency of dashes that coincide with user input goes after method that assigns
empty boxes to each box in the array

What was easy?
1. building the initial skeleton, i knew what went where but making things work was dificult
2. passing variables between methods
3. instantiating classes

What questions do you still have?
Are the the same things that java does interchangable with Python?
this language is changing the color of my hair, giving me high blood pressure, and making me want to smoke ciggarettes again.
*/

/**
 * a program that takes user input and replies witha movie quote
 *
 * @author J. Parish
 * @since 6/8/21
 */
 
import java.util.Scanner;

public class Quotes {
    public static void main (String[] args) {
        
    	quotes(); // asks the user for a number and prints a quote
    }
    
    // this method asks the user for a number and prints a quote
    public static void quotes() {

        Scanner sc = new Scanner(System.in);

    // ========== INSERT YOUR CODE HERE ==========
    
    //request input, assign variables
    System.out.println("Enter a number 1-10:");
    int pick = sc.nextInt();
    String q = "";

    //switch method
    switch(pick){
        case 1: q += "QUOTE 1:\nThat\'s just life\'s little game, until you come ready to play her game you\'ll never beat her at it - Fresh, Chess scene";
            break;
        case 2: q += "QUOTE 2:\nYou have to think young brother, about your future - Boyz In The Hood, Gentrification scene";
            break;
        case 3: q += "QUOTE 3:\nYou can murder the liberator but you can\'t murder liberation - Judas and The Black Messiah, Speech scene";
            break;
        case 4: q += "QUOTE 4:\nWhat are the three most common passwords? love, secret, sex - Hackers, Meet cereal killer scene";
            break;
        case 5: q += "QUOTE 5:\nYou look around and see borders, walls, and locks, I see puzzles - Algorithm , trailer";
            break;
        case 6: q += "QUOTE 6:\nPeople can\'t do something themselves they wanna tell you you can\'t do it - Pursuit of Happyness, Life Lessons scene";
            break;
        case 7: q += "QUOTE 7:\nWe are food for worms lads, one day each and every one of us is gonna stop breathing - Dead Poets Society, Carpe Diem scene";
            break;
        case 8: q += "QUOTE 8:\nNobody panics when things go according to plan even if the plan is horrifying - The Dark Knight, Hospital scene";
            break;
        case 9: q += "QUOTE 9:\nWestinghouse was completely unpassworded, which is pretty bad for them considering they dealt with nukes - Unauthorized Access, Noah scene";
            break;
        case 10: q += "QUOTE 10:\nAnd the second charge was unauthorized access to federal intrest computers which is a pretty vague law - Unauthorized Access, Phiber Optik scene";
            break;
    }
    //ouput
    System.out.println(q);
    System.out.println("Thank you for getting cultured.");

    
    
    
    
    // ===========================================		

        sc.close();
        
    }
}







// =============== LAB SUMMARY ===============

/*
1. What was the hardest part of this lab?
Finding all the quotes from the movies


2. What will you always remember (never forget) from this exercise?
The feeling of getting better at programming Java


*/

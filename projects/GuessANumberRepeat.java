import java.util.*;

public class GuessANumberRepeat {
public static void main(String[] args) {
    // method that compares compick to hupick
    whileLoop();
}

public static void whileLoop(){
    int rerun = -1;

    while(rerun != 2){

    //request
    System.out.println("Welcome!");
    System.out.println("Please enter a number between 1 and 100:");

    //instantiate Scanner and Random variables
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    int hupick = sc.nextInt();
    int compick = rand.nextInt(101);
    int playlimit = 0;

    // print computer pick for testing purposes
    //System.out.println("The computer picked: " + compick);

    while(compick != hupick && playlimit < 5){
        if(compick < hupick){
            playlimit++;
            System.out.println("Too high. Guess again:");
              hupick = sc.nextInt();
        }else if(compick > hupick){
            playlimit++;
            System.out.println("Too low. Guess again:");
              hupick = sc.nextInt();
          }if (compick == hupick ){
            System.out.println("Congratulations. you gussed correctly!");
            System.out.println("You needed " + playlimit + " guesses.");
            }
         }
            sc.nextLine();

            System.out.println("Do you want to play again? Answer \"yes\" or \"no\":");
            String ans = sc.nextLine();
            if (ans.equals("yes")){
                rerun = 1;
            }else if (ans.equals("no")){
                rerun = 2;


       }
     }
   }
}

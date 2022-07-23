import java.util.Scanner;
public class WhileLoopE {
public static void main(String[] args) {
    //instantiate Scanner
    Scanner sc = new Scanner(System.in);

    //call method
    whileLoop(sc);
}

public static void whileLoop(Scanner sc){
    int rerun = -1;
    while(rerun != 2){
        //request input
        System.out.println("Would you like to play a game?");
        String ans = sc.nextLine();
        System.out.println();
        ans = ans.toLowerCase();
        if(ans.equals("no")){
            rerun = 2;
            System.out.println("Game over.");
            }
        }

    }


}

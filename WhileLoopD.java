import java.util.Scanner;

public class WhileLoopD {
public static void main(String[] args) {
    //instantiate variables and Scanner
    Scanner sc = new Scanner(System.in);

    //method call
    whileLoop(sc);
}

public static void whileLoop(Scanner sc){
    System.out.println("Enter a number:");
    int pick = sc.nextInt();
    while (pick != 3){ // if pick is not equal to 3 request new pick
    System.out.println("Enter a number:");
        pick = sc.nextInt();
        }
    System.out.println("You chose 3.");

    }


}

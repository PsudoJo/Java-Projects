import java.util.Scanner;

public class WhileLoopC {
public static void main(String[] args) {
    //instatiate scanner and variables to pass
    Scanner sc = new Scanner(System.in);
    // System.out.println("Enter starting number:");
    int start = -10;

    System.out.println();

    System.out.println("Enter incrementor:");
    int incrementor = sc.nextInt();
    int i = 0;
    //call loop
    whileLoop(start, incrementor, i);
}

public static void whileLoop(int start, int incrementor, int i){
        //use loop to increase by input
        System.out.println();
        System.out.println(start);
        while(i < 100 && start <= 100 - incrementor){
            System.out.println(start += incrementor);
             // System.out.println(incrementor);
            i++;
        }
    }
}

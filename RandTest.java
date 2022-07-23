import java.util.*;

public class RandTest {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    randTesty(sc);

    System.out.print("\nMission Accomplished\n");
    }

public static void randTesty(Scanner sc){
           System.out.println("Pick a number: ");
        int total = sc.nextInt();
        if ( total >= 40 && total % 2 == 0 ){
            total - 2.5;
        }else if (total > 30 && total < 40 && total % 2 == 1.5){
            total - 1.5;
        }else if (total <= 30 && total % 2 == 0 ){
            total - 1;
        }

    }

}





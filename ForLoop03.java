import java.util.Scanner;

public class ForLoop03 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number to start:");
    int start = sc.nextInt();
    System.out.println("Enter a number to stop:");
    int stop = sc.nextInt() + 1;
    forLoop(start,stop); // a loop that counts wiht a range
   // System.out.println("\nMission Accomplished\n");
}

public static void forLoop(int start, int stop){
    System.out.println();
    for (int i = start;i < stop; i++){
    System.out.println(i);
    }

  }

}

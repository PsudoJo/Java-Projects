import java.util.Scanner;

public class ForLoop02 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a starting point:");
    int start = sc.nextInt();
    // System.out.println(start);
    forLoop(start); // a loop that counts starting from user input

}

public static void forLoop(int start) {
    System.out.println();
    System.out.println(start);
    for (int i = 0 ;i < 11 ; i++){
    //add 1 to the value of start 6 times
        start++;
        System.out.println(start);
    }
 }

}

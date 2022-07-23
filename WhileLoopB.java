import java.util.Scanner;

public class WhileLoopB {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number:");
    int start = sc.nextInt();
    int i = 0;
    // System.out.println(start);
    whileLoop(start,i); // a loop that counts starting from user input

}

 public static void whileLoop(int start, int i){
    System.out.println();
    // System.out.println(start);
    while(i < 10) {
    //add 1 to the value of start 6 times
        i++;
        start++;
        System.out.println("" + start);
    }
  }
}

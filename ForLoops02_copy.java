import java.util.Scanner;

public class ForLoop02_copy{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a starting point:");
    int start = sc.nextInt();
    for (int i = 0 ; i < start; i++){
        System.out.println(i);
    }

  }
}



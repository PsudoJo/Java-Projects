import java.util.Scanner;

public class ForLoop05 {
public static void main(String[] args) {
    //request input and instatiate var
    Scanner sc = new Scanner(System.in);
    System.out.println("phrase:");
    String phrase = sc.nextLine();
    // loop method call
    forLoop(phrase);
}
public static void forLoop (String phrase){
    String space = " ";

    //a loop that sets spaces between input
    for(int i = 0; i < phrase.length(); i++){
        char temp = phrase.charAt(i);
        String np = temp + space;
        // if (temp >= 65 && <= 122)
        System.out.print(np);
    }

}



}

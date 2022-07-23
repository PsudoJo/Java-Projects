import java.util.Scanner;

public class ForLoop04 {

public static void main(String[] args) {
    //instatiate scanner and variables to pass
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number to start:");
    int start = sc.nextInt();
    System.out.println("Enter a number to stop:");
    int stop = sc.nextInt();
    System.out.println("Enter a number to increase:");
    int increase = sc.nextInt();

    forLoop(start, stop, increase); //call to loop

    //System.out.println("\nMission Accomplished\n");//test output
}
    public static void forLoop(int start, int stop, int increase){
        //use loop to increase by input
        System.out.println();
        for(int i = start; i <= stop; i += increase){
            System.out.println(i);
        }

    }


}

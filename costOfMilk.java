import java.util.Scanner;
public class costOfMilk{
    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);


    double costOfGallons6 = 2.09;
    double costOfGallons7 = 1.99;

    double milkPrice = 0;

    System.out.print("Enter number of gallons");
    int numOfGallons = scanner.nextInt();
    System.out.println();

    if (numOfGallons > 6 ){
        milkPrice = costOfGallons7 * numOfGallons;
        }else if (numOfGallons <= 6 ){
            milkPrice = costOfGallons6 * numOfGallons;
        }
    System.out.println("The total cost of milk is " + milkPrice);

    }

}

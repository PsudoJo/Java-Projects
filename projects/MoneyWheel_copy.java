import java.util.*;



public class MoneyWheel_copy{
    public static void main(String[] args) {
        System.out.println("Welcome to the Money Wheel!");
        System.out.println("SEED:");

        //instantialize scanner
        Scanner input = new Scanner(System.in);
        int seed = input.nextInt();
       
        int[] wheelArray = new int[54];
        for(int index = 0; index < 54; index++) {
            if(index < 24) {
                wheelArray[index] = 1;
            }
            else if (index < 39) {
                wheelArray[index] = 2;
            }
            else if (index < 46) {
                wheelArray[index] = 5;
            }
            else if (index < 50) {
                wheelArray[index] = 10;
            }
            else if (index < 52) {
                wheelArray[index] = 20;
            }
            else {
                wheelArray[index] = 40;
            }
        }
        Random random = new Random(seed);   //Sets seed
        System.out.println("");
        System.out.println("How many sessions would you like?");
        int sessions = input.nextInt();
       
        int totalSpins = 0;
        int totalSpendings = 0;
        int totalWinnings = 0;
        int totalEarnings = 0;
        int mostSpins = 1;
        int largestBet = 1;

        for (int i = sessions; i > 0; i--) {    // does howevermany sessions
            int spins = 1;
            int spendings = 0;
            int winnings = 0;
            int earnings = 0;
            int currentBet = 1;
            while(true) {
                int newNumber = wheelArray[random.nextInt(54)];
                // System.out.println("DEBUG : spinValue is " + newNumber);

                if (newNumber == 1) {
                    winnings = currentBet*2;
                    spendings += currentBet;
                    break;  //breaks out on win
                }
                else {
                    spins += 1;
                    spendings += currentBet;
                    currentBet = currentBet * 2 + 1;
                }
                // System.out.println("DEBUG : current bet is " + spendings);
            }
            earnings = winnings - spendings;
            System.out.println();
            System.out.println("Number of spins: " + Integer.toString(spins));
            System.out.println("Session spending: " + Integer.toString(spendings));
            System.out.println("Session winnings: " + Integer.toString(winnings));
            System.out.println("Session earnings: " + Integer.toString(earnings));
            totalSpins += spins;
            totalSpendings += spendings;
            totalWinnings += winnings;
            totalEarnings += earnings;
            mostSpins = Math.max(mostSpins, spins);
            largestBet = Math.max(largestBet, spendings);
           
        }
        System.out.println();
        System.out.println();
        System.out.println("==========TOTAL==========");
        System.out.println();
        System.out.println("Total spins: " + Integer.toString(totalSpins));
        System.out.println("Total spent: " + Integer.toString(totalSpendings));
        System.out.println("Total won: " + Integer.toString(totalWinnings));
        System.out.println("Earnings: " + Integer.toString(totalEarnings));
        System.out.println();
        System.out.println("The most spins: " + Integer.toString(mostSpins));
        System.out.println("The biggest bet: " + Integer.toString(largestBet));
        System.out.println();
        System.out.println("=========================");
       
    }
}

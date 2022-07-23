import java.util.*;

public class MoneyWheel {
    public static void main(String[] args) {
        System.out.println("Welcome to the Money Wheel!");

        // instantiate a Scanner object
        Scanner sc = new Scanner(System.in);

        // get input from user for a seed for the RNG
        System.out.println("SEED:");
        int seed = sc.nextInt();


        // instantiate a RNG with the seed
        Random rand = new Random(seed);

        // Create an array of size of 54 entries hardcoded
        int[] wheel = {
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            2,
            2,
            2,
            2,
            2,
            2,
            2,
            2,
            2,
            2,
            2,
            2,
            2,
            2,
            2,
            5,
            5,
            5,
            5,
            5,
            5,
            5,
            10,
            10,
            10,
            10,
            20,
            20,
            40,
            40
        };

        //Call to method
        moneyWheel(sc, rand, wheel);

        // System.out.println("\nMission Accomplished!!\n");


    }

    public static void moneyWheel(Scanner sc, Random rand, int[] wheel) {
        int earnedTotal = 0;
        int betTotal = 0;
        int wonTotal = 0;
        int sessions = 0;
        int spinTotal = 0;
        int spentTotal = 0;
        int maxSpins = 0;
        int maxBet = 0;
        int mostSpins = 1;
        int largestBet = 1;


        // get amount of sessions sessions) from user
        System.out.println("How many sessions would you like?");
        sessions = sc.nextInt(); // seesions instead of sessions

        //Space
        System.out.println();


        // as long as chosen amount of sessions is more than iterator
        for (int i = 0; sessions > i; i++) {
            int spin = 1;
            int bet = 1;
            int won = 0;
            int earned = 0;
            int spent = 0;
            boolean okay = true;

            while (okay) {
                int spinValue = wheel[rand.nextInt(wheel.length)]; //number picked from the array
                if (spinValue != 1) { // if 1 isnt number picked from spin
                    spin += 1; // number of spins up by 1
                    // System.out.println("DEBUG: Spin count " + spin);
                    spent += bet; // bet added to current value of money spent
                    bet = bet * 2 + 1; // bet is multiplied by 2 and added to 1
                    earned = won - spent; // money earned
                } else { // if 1 is number picked
                    won = bet * 2; // whats won is the bet doubled
                    spent += bet; // money spent is added to current value of bet
                    betTotal += bet;
                    if (bet > maxBet) {
                        maxBet = bet;
                    }
                    earned = won - spent; // money earned
                    System.out.println("Number of spins: " + spin);
                    spinTotal += spin;
                    if (spin > maxSpins) {
                        maxSpins = spin;
                    }
                    System.out.println("Session spending: " + spent);
                    spentTotal += spent;
                    if (spent > spentTotal) {
                        spentTotal = spent;
                    }
                    System.out.println("Session winnings: " + won);
                    wonTotal += won;
                    if (won > wonTotal) {
                        wonTotal = won;
                    }
                    System.out.println("Session earnings: " + earned);
                    earnedTotal += earned;
                    if (earned > earnedTotal) {
                        earnedTotal = earned;
                    }

                    mostSpins = Math.max(maxSpins, spin);
                    largestBet = Math.max(largestBet, spent);

                    // Space
                    System.out.println();

                    okay = false; // loop stops , player won

                }
            }
        }
        System.out.println("==========TOTAL==========");
        // Space
        System.out.println();

        System.out.println("Total spins: " + spinTotal);
        System.out.println("Total spent:  " + spentTotal);
        System.out.println("Total won:  " + wonTotal);
        System.out.println("Earnings: " + earnedTotal);

        // Space
        System.out.println();

        System.out.println("The most spins: " + mostSpins);
        System.out.println("The biggest bet: " + largestBet);

        // Space
        System.out.println();
        System.out.println("=========================");

    }
}


import java.util.*;
public class FinalExamPROGRAM {
    public static void main (String[] args) {

        // Create an instance of Scanner
        Scanner sc = new Scanner(System.in);

        //instantiate variables
        String yes = "y";
        String no = "n";
        final String LOST = "YOU LOSE !!";
        int points = 0;

        //intro
        System.out.print("WELCOME TO CENTRAL BOOKINGS SIMULATOR!!\n");

        //space
        System.out.println();

        System.out.println("We're all losers here, this game is about how many points you can leave with.");

        //space
        System.out.println();


        //request name
        System.out.println("Whats your name?");
        String name = sc.nextLine();

        //call to method
        greeting(sc,points,name,yes,no);
        playTime(sc,points,name,yes,no,LOST);
        
    }
    public static void greeting(Scanner sc, int points, String name, String yes, String no){

        //space
        System.out.println();

        System.out.print("Well " + name + " unfortunately, you're about to be booked for a bar brawl, and you forgot your ID at home. \n");
        System.out.println("\nYou know what that means? (y for \"yes\" & \"n\"for no)\n");
        String ans = sc.nextLine();

        //space
        System.out.println();

        if (ans.equals(yes)){
            System.out.println("\nThen brace yourself " + name +" because things are about to get weeeeeiiiiiirrrdddddd!!!\n");

            //space
            System.out.println();

        }else if (ans.equals(no)){
            System.out.print("You're about to spend the next 8 to 12 hrs in the most awkward place in NYC " + name +". ");
            System.out.println("So put your blank face on \n and prepare for things to get weeeeeiiiiiirrrdddddd!!");

            //space
            System.out.println();

        }

    }


    public static void playTime(Scanner sc, int points, String name, String yes, String no, String LOST){
        int currentPoints = 0;
        String choice = (" y for \"yes\" & \"n\"for no)\n");
        String ans = "";
        // points = 0;

            //level 1 backround
            System.out.println("Level 1 : Basement");
            System.out.print("You've just got your cuffs off & you walk into the cell. You notice a guy using the toilet, ");
            System.out.println("an empty space on the metal bench, and everyone else is sleeping on the floor. \n");

            //decision
            System.out.println("Do you ask if anyone is sitting there?" + choice);
            ans = sc.nextLine();

            //space
            System.out.println();

            if (ans.equals(yes)){
                currentPoints += 10;
                System.out.println("You displayed respect & courtesy, while maintaining the peace");
                System.out.println("YOU LEVELED UP !! \n" + "Points: " + currentPoints);

                //space
                System.out.println();


            }else if (ans.equals(no)){
                System.out.print("\"The f*** are you doin?!\" said the guy by the toilet as he stormed toward you aggresively.\n");
                System.out.println("Now you're in a fight that got your paperwork pushed back.");
                System.out.println("Points: " + currentPoints);

                //space
                System.out.println();

            }

            //level 2 background
            System.out.println("Level 2 : 3rd floor");
            System.out.print("You're now on the third floor, its a smaller cell but now you've gotten aquaintted with someone else.\n");
            System.out.println(" What you didn't know was that he's in a gang and things between him and a rival are getting heated.\n");

            //decision
            System.out.println("Do you offer assistance?" + choice);
            ans = sc.nextLine();

            //space
            System.out.println();


            if(ans.equals(yes)){
                System.out.print("The rival isn't alone they jump you in a corner.\n");
                System.out.println("Everyone puts up a body fence to keep the cops from seeing.");
                System.out.println("Points: " + currentPoints);

                //space
                System.out.println();




            }else if(ans.equals(no)){
                currentPoints += 10;
                System.out.print("You played it safe and minded your business afterall,\n");
                System.out.println(" jail is no place to make friends.");
                System.out.println("YOU LEVELED UP !! \n" + "Points: " + currentPoints);

                //space
                System.out.println();


            }

            //level 3 background
            System.out.println("Level 3 : Arraignment Room");
            System.out.print("You've made it to the Arraignment Room, where all those who've kept it together wait to see the judge.\n");
            System.out.print(" You've seen your Public Defendent and she's determined if you plea guilty to 2 counts of assault,\n ");
            System.out.print(" you may be able to only get probation but it's on your record.\n");
            System.out.print(" If you plead not guilty, you may beat the case but if you lose, you get 2 - 5 years.\n");

            //space
            System.out.println();

            //decision
            System.out.println("Do you plead guilty?" + choice);
            ans = sc.nextLine();

            //space
            System.out.println();

            if (ans.equals(yes)){
                currentPoints += 10;
                System.out.print("You get probation and released from jail.");
                System.out.println(" You made it home, no Rikers Island for you  \n" + "Total Points: " + currentPoints);

                //space
                System.out.println();


                }else if (ans.equals(no)){
                System.out.print("You blew trial and end up being sentenced to the maximum of 5 years. ");
                System.out.println("You ship out to Rikers Island ");
                System.out.println("Points: " + currentPoints);

                //space
                System.out.println();

                }
                System.out.println("THANK YOU FOR PLAYING !!");
            }

        }

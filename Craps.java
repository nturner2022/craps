
import java.util.Scanner;

public class Craps {
    
    public static void main(String args[]){
        System.out.println("Welcome to the game Craps! Would you like to play? (Yes/No)");
        Scanner in = new Scanner(System.in);
        String initiateGame = in.next();
        if (initiateGame.equalsIgnoreCase("Yes")){
            System.out.println("Do you need the instructions? (Yes/No)");
            String instructions = in.next();
            if (instructions.equalsIgnoreCase("Yes")){
                System.out.println(" 1. A player rolls two six-sided dice and adds the numbers rolled together.");
                System.out.println("2. On this first roll, a 7 or an 11 automatically wins, and a 2, 3, or 12 automatically loses,");
                System.out.println("and play is over. If a 4, 5, 6, 8, 9, or 10 are rolled on this first roll, that number becomes the point.");
                System.out.println("3. The player continues to roll the two dice again until one of two things happens: either they roll the");
                System.out.println("point from that first roll again, in which case they win; or they roll a 7, in which case they lose");
            }
        }
        else {
            System.out.println("Okay! Have a nice day!");
        }
       
        in.close();
    }

}

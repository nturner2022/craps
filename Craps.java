
import java.util.Scanner;

public class Craps {
    
    public static void main(String args[]){
        System.out.println("Welcome to the game Craps! Would you like to play? (Yes/No)");
        Scanner in = new Scanner(System.in);
        String initiateGame = in.next();
        Die dice = new Die(); //makes die object
        if (initiateGame.equalsIgnoreCase("No")){
            System.out.println("Okay! Hope to see you soon!");
        } else {
            System.out.println("Do you need the instructions? (Yes/No)");
            String instructions = in.next();
            if (instructions.equalsIgnoreCase("Yes")){
                System.out.println(" 1. A player rolls two six-sided dice and adds the numbers rolled together.");
                System.out.println("2. On this first roll, a 7 or an 11 automatically wins, and a 2, 3, or 12 automatically loses,");
                System.out.println("and play is over. If a 4, 5, 6, 8, 9, or 10 are rolled on this first roll, that number becomes the point.");
                System.out.println("3. The player continues to roll the two dice again until one of two things happens: either they roll the");
                System.out.println("point from that first roll again, in which case they win; or they roll a 7, in which case they lose");
                System.out.println();
            }
        }
        while (initiateGame.equalsIgnoreCase("Yes")){ //uses user input to allow program to run when they want it to
            System.out.println("Press <Enter> to roll the dice");
            Scanner enterToRoll = new Scanner(System.in);
            enterToRoll.nextLine(); //allows the enter key to be the input
            int roll = dice.dieRoll();
            if (roll == 7 || roll == 11){ //checks for automatic win
                System.out.println("You rolled a " +roll +"! Automatic win! Congrats, you win!");
            } else if (roll == 2 || roll == 3 || roll == 12){ //checks for automatic loss
                System.out.println("You rolled a " +roll + ". Automatic loss! Sorry, you lose!");
            } else { //starts point count
                int count = 0;
                int point = roll;
                while (roll != 7 && point != roll || count == 0){
                    count ++; //point count
                    System.out.println("You rolled a " +roll +". Press enter to roll again");
                    enterToRoll.nextLine();
                    roll = dice.dieRoll(); //second roll
                    if (roll == 7) {
                        System.out.println("Point count: " +count);
                        System.out.println("Sorry, you lose! You rolled a " +roll +" before you rolled a " +point +" again!");
                    } else if (roll == point){
                        System.out.println("Point count: " +count);
                        System.out.println("You rolled a " +roll +" again! Congrats, you win");
                    }
                }
            }
            System.out.println("Game over! Would you like to play again?");
            String response = in.next();
            if (response.equalsIgnoreCase("No")){ 
                System.out.println("Thanks for playing!");
                break; //ends program
            }
            in.close();
            enterToRoll.close();
        }

    }

}

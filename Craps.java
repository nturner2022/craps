
import java.util.Scanner;

public class Craps {
    
    public static void main(String args[]){
        System.out.println("Welcome to the game Craps! Would you like to play? (Yes/No)");
        Scanner in = new Scanner(System.in);
        String initiateGame = in.next();
        if (initiateGame.equalsIgnoreCase("Yes")){

        }
        else {
            System.out.println("Okay! Have a nice day!");
        }
       
        in.close();
    }

}

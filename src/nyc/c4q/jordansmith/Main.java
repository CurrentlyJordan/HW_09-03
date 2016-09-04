package nyc.c4q.jordansmith;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean PlayAgain = true;
        boolean drunk;
        boolean knife;
        while (PlayAgain == true) {
            drunk = Text.isIntoxicated(); //for endGame function, if drunk == true, print one thing if knife = true print one thing
            knife = Text.willUseKnife();

            if (drunk == true && knife == true) {
                if (Text.fightDrunkKnife() == true) {
                    Text.endGame(drunk, knife);
                } else {
                    System.out.println("Thanks for Playing");
                }
            } else if (drunk == false && knife == true) {
                if (Text.fightNotDrunkKnife() == true) {
                    Text.endGame(drunk, knife);
                } else {
                    System.out.println("Thanks for Playing");
                }
            } else if (drunk == true && knife == false) {
                if (Text.fightDrunkGun() == true) {
                    Text.endGame(drunk, knife);
                } else {
                    System.out.println("Thanks for Playing");
                }
            } else if (drunk == false && knife == false) {
                if (Text.fightNotDrunkGun() == true) {
                    Text.endGame(drunk, knife);
                } else {
                    System.out.println("Thanks for playing");
                }
            }
            boolean confirmPlayAgain = false;
            while (confirmPlayAgain == false) {
                System.out.println("Would you like to play again? Answer \"yes\" or \"no\"");
                Scanner scanner = new Scanner(System.in);
                String input = scanner.next();
                if (input.equals("yes") || input.equals("y")) {
                    confirmPlayAgain = true;

                } else if (input.equals("no") || input.equals("n")) {
                    confirmPlayAgain = true;
                    PlayAgain = false;
                } else {
                    System.out.println("what was that?");
                }
            }
        }
    }
}





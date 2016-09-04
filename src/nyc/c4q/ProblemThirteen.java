package nyc.c4q;

/**
 * Created by jordansmith on 9/3/16.
 */

import java.util.Scanner;
import java.text.DecimalFormat;
public class ProblemThirteen {

    public static void main(String[] args) {

        System.out.println("Hello. Welcome to our ice cream service! What's your name?");
        String name = readInput();
        System.out.println("Hello " + name + "! What flavor of ice-cream would you like?");
        String flavor = readInput();
        System.out.println("Would you like chocolate chips?"); //scanner lets user put in flavor and toppings
        int numberOfToppings = 0;
        if (readInput().toLowerCase().equals("yes")){         //if user answers "yes" for toppings, increases number of them
            numberOfToppings++;
        }
        System.out.println("Would you like bananas?");
        if (readInput().toLowerCase().equals("yes")){
            numberOfToppings++;
        }
        System.out.println("Would you like hot fudge?");
        if (readInput().toLowerCase().equals("yes")){
            numberOfToppings++;
        }
        double price = (numberOfToppings * .33) + 2.33;    //calculates number of toppings and ice-cream
        DecimalFormat df = new DecimalFormat("#.00");      // ensures final price is limited to two decimal places
        String newPrice = df.format(price);
        int arrivalTime = (int )(Math.random() * 60 + 1);  //finds random number between 1 and 60
        System.out.println("Okay a " + flavor +" ice-cream with " + numberOfToppings + " toppings. That will be $" + newPrice + ". Your ice-cream will arrive in " + arrivalTime + " minutes.");


    }
    public static String readInput(){
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}



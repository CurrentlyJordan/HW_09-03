package nyc.c4q;

import java.util.Scanner;

/**
 * Created by jordansmith on 9/3/16.
 */


public class ProblemSix {

    public static void main(String[] args) {

        System.out.println("Enter a food:");            // prompt user to enter a food.
        String food = readInput().toLowerCase();        // setting variable = user prompt and making it case insensitive
        if (food.charAt(0) == ('h')){                   // if the char at the first index = 'h', print "Yum"
            System.out.println("Yum!");                 // else print "yuck"
        }
        else { System.out.println("yuck!");
        }

    }

    public static String readInput(){
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

}


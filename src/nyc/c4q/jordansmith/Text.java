package nyc.c4q.jordansmith;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by jordansmith on 8/31/16.
 */
public class Text {
    private static Scanner scanner = new Scanner(System.in);
    private static Random r = new Random();

    static boolean isIntoxicated() {
        System.out.println("Online dating never works? We'll see about that.\nI met a girl online and tonight we're going out for drinks\nWe get a cozy seat at the bar.\nShe's beautiful but something about her is a little off... I'm feeling nervous.");
        boolean answer = false;
        boolean intoxicated = false;
        do {
            System.out.println("I Need to loosen up, but I might have to drive later. Should I \"take a drink\" or maybe \"eat some pretzels?\"");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("take a drink") || input.equalsIgnoreCase("drink")) {
                System.out.println("Boy that hit the spot. I feel my nerves easing but I'm feeling a bit lightheaded. Wait what's wrong with her head");
                answer = true;
                intoxicated = true;
            } else if (input.equalsIgnoreCase("eat some pretzels") || input.equalsIgnoreCase("pretzels")) {
                System.out.println("Gross these pretzels are stale. And now she's looking at me funny. should of gotten that drink instead");
                answer = true;
                intoxicated = false;
            } else {
                System.out.println("What was that?");
            }

        }
        while (!answer);
        return intoxicated;
    }


    static boolean willUseKnife() {
        boolean answer = false;
        boolean knife = false;
        System.out.println("Suddenly, her face starts splitting open at the seams revealing a disfigured creature. You frantically look around and see a kitchen knife at the bar's prep station. \nYou also spot a door you're praying is unlocked");
        do {
            System.out.println("Should I \"use the knife\" or \"try the door\"");
            String input2 = scanner.nextLine();
            if (input2.equalsIgnoreCase("use the knife") || input2.equalsIgnoreCase("knife")) {
                answer = true;
                knife = true;
            } else if (input2.equalsIgnoreCase("try the door") || input2.equalsIgnoreCase("the door") || input2.equalsIgnoreCase("door")) {
                answer = true;
                knife = false;
            } else {
                System.out.println("What was that?");
            }
        }
        while (!answer);
        return knife;
    }

    static boolean fightDrunkKnife() {
        int misses = 0;
        boolean fightWon = false;
        System.out.println("You grab the nearby knife, hoping you're not too tipsy to defend yourself.");
        while (misses <= 3 && fightWon == false) {
            System.out.println("You lunge at the creature, hoping to stop it from killing you (press any key to attack) ");
            String anyKey = scanner.next();
            int hit1 = r.nextInt(9 - 1) + 1;
            int hit2 = r.nextInt(9 - 1) + 1;
            int target = r.nextInt(9 - 1) + 1;
            if (hit1 == target || hit2 == target) {
                System.out.println("The blade cuts deep into the creature's neck, spilling its black blood all over the floor of the bar");
                fightWon = true;
            } else {
                System.out.println("Your aim is unsteady after the drink. Your attack misses. The creature connects with an attack of its own");
                misses++;
            }
        }
        if (fightWon == true) {
            System.out.println("The monster slumps to the floor, it writhes in pain for a few moments but you don't wait around to see if it's dead for good");
            return true;
        } else {
            System.out.println("The monster surprises you with a quick slash to the stomach with its claws. you hit the floor. At first you feel warm, then suddenly very cold......");
            return false;
        }

    }

    static boolean fightNotDrunkKnife() {
        int misses = 0;
        boolean fightWon = false;
        System.out.println("You frantically grab for the nearby knife. I bet you're glad you didn't take that drink now!");
        while (misses <= 3 && fightWon == false) {
            System.out.println("You lunge at the creature with steady strikes, hoping to stop it from killing you (press any key to attack) ");
            String anyKey = scanner.next();
            int hit1 = r.nextInt(6 - 1) + 1;
            int hit2 = r.nextInt(6 - 1) + 1;
            int target = r.nextInt(6 - 1) + 1;
            if (hit1 == target || hit2 == target) {
                System.out.println("you plunge the blade into the monster's neck, letting loose a torrent of black ooze all over the bar.");
                fightWon = true;
            } else {
                System.out.println("Your attack misses by a hair, but you're confident your next blow will connect.");
                misses++;
            }
        }
        if (fightWon == true) {
            System.out.println("The monster crashes to the ground, trying to stop the bleeding with its claws. It eventually stops moving ");
            return true;
        } else {
            System.out.println("The creature finds an opening in your missed attacks and slices you in the stomach. Your date prepares for a final blow. You fall to your knees wishing you were ate least a little tipsy for what comes next.");
            return false;
        }
    }

    static boolean fightDrunkGun() {
        int misses = 0;
        boolean fightWon = false;
        System.out.println("\"Are you kidding me? a knife's not gonna kill that thing\" you think to yourself. You drunkenly hop over the bar and crash through a door marked \"Employees Only\".");
        System.out.println("You quickly scan the manager's office for an exit, but are instead met with an unlocked gun safe. You quickly question your choice of drinking establishment before grabbing a pistol");
        System.out.println("You turn to see your date for the night ambling through the door, red blood dripping from its maw. Damn you tinder.");
        while (misses <= 3 && fightWon == false) {
            System.out.println("You aim the pistol and try to keep steady, but the whiskey you drank clearly has other ideas... (Press any key to shoot)");
            scanner.next();
            int hit1 = r.nextInt(5 - 1) + 1;
            int hit2 = r.nextInt(5 - 1) + 1;
            int target = r.nextInt(5 - 1) + 1;
            if (hit1 == target || hit2 == target) {
                System.out.println("Your shot hits the monster in the chest. You follow up with a few more shots before it hits the ground. You walk over its body and make sure the job is finished.");
                fightWon = true;
            } else {
                System.out.println("Your shot completely misses. The monster takes another few steps toward you");
                misses++;
            }
        }
        if (fightWon == true) {
            System.out.println("You marvel at your handy work for a few moments before heading to the front room of the bar.");
            return true;
        } else {
            System.out.println("The monster grabs you by the throat and pins you to the wall. It reaches back its other claw, preparing to strike. At least the alcohol will numb the pain, right?");
            return false;
        }
    }

    static boolean fightNotDrunkGun() {
        int misses = 0;
        boolean fightWon = false;
        System.out.println("\"Are you kidding me? a knife's not gonna kill that thing\" you think to yourself. You gracefully hop over the bar and crash through a door marked \"Employees Only\".");
        System.out.println(" You quickly scan the manager's office for an exit, but are instead met with an unlocked gun safe. You quickly question your choice of drinking establishment before grabbing a pistol");
        System.out.println("You turn to see your date for the night ambling through the door, red blood dripping from its maw. Damn you tinder.");
        while (misses <= 3 && fightWon == false) {
            System.out.println("You aim the pistol, keeping the monster in your crosshairs. \"Now what did dad teach me about shooting when I was 10?\" (Press any key to shoot)");
            scanner.next();
            int hit1 = r.nextInt(4 - 1) + 1;
            int hit2 = r.nextInt(4 - 1) + 1;
            int target = r.nextInt(4 - 1) + 1;
            if (hit1 == target || hit2 == target) {
                System.out.println("Your shot strikes the monster in its head. It's dead before it hits the ground. You're quietly impressed with yourself.");
                fightWon = true;
            } else {
                System.out.println("Your shot completely misses. The monster takes another few steps toward you");
                misses++;
            }
        }
        if (fightWon == true) {
            System.out.println("You marvel at your handy work for a few moments before heading to the front room of the bar.");
            return true;
        } else {
            System.out.println("The monster grabs you by the throat and throws you across the room. The gun flies in the opposite direction and you're pretty sure your leg is broken.");
            System.out.println("\" This wouldn't have happened if I just stayed home and watched Netflix\" think to yourself. The beast unhinges its jaw and reveals a second row of teeth before taking a hearty bite out of your face");
            return false;
        }
    }

    static void endGame(boolean drunk, boolean knife) {
        boolean rightCombo = false;
        int misses = 0;
        System.out.println("You look around the front room of the bar and see the other patrons cowering in fear, staring at you with disbelief.");
        if (knife == false) {
            System.out.println("\"They saw everything! They saw my date transform into the monster, they saw me run into the backroom and they must have heard the gunshots\"");
        } else {
            System.out.println("\"They just saw me stab creature to death with a kitchen knife, of course they're unsettled.\"");
        }
        if (drunk == true) {
            System.out.println("You walk over to the end of the bar, tip the bartender that served you the drink and walk to the middle of the room");
        } else {
            System.out.println("You grab another pretzel from the bowl, convinced they're somehow keeping you alive, and head to the middle of the room");
        }
        System.out.println("Everyone is still staring, it's getting a little awkward. You try to make a joke...");
        System.out.println("\"And I thought First dates were rough before\"....");
        System.out.println("Nobody laughs, they just continue to stare. you take the silence as your cue to leave");
        System.out.println("You start walking towards the exit when suddenly, everyone at the bar suddenly transforms into the same type of monster that attacked you");
        System.out.println("You dash for the basement, hoping to get away");
        System.out.println("You come across a reinforced door with a digital number lock. \n Next to the door are four post-it notes with four 4-letter combinations:");
        for (int index = 0; index < 2; index++) {
            System.out.println("1.\"9128\" \n2.\"8278\" \n3.\"3634\" \n4.\"9897\"");
            System.out.println("Enter a combo: ");
            int userCombo = scanner.nextInt();
            switch (userCombo) {
                case 9128:
                    System.out.println("The code works. You run through the door and slam it behind you");
                    index = 2;
                    rightCombo = true;
                    break;
                default:
                    System.out.println("The code doesn't work. You hear the monsters inching closer...");
            }
        }
        if (rightCombo == true) {
            System.out.println("The monsters claw at the door, you look around and see that you're trapped in a pantry.\nThere's enough stale pretzels and water to last until someone saves you");
            System.out.println("The END!");
        } else {
            System.out.println("Suddenly you feel your own blood splash on your shoes...");
            System.out.println("The END!");
        }
    }
}





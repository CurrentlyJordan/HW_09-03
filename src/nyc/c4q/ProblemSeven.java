package nyc.c4q;

/**
 * Created by jordansmith on 9/3/16.
 */
public class ProblemSeven {

    public static void main(String[] args) {
        System.out.println(elipses("whatever man"));
    }







    public static String elipses(String original){  //takes a substring of th first 3 values, adds elipses and last value
        String newString = original.substring(0,3) + "..." + original.charAt(original.length() - 1);
        if (original.length() <= newString.length()){  //if length of original string is less than the new, return orig
            return original;                           //else return newly constructed string
        }
        else { return newString;
        }
    }
}

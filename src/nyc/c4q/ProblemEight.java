package nyc.c4q;

/**
 * Created by jordansmith on 9/3/16.
 */
public class ProblemEight {

    public static void main(String[] args) {
        String hashtags = "";
        for (int i = 1; i <= 7; i++){         // for ever value of i, add "#" to variable hashtags and then print
            hashtags = hashtags + " #";
            System.out.println(hashtags);
        }
    }
}

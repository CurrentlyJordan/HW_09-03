package nyc.c4q;

/**
 * Created by jordansmith on 9/3/16.
 */
public class ProblemTen {
    public static void main(String[] args) {
        System.out.println(vowelCounter("Harambe"));
    }


    public static int vowelCounter(String input){
        input = input.toLowerCase();
        int vowels = 0;
        for (int i = 0; i < input.length(); i++){
            if (input.charAt(i) == 'a'|| input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u'){  //if an index = a vowel, the vowel counter goes up
                vowels++;
            }
        }
        return vowels;
    }
}

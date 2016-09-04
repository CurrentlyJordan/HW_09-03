package nyc.c4q;

/**
 * Created by jordansmith on 9/3/16.
 */
public class ProblemNine {

    public static void main(String[] args) {
        System.out.println(codeCount("codecodecobe"));
    }


    public static int codeCount(String input){
        int numberOfCode = 0;
        for (int i = 0; i < input.length(); i++ ){ //
            if (input.charAt(i) == 'c'&& input.charAt(i + 1) == 'o'&& input.charAt(i + 3) == 'e'){       //if the for loop finds a 'c', checks the next four values. if the values spell code,
                numberOfCode++;  // the numberOfCode is increased by one
            }
        }
        return numberOfCode;
    }
}


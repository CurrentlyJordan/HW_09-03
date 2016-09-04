package nyc.c4q;

/**
 * Created by jordansmith on 9/3/16.
 */
public class ProblemEleven {

    public static void main(String[] args) {
        System.out.println(cutAString("Hello",'H'));
    }


    public static String cutAString(String testString, char testCharacter ){
        String newString = "";
        for (int i = 0; i < testString.length(); i++){  //if a char in the string = the testCharacter, it makes a new
            if(testString.charAt(i) == testCharacter){  //substring starting after the matching char to the end.
                newString = testString.substring(i + 1,testString.length());
                break;
            }
        }
        return newString;
    }
}

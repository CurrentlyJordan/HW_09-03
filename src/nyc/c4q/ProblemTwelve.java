package nyc.c4q;

/**
 * Created by jordansmith on 9/3/16.
 */
public class ProblemTwelve {

        public static void main(String[] args) {

            String day12 = "twelve drummers drumming, ";  //variables for each repeating in the song
            String day11 =  "eleven pipers piping, ";
            String day10 =  "ten lords a leaping, ";
            String day9 =  "nine ladies dancing, ";
            String day8 =  "eight maids a milking, ";
            String day7 =  "seven swans a swimming, ";
            String day6 =  "six geese a laying, ";
            String day5 =  "FIVE GOLDEN RINGS, ";
            String day4 =  "four turtle doves, ";
            String day3 =  "three french hens, ";
            String day2 =  "two turtle doves, and ";
            String day1 = "a partridge in a pear tree";
            String repeatedLyrics = "";

            for (int dayOfChristmas = 1; dayOfChristmas < 13;dayOfChristmas++){ //looping through the 12 verses of the song


                switch(dayOfChristmas){    //switch prints out the repeated lyrics and then adds the next lyric for next loop
                    case 1:
                        System.out.println("On the first day of Christmas, my true love gave to me:");
                        System.out.println(day1);
                        repeatedLyrics = day2 + day1;
                        break;
                    case 2:
                        System.out.println("On the second day of Christmas, my true love gave to me:");
                        System.out.println(repeatedLyrics);
                        repeatedLyrics = day3 + repeatedLyrics;
                        break;
                    case 3:
                        System.out.println("On the third day of Christmas, my true love gave to me:");
                        System.out.println(repeatedLyrics);
                        repeatedLyrics = day4 + repeatedLyrics;
                        break;
                    case 4:
                        System.out.println("On the fourth day of Christmas, my true love gave to me:");
                        System.out.println(repeatedLyrics);
                        repeatedLyrics = day5 + repeatedLyrics;
                        break;
                    case 5:
                        System.out.println("On the fifth day of Christmas, my true love gave to me:");
                        System.out.println(repeatedLyrics);
                        repeatedLyrics = day6 + repeatedLyrics;
                        break;
                    case 6:
                        System.out.println("On the sixth day of Christmas, my true love gave to me:");
                        System.out.println(repeatedLyrics);
                        repeatedLyrics = day7 + repeatedLyrics;
                        break;
                    case 7:
                        System.out.println("On the seventh day of Christmas, my true love gave to me:");
                        System.out.println(repeatedLyrics);
                        repeatedLyrics = day8 + repeatedLyrics;
                    case 8:
                        System.out.println("On the eighth day of Christmas, my true love gave to me:");
                        System.out.println(repeatedLyrics);
                        repeatedLyrics = day9 + repeatedLyrics;
                        break;
                    case 9:
                        System.out.println("On the ninth day of Christmas, my true love gave to me:");
                        System.out.println(repeatedLyrics);
                        repeatedLyrics = day10 + repeatedLyrics;
                        break;
                    case 10:
                        System.out.println("On the tenth day of Christmas, my true love gave to me:");
                        System.out.println(repeatedLyrics);
                        repeatedLyrics = day11 + repeatedLyrics;
                        break;
                    case 11:
                        System.out.println("On the eleventh day of Christmas, my true love gave to me:");
                        System.out.println(repeatedLyrics);
                        repeatedLyrics = day12 + repeatedLyrics;
                        break;
                    case 12:
                        System.out.println("On the twelfth day of Christmas, my true love gave to me:");
                        System.out.println(repeatedLyrics);
                        break;
                }
            }
        }
}



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TheTimeInWords {

    public static void main(String[] args) {

        System.out.println("Solution.timeInWords: " + Solution.timeInWords(5,59));
    }

    static class Solution {

        public static String timeInWords(int h, int m) {

            ArrayList<String> numbers = new ArrayList<>(Arrays.asList(
                    "zero",
                    "one",
                    "two",
                    "three",
                    "four",
                    "five",
                    "six",
                    "seven",
                    "eight",
                    "nine",
                    "ten",
                    "eleven",
                    "twelve",
                    "thirteen",
                    "fourteen",
                    "fifteen",
                    "sixteen",
                    "seventeen",
                    "eighteen",
                    "nineteen",
                    "twenty",
                    "twenty one",
                    "twenty two",
                    "twenty three",
                    "twenty four",
                    "twenty five",
                    "twenty six",
                    "twenty seven",
                    "twenty eight",
                    "twenty nine"
            ));

            String time = "";

            if (m<30){
                if (m==0) time = numbers.get(h) + " o' clock";
                else if (m==15) time = "quarter past " + numbers.get(h);
                else if (m==1) time = numbers.get(m)+ " minute past " + numbers.get(h);
                else time = numbers.get(m)+ " minutes past " + numbers.get(h);

            }
            else{
                if (m==30) time = "half past " + numbers.get(h);
                else if (m==45) time = "quarter to " + numbers.get(h+1);
                else if (m==59) time = numbers.get(60-m) + " minute to " + numbers.get(h+1);
                else time = numbers.get(60-m) + " minutes to " + numbers.get(h+1);
            }

            return time;
        }


    }

}

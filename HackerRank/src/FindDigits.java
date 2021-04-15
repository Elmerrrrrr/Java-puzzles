import java.util.ArrayList;

public class FindDigits {
    
    static int findDigits(int n) {
        
        ArrayList<Integer> numbersAr = new ArrayList<Integer>();
        int check = n;
        while(check>0){
            numbersAr.add(check % 10);
            check /= 10;
        }
        
        int divisors = 0;
        for (Integer integer : numbersAr) {
            if (integer!=0 && n%integer == 0) {
                divisors++;
            }
        }
        return divisors;
    }
}

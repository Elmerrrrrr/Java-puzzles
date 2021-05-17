public class ChocolateFeast {
    
    public static int chocolateFeast(int n, int c, int m) {
        
        // n= money to spend,
        // c= cost of a chocolate
        // m= and the number of wrappers he can turn in for a free chocolate
        
        int chocolateBars = n/c;
        int eatenChocolateBars = chocolateBars;
        // promotion
        while (chocolateBars>=m){
            chocolateBars = chocolateBars-m+1;
            eatenChocolateBars++;
        }
        
        return eatenChocolateBars;
    }
    
    
}

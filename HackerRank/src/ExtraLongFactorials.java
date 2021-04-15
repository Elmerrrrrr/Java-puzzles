import java.math.BigInteger;

public class ExtraLongFactorials {
    
    
    static BigInteger extraLongFactorials(int n) {
        
        BigInteger sum = BigInteger.valueOf(n);
    
        for (int i=(n-1); i>0; i--) {
            sum=sum.multiply(BigInteger.valueOf(i));
        }
        System.out.println(sum);
    return sum;
    }
}

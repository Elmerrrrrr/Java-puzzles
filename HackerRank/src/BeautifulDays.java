public class BeautifulDays {
    
    
    static int beautifulDays(int i, int j, int k) {
    
    int beautifulDays = 0;
       
       for (int x= i; x<=j; x++ ){
           
           int reverse = 0;
           int y =x;
           while(y!=0){
               int lastDigit = y % 10;
               reverse = (reverse * 10) + lastDigit;
               y/= 10;
           }
           double sum = (x-reverse)/(double)k;
           if (sum%1==0){
              beautifulDays++;
           }
       }
       
      return beautifulDays;
    }
    
}

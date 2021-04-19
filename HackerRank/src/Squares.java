public class Squares {
    
    static int squares(int a, int b) {
    
        int squares = 0;
        int x = 1;
        while(x*x < a)x++;
        while(x*x <= b){
            squares++;
            x++;
        }
        
//        for (int i = a; i <=b ; i++) {
//            if (Math.sqrt(i)%1==0) squares++;
//        }
       return squares;
    }
}

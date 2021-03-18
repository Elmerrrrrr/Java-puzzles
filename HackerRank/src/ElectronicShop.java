import java.util.ArrayList;
import java.util.Collections;

public class ElectronicShop {
    
    
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {

    int mostExpOpt = 0;
    ArrayList<Integer> sums = new ArrayList<>();
    
        for (int i = 0; i <keyboards.length ; i++) {
            
            for (int j = 0; j < drives.length ; j++) {
                
                sums.add((keyboards[i] + drives[j]));
                
            }
            
        }
        
        Collections.sort(sums);
    
        for (int i = 0; i <sums.size() ; i++) {
        
            if(b- sums.get(i)>=0 && b-sums.get((i+1> sums.size()?i:i+1))<0){
                mostExpOpt = sums.get(i);
            }
            else if(b-sums.get(i)<0 && mostExpOpt ==0 ){
                mostExpOpt = -1;
            }
 
        }
    
    
    return mostExpOpt;
    }
    
}

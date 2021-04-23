import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CutTheSticks {
    
    static int[] returnArr;
    static List<Integer> amountOfSticks;
    
    static int[] cutTheSticks(int[] arr) {
        
        Arrays.sort(arr);
        
        amountOfSticks = new ArrayList<>();
        amountOfSticks.add(arr.length);
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i-1]) {
                amountOfSticks.add(arr.length - i);
            }
        }
        
        returnArr = new int[amountOfSticks.size()];
        for (int i = 0; i < amountOfSticks.size(); i++) returnArr[i]= amountOfSticks.get(i);
        return returnArr;
          //or
//        return amountOfSticks.stream().mapToInt(i->i).toArray();
    }
    
}

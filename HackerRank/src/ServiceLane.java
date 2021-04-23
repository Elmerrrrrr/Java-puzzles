import java.util.ArrayList;
import java.util.List;

public class ServiceLane {
    
    public static List<Integer> serviceLane(int n, int t, List<List<Integer>> cases, List<Integer> widths) {
        
        List<Integer> maxVehicleWidthList = new ArrayList<>();
        int min = 0;
        int max = 0;
        List<Integer> tempList = new ArrayList<>();
        
        for (int i = 0; i < cases.size(); i++) {
    
            for (int j = 0; j < cases.get(i).size(); j++) {
                min = cases.get(i).get(0);
                max = cases.get(i).get(1);
            }
            for (int j = min; j <=max ; j++) {
                tempList.add(widths.get(j));
            }
            tempList.sort(Integer::compareTo);
            maxVehicleWidthList.add(tempList.get(0));
            tempList.clear();
        }
        
        return maxVehicleWidthList;
    }
    



}

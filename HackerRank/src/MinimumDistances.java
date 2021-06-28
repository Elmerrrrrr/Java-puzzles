import java.util.*;

public class MinimumDistances {

    public static int minimumDistances(List<Integer> a) {

        HashMap<Integer, Integer> hmap = new HashMap<>();
        int minDistance = Integer.MAX_VALUE, prevIndex = 0, currentIndex = 0;

        for (int i = 0; i < a.size(); i++) {
            if (hmap.containsKey(a.get(i))) {
                currentIndex = i;
                prevIndex = hmap.get(a.get(i));
                minDistance = Math.min((currentIndex - prevIndex), minDistance);
            }
            hmap.put(a.get(i), i);
        }

//        return (minDistance == Integer.MAX_VALUE ? -1 : minDistance);




        int min = -1;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i <a.size() ; i++) {

            for (int j = 0; j <a.size() ; j++) {

                if (a.get(i)==a.get(j)){
                    if (j-i>0){
                        list.add(j-i);
                    }
                }
            }
        }

       Collections.sort(list);
        if (list.size()!=0){
         min = list.get(0);
        }
    return min;
    }

}

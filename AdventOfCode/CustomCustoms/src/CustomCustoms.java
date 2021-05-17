import java.util.HashSet;
import java.util.List;

public class CustomCustoms {
    
    
    public static void main(String[] args) {
    
        List<String> arrayList = FileToArray.fileToArrayList();
        
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        int questions = 0;
    
        for (int i = 0; i < arrayList.size(); i++) {
            
            for (int j = 0; j < arrayList.get(i).length(); j++) {
                set.add(arrayList.get(i).charAt(j));
                questions = set.size();
            }
          
            if (arrayList.get(i).equals("") || i == arrayList.size()-1){
                count+=questions;
                set.clear();
            }
            
        }
        
        System.out.println("count: " + count);
        
    }
    
}
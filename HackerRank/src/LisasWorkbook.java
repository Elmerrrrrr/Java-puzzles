import java.util.List;

public class LisasWorkbook {
    
    public static int workbook(int n, int k, List<Integer> arr) {
        
        int specialProblems = 0;
        int page = 1;
    
        //chapter
        for (int i = 1; i < arr.size(); i++) {
    
            int problems = arr.get(i);
            
//            if ((problems % k > 0) && (problems % k < k))
//                page++;
                
            // problems
            for (int problem = 1; problem <= problems; problem++) {
                
                if (problem == page) specialProblems++;
                
                if ( (problem % k == 0) || (problem % k > 0) && (problem % k < k) && problem!=1 ) page++;
            }
        }
        return specialProblems;
    }
}
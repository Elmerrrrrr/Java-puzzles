public class AngryProfessor {
    
    static String angryProfessor(int k, int[] a) {
    
        String canceled = "YES";
        int onTime = 0;
    
        for (int j : a) {
            if (j <= 0) onTime++;
        }
        
        if (onTime >= k) canceled = "NO";
        
    return canceled;
    }
    
}

public class ViralAdvertising {
    
    static int viralAdvertising(int n) {
        
        int people = 5;
        int likes = 0;
        
        for (int i=0; i<n; i++){
            
             people /= 2;
             likes  += people;
             people *= 3;
        }
        
        return likes;
    }
    
}

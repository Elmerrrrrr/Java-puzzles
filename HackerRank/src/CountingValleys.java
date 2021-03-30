public class CountingValleys {
    
    public static int countingValleys(int steps, String path) {
        
        int level = 0;
        int valleyCount = 0;
        
        for (int i = 0; i <steps ; i++) {
            
            if (path.charAt(i) == 'U'){
                level++;
            }
            else if(path.charAt(i) == 'D'){
                
                if(level == 0){
                    valleyCount++;
                }
                level--;
            }
        }
        
        
        return valleyCount;
    }
    
}





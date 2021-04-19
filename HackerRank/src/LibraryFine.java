import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LibraryFine {
    
    static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) throws ParseException {
        
        SimpleDateFormat dateFormat = new SimpleDateFormat ("dd-MM-yyyy");
        Date returnDate = dateFormat.parse ( d1+"-"+m1+"-"+y1);
        Date dueDay = dateFormat.parse ( d2+"-"+m2+"-"+y2);
        
        //The getTime() method returns the number of milliseconds* since the Unix Epoch
        long diff= dueDay.getTime() - returnDate.getTime();
        long diffDays = diff / (24 * 60 * 60 * 1000);
        
        int fine= 0;
        
        if (y2>y1 || y2==y1 && m2>m1)
         return fine;
        
        if (y1>y2)
         return fine+=10000;
        
        if (m1>m2)
         return fine+=(m1-m2)*500;
        
        if (diffDays<0)
         fine+=Math.abs(diffDays)*15;
        
        return fine;
    }
}

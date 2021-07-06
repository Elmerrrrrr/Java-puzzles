import java.math.BigInteger;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws ParseException {
    
    
        //Assignment MatchingPairs
        int[] ar1 = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        int n1 = 9;
    
        int result1 = MatchingPairs.sockMerchant(n1, ar1);
        System.out.println("result 1: " + result1);
    
    
        //Counting Valleys
        String path = "DDUUDDUDUUUD";
        int steps = 12;
    
        int result2 = CountingValleys.countingValleys(steps, path);
        System.out.println("result 2: " + result2);
    
    
        //Electronic Shop
        int[] keyboards = {40, 50, 60};
        int[] drives = {5, 8, 12};
        int b = 60;
    
        int result3 = ElectronicShop.getMoneySpent(keyboards, drives, b);
        System.out.println("result 3: " + result3);
    
    
        //Utopian Tree
        int t = 3;
    
        int result4 = UtopianTree.utopianTree(t);
        System.out.println("result 4: " + result4);
    
        int n = 5;
        int result5 = ((int) Math.pow(2, (n + 3) / 2)) + (((int) Math.pow(-1, n)) - 3) / 2;
        System.out.println("result 5: " + result5);
    
    
        //Angry Professor
    
    
        //BeautifulDays
        int result7 = BeautifulDays.beautifulDays(20, 23, 6);
        System.out.println("result 7: " + result7);
    
    
        //ViralAdvertising
        int result8 = ViralAdvertising.viralAdvertising(3);
        System.out.println("result 8: " + result8);
    
        //FindDigits
        int result9 = FindDigits.findDigits(12);
        System.out.println("result 9: " + result9);
    
        //ExtraLongFactorials
        BigInteger result10 = ExtraLongFactorials.extraLongFactorials(25);
        System.out.println("result 10: " + result10);
    
        //Squares
        int result11 = Squares.squares(24, 49);
        System.out.println("result 11: " + result11);
    
    
        //LibraryFine
//        int result12 = LibraryFine.libraryFine(9, 6, 2015, 6, 6, 2015);
        int result12 = LibraryFine.libraryFine(2, 7, 1014, 1, 1, 1015);
        System.out.println("result 12: " + result12);
    
        //CutTheSticks
        int[] result13 = CutTheSticks.cutTheSticks(new int[]{1, 864, 999, 785, 255, 3, 888, 180});
        System.out.println("result 13: " + Arrays.toString(result13));
    
        //ServiceLane
        List<Integer> widths = new ArrayList<>(Arrays.asList(2, 3, 1, 2, 3, 2, 3, 3));
        List<List<Integer>> cases = new ArrayList<>();
       
        cases.add(new ArrayList<>(Arrays.asList(0,3)));
        cases.add(new ArrayList<>(Arrays.asList(4,6)));
        cases.add(new ArrayList<>(Arrays.asList(6,7)));
        cases.add(new ArrayList<>(Arrays.asList(3,5)));
        cases.add(new ArrayList<>(Arrays.asList(0,7)));
        
        List<Integer> result14 = ServiceLane.serviceLane(8,5, cases, widths);
        System.out.println("result 14: " + result14);
    
    
        int result16 = ChocolateFeast.chocolateFeast(6, 2, 2);
        System.out.println("result 16: " + result16);
        
        int result17 = LisasWorkbook.workbook(5, 3, new ArrayList<>(Arrays.asList(4, 2, 6, 1, 10)));
        System.out.println("result 17: " + result17);
    
//        int result17 = LisasWorkbook.workbook(10, 5, new ArrayList<>(Arrays.asList(3, 8, 15, 11, 14, 1, 9, 2, 24, 31)));
//        System.out.println("result 17: " + result17);

        String result18 = FairRations.fairRations(new ArrayList<Integer>(Arrays.asList(2, 3, 4, 5, 6 )));
//        String result18 = FairRations.fairRations(new ArrayList<Integer>(Arrays.asList(1,2)));
        System.out.println("result 18: " + result18);

        int result19 = MinimumDistances.minimumDistances(new ArrayList<Integer>(Arrays.asList(7, 1, 3, 4, 1, 7)));
//        int result19 = MinimumDistances.minimumDistances(new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 10)));
        System.out.println("result 19: " + result19);

//        String result20 = Encryption.encryption("feedthedog");
//        String result20 = Encryption.encryption("have a nice day");
        String result20 = Encryption.encryption("if man was meant to stay on the ground god would have given us roots");
        System.out.println("result 20: " + result20);


    }
}


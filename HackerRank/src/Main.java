public class Main {

    public static void main(String[] args) {


        //Assignment MatchingPairs
        int[] ar1 ={10, 20, 20, 10, 10, 30, 50, 10, 20};
        int n1=9;

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
        int b=60;
    
        int result3 = ElectronicShop.getMoneySpent(keyboards, drives, b);
        System.out.println("result 3: " + result3);
    
    
    
       //Utopian Tree
       int t = 3;
       
       int result4 = UtopianTree.utopianTree(t);
       System.out.println("result 4: " + result4);
    
        int n=5;
        int answer = ((int) Math.pow(2, (n + 3) / 2)) + (((int) Math.pow(-1, n)) - 3) / 2;
        System.out.println("result 4: " +answer);
    
    }


}

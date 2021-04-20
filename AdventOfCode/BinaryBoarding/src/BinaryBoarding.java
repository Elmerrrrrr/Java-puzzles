import java.util.*;

public class BinaryBoarding {


    public static void main(String[] args) {

        List<String> dataInputList = FileToArray.fileToArrayList();


        List<Integer> boardInputList = new ArrayList<>();

        int i =0;
        for (String data: dataInputList ) {

            //Split every sequence into letters
            String[] array = data.split("");
            int minC = 0;
            int maxC = 127;
            int minR = 0;
            int maxR = 7;
            i++;
            for (String character: array) {


                // Upper half column
                if (character.matches("B")) {
                    minC = (maxC - (maxC - minC)/2);
                    maxC = maxC;
//                    System.out.println("B- Min: " + minC + " max: " +maxC);
                }

                // Lower half column
                 if(character.matches("F")){

                    minC = minC;
                    maxC = (maxC - (maxC -minC)/2 -1);
//                    System.out.println("F- Min: " + minC + " max: " +maxC);
                    }



                // Upper half row
                if (character.matches("R")) {
                    minR = (maxR - (maxR - minR)/2);
                    maxR = maxR;
//                    System.out.println("R- Min: " + minR + " max: " +maxR);
                }

                // Lower half row
                if(character.matches("L")){
                    minR = minR;
                    maxR = (maxR - (maxR -minR)/2 -1);
                    
//                    System.out.println("L- Min: " + minR + " max: " +maxR);
                }



            }
            boardInputList.add(minC*8+minR);
            System.out.println("BoardingPass#"+i+" Column: " + minC+" seatID: "+(minC*8+minR));
            
            }
        

        
        
        boardInputList.sort(Integer::compareTo);
        boardInputList.forEach(System.out::println);
    
        
        //Part 2 - solution 1 (there is a duplicate so a hashset is needed)
        Set<Integer> noDuplicatesList = new HashSet<>(boardInputList);
    
        int sum = 0;
        for (int seatId : noDuplicatesList) sum+=seatId;
        
        int sumTotal = 0;
        for (int j = 51; j <=832 ;j++ ) sumTotal += j;
        
        System.out.println("MySeatId: " + (sumTotal -  sum));
        
        //Solution 2 with stream
        int MySeatId = boardInputList.stream().mapToInt(e -> e).filter( n -> boardInputList.contains(n) && boardInputList.contains(n + 2) && !boardInputList.contains(n + 1) ).sum() + 1;
        System.out.println("MySeatId: " + MySeatId);
    }


}



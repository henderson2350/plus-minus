import java.util.*;

public class plusMinus {
    public static void plusMinusFunc(List<Integer> arr) {
        //count how many negatives
        //count how many positives
        //count how many zeros
        //count how many totals

        float negCount = 0;
        float posCount = 0;
        float zeroCount = 0;
        float totalCount = arr.size();

        for (int i=0; i<arr.size(); i++) {
            if (arr.get(i) < 0) {
                negCount++;
            } else if (arr.get(i) > 0) {
                posCount++;
            } else {
                zeroCount++;
            }
        }

        //divide each of the numbers by the total number and print it out
        System.out.println(posCount / totalCount);
        System.out.println(negCount / totalCount);
        System.out.println(zeroCount / totalCount);


    }
}
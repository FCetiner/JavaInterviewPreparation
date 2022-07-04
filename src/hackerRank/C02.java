package hackerRank;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class C02 {
    public static void main(String[] args) {
//Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers.
// Then print the respective minimum and maximum values as a single line of two space-separated long integers.
        List<Integer> arr=new ArrayList<>();
        arr.add(256741038);
        arr.add(623958417 );
        arr.add(467905213 );
        arr.add(714532089 );
        arr.add(938071625);
        miniMaxSum(arr);
    }

    public static void miniMaxSum(List<Integer> arr) {
        arr.sort(Comparator.naturalOrder());
        long minSum=0;
        long maxSum=0;
        System.out.println(arr);
        for (int i = 0; i < arr.size(); i++) {
            if(i!=arr.size()-1) {
                minSum += arr.get(i);
            }
            if(i!=0) {
                maxSum += arr.get(i);
            }
        }
        System.out.println(minSum+" "+maxSum);

    }

}

package hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindTheMedian {
    public static void main(String[] args) {
        List<Integer> arr=new ArrayList<>();
        arr.add(11);
        arr.add(15);
        arr.add(10);
        arr.add(2);
        arr.add(3);
        System.out.println(findMedian(arr));
    }
    public static int findMedian(List<Integer> arr) {
        List<Integer> sortedArr=arr.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println(sortedArr);
        int length=sortedArr.size();

        return  sortedArr.get(length/2);
    }

}

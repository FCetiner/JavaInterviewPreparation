package hackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountingSort1 {
    public static void main(String[] args) {
        List<Integer> arr=new ArrayList<>();
        arr.add(11);
        arr.add(15);
        arr.add(10);
        arr.add(2);
        arr.add(3);
        System.out.println(countingSort(arr));
    }
    public static List<Integer> countingSort(List<Integer> arr) {
        // Write your code here
        List<Integer> res = new ArrayList<Integer>(Collections.nCopies(100, 0));
        for(Integer a : arr)
            res.set(a, res.get(a)+1);
        return res;
    }
}

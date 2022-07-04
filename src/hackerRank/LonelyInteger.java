package hackerRank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LonelyInteger {
    public static void main(String[] args) {
        //Given an array of integers, where all elements but one occur twice, find the unique element.
        List<Integer> arr=new ArrayList<>();
        arr.add(11);
        arr.add(15);
        arr.add(11);
        arr.add(2);
        arr.add(3);
        arr.add(3);
        arr.add(2);
        System.out.println(lonelyinteger(arr));
    }



        public static int lonelyinteger(List<Integer> a) {
            Map<Integer, Integer> map = new HashMap<>();
            for (Integer elem : a) {
                if (!map.containsKey(elem)) {
                    map.put(elem, 1);
                } else {
                    map.put(elem, map.get(elem)+1);
                }
            }

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() == 1) {
                    return entry.getKey();
                }

            }
            return 0;
        }
}

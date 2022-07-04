package hackerRank;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.abs;

public class DiagonalDifference {
    public static void main(String[] args) {
        //Given a square matrix, calculate the absolute difference between the sums of its diagonals.
        //
        //For example, the square matrix  is shown below:
        //
        //1 2 3
        //4 5 6
        //9 8 9
        //The left-to-right diagonal = . The right to left diagonal = . Their absolute difference is

        List<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        List<Integer> list2=new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);

        List<Integer> list3=new ArrayList<>();
        list3.add(9);
        list3.add(8);
        list3.add(9);

        List<List<Integer>> arr=new ArrayList<>();
        arr.add(list1);
        arr.add(list2);
        arr.add(list3);
        System.out.println(diagonalDifference(arr));
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        int downToUp = 0, upToDown = 0;
        int length = arr.size();
        for (int i = 0; i < length; i++) {
            upToDown += arr.get(i).get(i);
            downToUp += arr.get(length - (i + 1)).get(i);
        }
        return abs(downToUp-upToDown);
    }

}

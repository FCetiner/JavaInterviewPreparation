package hackerRank;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<Integer> arr=new ArrayList<>();
        arr.add(15);
        arr.add(-1);
        arr.add(-2);
        arr.add(2);
        arr.add(0);
plusMinus(arr);
    }

    public static void plusMinus(List<Integer> arr) {
        Double positive=0.0;
        Double negative=0.0;
        Double zero=0.0;
        int length=arr.size();
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i)<0){
                negative++;
            }else if(arr.get(i)>0){
                positive++;
            }else{
                zero++;
            }


        }
        System.out.println((positive/length)+" "+(negative/length)+" "+(zero/length));

    }
}

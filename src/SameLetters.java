import java.util.Arrays;
import java.util.TreeSet;

public class SameLetters {
    public static void main(String[] args) {
        //write a return method that check if a string is build out of the same letters as another string
String str1="abcbb";
String str2="cbaaaaa";
        System.out.println(findSameLetters(str1, str2));
        System.out.println(findSameLetters2(str1, str2));
        System.out.println(findSameLetters3(str1, str2));
        System.out.println(findSameLetters4(str1, str2));
    }

    private static boolean findSameLetters(String str1, String str2) {
        String[]arr1=str1.split("");
        String[]arr2=str2.split("");
        boolean result=false;
        if(str1.length()==str2.length()) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i].contains(arr2[i])) {
                    result = true;
                }
            }
        }else{
            return false;
        }
        return result;
    }

    private static boolean findSameLetters2(String str1, String str2) {
        String[]arr1=str1.split("");
        String[]arr2=str2.split("");
        boolean result=false;
        if(str1.length()==str2.length()) {
            while (str1.length() > 0) {
                if (str2.contains(str1.substring(0, 1))) {
                    str2 = str2.replace(str1.substring(0, 1), "");
                    str1 = str1.substring(1);
                }
            }
        }else{
            return false;
        }
        return str1.length()==str2.length();
    }
    private static boolean findSameLetters3(String str1, String str2) {
        char[]arr1=str1.toCharArray();
        char[]arr2=str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1,arr2);
    }

    private static boolean findSameLetters4(String str1, String str2) {
      str1= new TreeSet<String>(Arrays.asList(str1.split(""))).toString();
      str2= new TreeSet<String>(Arrays.asList(str2.split(""))).toString();
      return str1.equals(str2);
    }
}

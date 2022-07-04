import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class RemoveDublicate {
    public static void main(String[] args) {
        //Write return method that cna remove dublicated values from String

        String str="AAABBBCCC";
        System.out.println(removeDub(str));
        System.out.println(removeDub2(str));
        System.out.println(removeDub3(str));
    }

    private static String removeDub(String str) {
    String result="";
    while (str.length()>0){
        if(!result.contains(str.substring(0,1))){
            result+=str.substring(0,1);
            str=str.replaceAll(str.substring(0,1),"");
        }
    }

        return result;
    }
    private static String removeDub2(String str) {
        String result="";
        for (int i = 0; i < str.length(); i++) {
            if(!result.contains(str.substring(i,i+1))){
                result+=str.substring(i,i+1);
            }
        }

        return result;
    }

    //LinkedHashmap
    private static String removeDub3(String str) {

      str= new LinkedHashSet<String>(Arrays.asList(str.split(""))).toString();
        str=str.replace("[","").replace(", ","").replace("]","");
        return str;
    }
}

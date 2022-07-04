package tayfa;

public class reverseString {
    public static void main(String[] args) {
        System.out.println(reverseString("Ferhat"));
        System.out.println(reverseString2("Ferhat"));
    }

    public static String reverseString(String str){
        StringBuilder sb=new StringBuilder(str);
        str=sb.reverse().toString();
        return str;
    }
    public static String reverseString2(String str){
        String result="";
        String[]strArr=str.split("");
        for (int i = strArr.length-1; i >= 0; i--) {
            result+=strArr[i];
        }

        return result;
    }
}

package tayfa;

public class reverseString {
    public static void main(String[] args) {
        System.out.println(reverseString("Ferhat"));
        System.out.println(reverseString2("Ferhat"));
        System.out.println(reverseString3("Ferhat"));
        System.out.println(reverseString4("Ferhat"));
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

    public static String reverseString3(String str){
        String result="";
        while (str.length()>0){
            result+=str.charAt(str.length()-1);
            str=str.substring(0,str.length()-1);
        }
        return result;
    }
    public static String reverseString4(String str){
        return new StringBuffer(str).reverse().toString();
    }
}

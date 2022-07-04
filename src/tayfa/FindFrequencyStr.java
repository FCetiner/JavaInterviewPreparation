package tayfa;

public class FindFrequencyStr {
    public static void main(String[] args) {
        System.out.println(findFrequency("AAABBCCC"));
    }
    public static String findFrequency(String str){

        String result="";
        while (str.length()>0) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.substring(i).contains(str.substring(0, 1)))
                    count++;
            }
           result += str.substring(0, 1) + count;
            str = str.replaceAll(str.substring(0, 1), "");
        }
        return result;
    }
}

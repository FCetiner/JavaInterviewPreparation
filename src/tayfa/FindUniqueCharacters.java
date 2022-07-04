package tayfa;

public class FindUniqueCharacters {
    public static void main(String[] args) {
        System.out.println(findUniqueCharacters("AAABBBCC"));
    }

    public static String findUniqueCharacters(String str){
        String result="";
        for (int i = 0; i < str.length(); i++) {
            if(!result.contains(str.charAt(i)+""))
                result+=str.charAt(i);
        }
        return result;
    }
}

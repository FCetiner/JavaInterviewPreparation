import java.util.Arrays;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
//Given a string s consisting of small English letters,
// find and return the first instance of a non-repeating character in it.
// If there is no such character, return '_'.

        String s="abacabaabacaba";
        System.out.println(answer(s));
    }

   public static char solution(String s) {
       char arr[] = s.toCharArray();
       char nonRepeated=0;
       int count=0;
       String repeated="";
       for (int i = 0; i < arr.length; i++) {
           if (nonRepeated == 0) {
               for (int j = i + 1; j < arr.length; j++) {
                   if (arr[i] == arr[j]) {
                       count++;
                       repeated+=arr[i];
                       System.out.println("repeated = " + repeated);
                       break;
                   }
               }
               if (count == 0) {
                   nonRepeated = arr[i];
               }
           }
           count=0;
       }

       return nonRepeated;
    }
    public static char answer(String s){
        char[] c=s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(s.indexOf(c[i])==s.lastIndexOf(c[i]))
                return c[i];
        }
        return '_';
    }
}

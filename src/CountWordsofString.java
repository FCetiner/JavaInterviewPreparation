import java.util.*;

public class CountWordsofString {
    public static void main(String[] args) {
        String str="sari sari kafa kafa sari bas.";
        countWords(str);
    }

    private static void countWords(String str) {
        String words[]=str.split(" ");
        System.out.println(Arrays.toString(words));
        List<String> wordsList=new ArrayList<>();
        for (String w:words) {
            wordsList.add(w.replaceAll("\\W",""));
        }
        System.out.println(wordsList);

        Map<String,Integer> numOfWords=new HashMap<>();
        for (String w:wordsList) {
            if (!numOfWords.containsKey(w)){
                numOfWords.put(w,1);
        }else {
                numOfWords.put(w,numOfWords.get(w)+1);
            }
        }
        System.out.println(numOfWords);
    }


}

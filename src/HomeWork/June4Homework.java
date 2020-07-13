package HomeWork;

import java.util.*;

public class June4Homework {
    public static void main (String[] args){
        List<String> words = new ArrayList<>(Arrays.asList("world","peace","happy","world","happy","grow","peace", "world"));
        Map <String, Integer> duplicate = getDuplicate(words);
        System.out.println( duplicate);
    }
    public static Map<String,Integer> getDuplicate (List<String> words) {
        Map<String, Integer> duplicate = new HashMap<>();
        int count = 1;
        for (int i = 0; i < words.size() - 1; i++) {
            if (!duplicate.containsKey(words.get(i))) {
                for (int j = i + 1; j < words.size(); j++) {
                    if (words.get(i).equalsIgnoreCase(words.get(j))) {
                        count++;
                    }
                }
                if (count > 1) {
                    duplicate.put(words.get(i), count);
                }

            }

        }
        return duplicate;
    }
}




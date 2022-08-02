package programmers.q17677;

import java.util.*;

public class Solution {

    public int solution(String str1, String str2) {
        List<String> str1s = toMultipleSets(str1.toLowerCase().toCharArray());
        List<String> str2s = toMultipleSets(str2.toLowerCase().toCharArray());

        Collections.sort(str1s);
        Collections.sort(str2s);
        
        List<String> intersection = intersection(str1s, str2s);
        List<String> union = union(str1s, str2s);

        double similarity = intersection.size() == 0 && union.size() == 0 ?
                1 :
                (double) intersection.size() / union.size();

        return (int) (similarity * 65536);
    }

    private List<String> toMultipleSets(char[] words) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < words.length - 1; i++) {
            char currentWord = words[i];
            char nextWord = words[i + 1];
            if (isAlphabet(currentWord) && isAlphabet(nextWord)) {
                result.add(currentWord + Character.toString(nextWord));
            }
        }
        return result;
    }

    private boolean isAlphabet(char word) {
        return 97 <= word && word <= 122;
    }
    
    private List<String> intersection(List<String> str1s, List<String> str2s) {
        List<String> result = new ArrayList<>();
        for (String str1 : str1s) {
            if (str2s.contains(str1)) {
                str2s.remove(str1);
                result.add(str1);
            }
        }
        return result;
    }

    private List<String> union(List<String> str1s, List<String> str2s) {
        List<String> result = new ArrayList<>(str1s);
        result.addAll(str2s);
        return result;
    }
}

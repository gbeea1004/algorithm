package codesignal.intro9;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    String[] allLongestStrings(String[] inputArray) {
        int maxLength = 0;
        for (String text : inputArray) {
            if (text.length() > maxLength) {
                maxLength = text.length();
            }
        }

        List<String> texts = new ArrayList<>();
        for (int i = 0; i < inputArray.length; i++) {
            if (maxLength == inputArray[i].length()) {
                texts.add(inputArray[i]);
            }
        }
        return texts.toArray(new String[texts.size()]);
    }
}

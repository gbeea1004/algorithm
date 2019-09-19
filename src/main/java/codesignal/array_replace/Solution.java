package codesignal.array_replace;

import java.util.stream.IntStream;

public class Solution {
    int[] arrayReplace(int[] inputArray, int elemToReplace, int substitutionElem) {
        IntStream.range(0, inputArray.length)
                .filter(i -> inputArray[i] == elemToReplace)
                .forEach(i -> inputArray[i] = substitutionElem);
        return inputArray;
    }
}

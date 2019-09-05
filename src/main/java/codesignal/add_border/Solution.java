package codesignal.add_border;

public class Solution {
    String[] addBorder(String[] picture) {
        String[] result = new String[picture.length + 2];
        topOrBottomBoarder(0, picture[0].length() + 2, result);

        StringBuilder sb = new StringBuilder();
        int index = 1;
        for (String text : picture) {
            sb.append("*").append(text).append("*");
            result[index] = sb.toString();
            sb.delete(0, sb.length());
            index++;
        }

        topOrBottomBoarder(result.length - 1, picture[0].length() + 2, result);
        return result;
    }

    private void topOrBottomBoarder(int index, int size, String[] result) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append("*");
        }
        result[index] = sb.toString();
    }
}

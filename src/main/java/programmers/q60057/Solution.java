package programmers.q60057;

public class Solution {

    public int solution(String s) {
        int answer = s.length();

        for (int sliceCount = 1; sliceCount <= s.length() / 2; sliceCount++) {
            StringBuilder result = new StringBuilder();
            Word word = new Word(s.substring(0, sliceCount), 1);

            for (int i = sliceCount; i < s.length(); i += sliceCount) {
                try {
                    String target = s.substring(i, i + sliceCount);
                    if (word.isSame(target)) {
                        word.increaseRepeatCount();
                    } else {
                        addText(result, word);
                        word = new Word(target, 1);
                    }
                } catch (StringIndexOutOfBoundsException e) {
                    result.append(s.substring(i));
                    break;
                }
            }
            addText(result, word);
            answer = Math.min(answer, result.length());
        }

        return answer;
    }

    private void addText(StringBuilder result, Word word) {
        if (word.getRepeatCount() != 1) {
            result.append(word.getRepeatCount());
        }
        result.append(word.getText());
    }
}

class Word {

    private final String text;
    private int repeatCount;

    public Word(String text, int repeatCount) {
        this.text = text;
        this.repeatCount = repeatCount;
    }

    public boolean isSame(String text) {
        return this.text.equals(text);
    }

    public void increaseRepeatCount() {
        repeatCount++;
    }

    public String getText() {
        return text;
    }

    public int getRepeatCount() {
        return repeatCount;
    }
}
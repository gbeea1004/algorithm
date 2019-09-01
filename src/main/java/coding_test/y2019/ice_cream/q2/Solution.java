package coding_test.y2019.ice_cream.q2;

public class Solution {
    public static void main(String[] args) {
        Note note = new Note();
        String[] result = note.start(new String[]{"note?", "keynote", "note_", "note123"});
        for (String s : result) {
            System.out.println(s);
        }
    }
}

class Note {
    public String[] start(String[] input) {
        for (String s : input) {
            int startText = s.charAt(0);
            int endText = s.charAt(s.length() - 1);
            System.out.println("시작 : " + startText);
            System.out.println("끝 : " + endText);
        }
        return null;
    }
}

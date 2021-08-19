package programmers.q72410;

public class Solution {
    public String solution(String new_id) {
        // 1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
        new_id = new_id.toLowerCase();

        // 2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < new_id.length(); i++) {
            char word = new_id.charAt(i);
            if (((97 <= word && word <= 122) || (48 <= word && word <= 57) || (word == 45) || (word == 95) || (word == 46))) {
                sb.append(new_id.charAt(i));
            }
        }
        new_id = sb.toString();

        if (new_id.equals("")) {
            return "aaa";
        }
        // 3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
        sb = new StringBuilder();
        sb.append(new_id.charAt(0));
        for (int i = 1; i < new_id.length(); i++) {
            char preWord = new_id.charAt(i - 1);
            char currentWord = new_id.charAt(i);

            if (preWord == 46 && currentWord == preWord) {
                continue;
            }
            sb.append(new_id.charAt(i));
        }

        // 4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
        new_id = sb.toString();
        if (new_id.charAt(0) == '.') {
            sb.delete(0, 1);
        }
        new_id = sb.toString();

        if (new_id.equals("")) {
            return "aaa";
        }

        if (new_id.charAt(new_id.length() - 1) == '.') {
            sb.delete(new_id.length() - 1, new_id.length());
        }
        new_id = sb.toString();

        // 5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
        if (new_id.equals("")) {
            return "aaa";
        }

        // 6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
        // 만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
        if (new_id.length() >= 16) {
            sb = new StringBuilder();
            for (int i = 0; i < 15; i++) {
                sb.append(new_id.charAt(i));
            }
            new_id = sb.toString();
            if (new_id.charAt(new_id.length() - 1) == '.') {
                sb.delete(new_id.length() - 1, new_id.length());
            }
            return sb.toString();
        }

        // 7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
        if (new_id.length() <= 2) {
            char lastWord = new_id.charAt(new_id.length() - 1);
            StringBuilder new_idBuilder = new StringBuilder(new_id);
            while (new_idBuilder.length() != 3) {
                new_idBuilder.append(lastWord);
            }
            return new_idBuilder.toString();
        }

        return sb.toString();
    }
}

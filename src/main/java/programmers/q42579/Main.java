package programmers.q42579;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] genres = {"classic", "pop", "classic", "pop", "classic", "classic"};
//        String[] genres = {"base", "b", "c", "d", "base"};
//        int[] plays = {500, 600, 150, 800, 2500};
        int[] plays = {400, 600, 150, 2500, 500, 500};
        System.out.println(Arrays.toString(solution.solution(genres, plays)));
    }
}

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> album = new HashMap<>();
        for (int i = 0; i < genres.length; i++) {
            if (album.get(genres[i]) == null) {
                album.put(genres[i], 0);
            }
            album.put(genres[i], album.get(genres[i]) + plays[i]);
        }
        List<Integer> answer = new ArrayList<>();

        // map 내림차순 정렬
        List<String> keySetAnswer = new ArrayList<>(album.keySet());
        Collections.sort(keySetAnswer, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return album.get(o2).compareTo(album.get(o1));
            }
        });

//        for (String s : keySetAnswer) {
//            System.out.println(s + " : " + album.get(s));
//        }

        for (String genre : keySetAnswer) {
            List<Integer> play = new ArrayList<>();
            for (int i = 0; i < genres.length; i++) {
                if (genres[i].equals(genre)) {
                    play.add(plays[i]);
                }
            }
            if (play.size() == 1) {
                answer.add(indexOf(answer, plays, play.get(0)));
                continue;
            }
            Collections.sort(play);
            answer.add(indexOf(answer, plays, play.get(play.size() - 1)));
            answer.add(indexOf(answer, plays, play.get(play.size() - 2)));
        }

        int[] result = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }
        return result;
    }

    public int indexOf(List<Integer> answer, int[] plays, int no) {
        for (int i = 0; i < plays.length; i++) {
            if (plays[i] == no) {
                if (!answer.contains(i)) {
                    return i;
                }
            }
        }
        return -1;
    }
}

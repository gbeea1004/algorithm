package programmers.q42888;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    private final String ENTER_MSG = "님이 들어왔습니다.";
    private final String GO_OUT_MSG = "님이 나갔습니다.";
    private final String ENTER = "Enter";
    private final String LEAVE = "Leave";
    private final String CHANGE = "Change";

    private Map<String, String> users = new HashMap<>();
    private List<User> chattingRoom = new ArrayList<>();

    public String[] solution(String[] record) {
        for (String texts : record) {
            String[] text = texts.split(" ");
            if (text[0].equals(ENTER)) {
                users.put(text[1], text[2]);
                chattingRoom.add(new User(text[0], text[1]));
                continue;
            }
            if (text[0].equals(LEAVE)) {
                chattingRoom.add(new User(text[0], text[1]));
                continue;
            }
            if (text[0].equals(CHANGE)) {
                users.put(text[1], text[2]);
            }
        }

        String[] answer = new String[chattingRoom.size()];
        for (int i = 0; i < answer.length; i++) {
            StringBuilder sb = new StringBuilder();
            if (chattingRoom.get(i).STATUS.equals(ENTER)) {
                answer[i] = sb.append(users.get(chattingRoom.get(i).ID)).append(ENTER_MSG).toString();
                continue;
            }
            answer[i] = sb.append(users.get(chattingRoom.get(i).ID)).append(GO_OUT_MSG).toString();
        }
        return answer;
    }

    private class User {
        private final String STATUS;
        private final String ID;

        public User(String STATUS, String ID) {
            this.STATUS = STATUS;
            this.ID = ID;
        }
    }
}

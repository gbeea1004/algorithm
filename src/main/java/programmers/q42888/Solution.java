package programmers.q42888;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    private Map<String, String> users = new HashMap<>();

    public String[] solution(String[] record) {
        List<User> chattingRoomUsers = new ArrayList<>();

        for (String text : record) {
            String[] control = text.split(" ");
            modify(chattingRoomUsers, control);
        }

        String[] answer = new String[chattingRoomUsers.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = messagePrint(chattingRoomUsers.get(i));
        }
        return answer;
    }

    private String messagePrint(User user) {
        StringBuilder sb = new StringBuilder();
        if (user.status.equals("Enter")) {
            return sb.append(user.name).append("님이 들어왔습니다.").toString();
        }
        return sb.append(user.name).append("님이 나갔습니다.").toString();
    }

    private void modify(List<User> chattingRoomUsers, String[] control) {
        if (control[0].equals("Enter")) {
            users.put(control[1], control[2]);
            chattingRoomUsers.add(new User(control[0], control[1], control[2]));
            for (User user : chattingRoomUsers) {
                user.changeName(control[1], control[2]);
            }
            return;
        }

        if (control[0].equals("Leave")) {
            chattingRoomUsers.add(new User(control[0], control[1], users.get(control[1])));
            return;
        }

        if (control[0].equals("Change")) {
            for (User user : chattingRoomUsers) {
                user.changeName(control[1], control[2]);
            }
        }
    }

    private class User {
        private final String id;
        private final String status;
        private String name;

        public User(String status, String id, String name) {
            this.status = status;
            this.id = id;
            this.name = name;
        }

        public void changeName(String id, String changedName) {
            if (this.id.equals(id)) {
                name = changedName;
            }
        }
    }
}

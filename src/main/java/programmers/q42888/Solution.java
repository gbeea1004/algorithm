package programmers.q42888;

import java.util.*;

public class Solution {

    private static final String ENTER = "Enter";
    private static final String LEAVE = "Leave";
    private static final String CHANGE = "Change";

    public String[] solution(String[] record) {
        List<User> users = new ArrayList<>();
        Map<String, String> userIds = new HashMap<>();

        for (String userInfo : record) {
            StringTokenizer st = new StringTokenizer(userInfo, " ");
            String behavior = st.nextToken();
            String userId = st.nextToken();
            String nickname;
            if (behavior.equals(LEAVE)) {
                nickname = "";
            } else {
                nickname = st.nextToken();
                userIds.put(userId, nickname);
            }
            if (behavior.equals(CHANGE)) {
                userIds.put(userId, nickname);
                continue;
            }
            users.add(new User(behavior, userId, nickname));
        }
        
        for (User user : users) {
            user.updateNickname(userIds.get(user.getUserId()));
        }

        List<String> result = new ArrayList<>();
        for (User user : users) {
            if (user.getBehavior().equals(ENTER)) {
                result.add(user.getNickname() + "님이 들어왔습니다.");
                continue;
            }
            if (user.getBehavior().equals(LEAVE)) {
                result.add(user.getNickname() + "님이 나갔습니다.");
            }
        }

        return result.toArray(new String[0]);
    }
}

class User {

    private final String behavior;
    private final String userId;
    private String nickname;

    public User(String behavior, String userId, String nickname) {
        this.behavior = behavior;
        this.userId = userId;
        this.nickname = nickname;
    }

    public void updateNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getBehavior() {
        return behavior;
    }

    public String getUserId() {
        return userId;
    }

    public String getNickname() {
        return nickname;
    }
}

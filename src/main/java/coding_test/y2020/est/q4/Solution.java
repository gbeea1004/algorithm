package coding_test.y2020.est.q4;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String solution(String S, String C) {
        String[] tokens = S.split("; ");
        StringBuilder sb = new StringBuilder();
        Map<String, Integer> users = new HashMap<>();
        for (int i = 0; i < tokens.length; i++) {
            String name = tokens[i];
            sb.append(name)
              .append(" ")
              .append("<");

            String[] nameSplit = name.split(" ");
            String firstName = nameSplit[nameSplit.length - 1].toLowerCase();
            if (firstName.contains("-")) {
                firstName = firstName.replaceAll("-", "");
            }
            sb.append(firstName)
              .append("_");

            String emailUserName = nameSplit[0].toLowerCase();
            if (!users.containsKey(emailUserName)) {
                users.put(emailUserName, 2);
                sb.append(emailUserName)
                  .append("@")
                  .append(C.toLowerCase())
                  .append(".com");
            } else {
                Integer no = users.get(emailUserName);
                sb.append(emailUserName)
                  .append(no)
                  .append("@")
                  .append(C.toLowerCase())
                  .append(".com");
                users.put(emailUserName, users.get(emailUserName) + 1);
            }

            sb.append(">");
            if (i != tokens.length - 1) {
                sb.append("; ");
            }
        }
        return sb.toString();
    }
}

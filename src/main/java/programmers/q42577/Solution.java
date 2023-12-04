package programmers.q42577;

import java.util.HashMap;
import java.util.Map;

public class Solution {

  public boolean solution(String[] phone_book) {
    Map<String, Integer> checker = new HashMap<>();
    int phoneCount = phone_book.length;
    for (int i = 0; i < phoneCount; i++) {
      checker.put(phone_book[i], i);
    }

    for (String phone : phone_book) {
      int phoneLength = phone.length();
      for (int j = 0; j < phoneLength; j++) {
        if (checker.containsKey(phone.substring(0, j))) {
          return false;
        }
      }
    }

    return true;
  }
}

package programmers.q181885;

import java.util.ArrayList;
import java.util.List;

public class Solution {

  public String[] solution(String[] todo_list, boolean[] finished) {
    List<String> result = new ArrayList<>();
    int length = todo_list.length;

    for (int i = 0; i < length; i++) {
      if (!finished[i]) {
        result.add(todo_list[i]);
      }
    }

    return result.toArray(new String[0]);
  }
}

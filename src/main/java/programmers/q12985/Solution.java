package programmers.q12985;

public class Solution {

  public int solution(int n, int a, int b) {
    int answer = 0;
    boolean[] members = new boolean[n];
    members[a - 1] = true;
    members[b - 1] = true;

    while (true) {
      answer++;
      int length = members.length;
      boolean[] nextMembers = new boolean[length / 2];
      int nextMembersIndex = 0;

      for (int i = 0; i < length; i += 2) {
        boolean target1 = members[i];
        boolean target2 = members[i + 1];

        if (target1 && target2) {
          return answer;
        }

        nextMembers[nextMembersIndex++] = target1 || target2;
      }

      members = nextMembers;
    }
  }
}

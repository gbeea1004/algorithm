package programmers.q49993;

public class Main {
    public static void main(String[] args) {
        String skill = "CBD";
        String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
        Solution solution = new Solution();
        System.out.println(solution.solution(skill, skill_trees));
    }
}

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        for (String skill_tree : skill_trees) {
            StringBuilder sb = new StringBuilder();
            String[] s = skill_tree.split("");
            for (String e : s) {
                if (skill.contains(e)) {
                    sb.append(e);
                }
            }
            System.out.println(sb.toString());
            String[] sk = skill.split("");
            boolean isOnSkill = true;
            for (int i = 0; i < sb.length(); i++) {
                if (!sk[i].equals(sb.substring(i, i + 1))) {
                    isOnSkill = false;
                    break;
                }
            }

            if (isOnSkill) {
                answer++;
            }
        }
        return answer;
    }
}

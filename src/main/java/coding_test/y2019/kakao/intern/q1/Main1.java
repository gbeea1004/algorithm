package coding_test.y2019.kakao.intern.q1;

public class Main1 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String phone = "+82-10-1234-5678";
        System.out.println(solution.solution(phone));
    }
}

class Solution {
    public int solution(String phone_number) {
//        유형 1 : 010-XXXX-XXXX
//        유형 2 : 010XXXXXXXX
//        유형 3 : +82-10-XXXX-XXXX
        int answer = -1;
        if (phone_number.substring(0, 3).equals("010")) {
            if (phone_number.charAt(3) == '-') {
                int len = phone_number.length();
                if (len != 13) {
                    return answer;
                }
                for (int i = 4; i < len; i++) {
                    int no = phone_number.charAt(i);
                    if (i == 8 && phone_number.charAt(i) != '-') {
                        return answer;
                    }

                    if (i != 8 && (no < 48 || no > 57)) {
                        return answer;
                    }
                }
                answer = 1;
                return answer;
            } else if (!phone_number.contains("-")) {
                int len = phone_number.length();
                if (len != 11) {
                    return answer;
                }
                for (int i = 3; i < len; i++) {
                    int no = phone_number.charAt(i);
                    System.out.println("no :" + no);
                    if (no < 48 || no > 57) {
                        return answer;
                    }
                }
                answer = 2;
                return answer;
            }
        } else if (phone_number.substring(0, 7).equals("+82-10-")) {
            for (int i = 7; i < phone_number.length(); i++) {
                int no = phone_number.charAt(i);
                if (i == 11 && phone_number.charAt(i) != '-') {
                    return answer;
                }

                if (i != 11 && (no < 48 || no > 57)) {
                    return answer;
                }
            }
            answer = 3;
            return answer;
        }
        return answer;
    }
}
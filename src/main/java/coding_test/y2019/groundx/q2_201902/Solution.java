package coding_test.y2019.groundx.q2_201902;

/*
 * 대각선과 마주치는 개수
 * 참고 : https://m.blog.naver.com/PostView.nhn?blogId=orbis1020&logNo=220664563768&proxyReferer=https%3A%2F%2Fwww.google.com%2F
 */

public class Solution {
    public int solution(int width, int hegith) {
        int dotCount = countOfDot(width, hegith);

        // 격자점이 있다면
        if (dotCount > 0) {
            return width + hegith - 1 - dotCount;
        }

        // 격자점이 없다면
        return width + hegith - 1;
    }

    // 격자점의 개수
    private int countOfDot(int width, int hegith) {
        int big = width;
        int small = hegith;
        int checkEnd = 1;

        if (width < hegith) {
            big = hegith;
            small = width;
        }

        while (checkEnd > 0) {
            checkEnd = big % small;
            big = small;
            small = checkEnd;
        }
        return big - 1; // (가로 세로 최대공약수) - 1
    }
}

package programmers.q120830;

public class Solution {

    private static final int LAMB_SKEWERS_PRICE = 12000;
    private static final int DRINK_PRICE = 2000;

    public int solution(int n, int k) {
        int serviceDrinkCount = n / 10;
        return LAMB_SKEWERS_PRICE * n + DRINK_PRICE * (k - serviceDrinkCount);
    }
}

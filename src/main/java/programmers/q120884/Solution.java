package programmers.q120884;

public class Solution {

  public int solution(int chicken) {
    int serviceChickenCount = 0;
    int coupon = chicken;

    while (coupon >= 10) {
      int leftCoupon = coupon % 10;
      serviceChickenCount += coupon / 10;
      coupon = leftCoupon + coupon / 10;
    }

    return serviceChickenCount;
  }
}

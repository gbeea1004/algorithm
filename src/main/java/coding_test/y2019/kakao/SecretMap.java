package coding_test.y2019.kakao;

public class SecretMap {
    // 비밀 지도 (난이도 : 하)
    public static void main(String[] args) {

        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        for (int i = 0; i < n; i++) {
            int target = 1;
            int arr = arr1[i] | arr2[i];
            for (int j = 0; j < n; j++) {
                System.out.print((arr & target) > 0 ? "#" : " ");
                target = target << 1;
            }
            System.out.println();
        }
    }
}

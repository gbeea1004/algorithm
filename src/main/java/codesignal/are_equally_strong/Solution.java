package codesignal.are_equally_strong;

public class Solution {
    boolean areEquallyStrong(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
        int temp = 0;
        if (yourLeft > yourRight) {
            temp = yourLeft;
            yourLeft = yourRight;
            yourRight = temp;
        }

        if (friendsLeft > friendsRight) {
            temp = friendsLeft;
            friendsLeft = friendsRight;
            friendsRight = temp;
        }

        return yourLeft == friendsLeft && yourRight == friendsRight;
    }
}

package coding_test.y2020.est.q3;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int solution(int[] A) {
        Tree tree = getTree(A[0], A[1]);
        boolean alreadyPleasing = true;
        for (int i = 2; i < A.length; i++) {
            if (!tree.isAestheticallyPleasing(A[i])) {
                alreadyPleasing = false;
                break;
            }
        }
        if (alreadyPleasing) {
            return 0;
        }

        int woodCutIndex = 0;
        int count = 0;
        while (woodCutIndex != A.length) {
            List<Integer> leftOverTrees = new ArrayList<>();
            for (int i = 0; i < A.length; i++) {
                if (i == woodCutIndex) {
                    continue;
                }
                leftOverTrees.add(A[i]);
            }

            if (isAestheticallyPleasing(leftOverTrees)) {
                count++;
            }
            woodCutIndex++;
        }

        if (count == 0) {
            return -1;
        }
        return count;
    }

    private boolean isAestheticallyPleasing(List<Integer> trees) {
        Tree tree = getTree(trees.get(0), trees.get(1));
        for (int i = 2; i < trees.size(); i++) {
            if (!tree.isAestheticallyPleasing(trees.get(i))) {
                return false;
            }
        }
        return true;
    }

    private Tree getTree(int current, int next) {
        if (current > next) {
            return new Tree(Status.DOWN, next);
        }
        if (current < next) {
            return new Tree(Status.UP, next);
        }
        return new Tree(Status.SAME, next);
    }
}

enum Status {
    UP, DOWN, SAME
}

class Tree {
    private Status status;
    private int height;

    public Tree(Status status, int height) {
        this.status = status;
        this.height = height;
    }

    public boolean isAestheticallyPleasing(int next) {
        if (status.equals(Status.UP)) {
            if (height > next) {
                height = next;
                status = Status.DOWN;
                return true;
            }
            return false;
        }
        if (status.equals(Status.DOWN)) {
            if (height < next) {
                height = next;
                status = Status.UP;
                return true;
            }
            return false;
        }
        return false;
    }
}

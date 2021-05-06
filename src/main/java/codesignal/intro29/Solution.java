package codesignal.intro29;

public class Solution {
    boolean chessBoardCellColor(String cell1, String cell2) {
        boolean cellA = ((int) cell1.charAt(0) % 2 == 0) == (cell1.charAt(1) % 2 == 0);
        boolean cellB = ((int) cell2.charAt(0) % 2 == 0) == (cell2.charAt(1) % 2 == 0);

        return cellA == cellB;
    }
}

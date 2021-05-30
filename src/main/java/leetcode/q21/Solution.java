package leetcode.q21;

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode tempNode = new ListNode();
        ListNode currentNode = tempNode;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                currentNode.next = l1;
                l1 = l1.next;
            } else {
                currentNode.next = l2;
                l2 = l2.next;
            }
            currentNode = currentNode.next;
        }

        while (l1 != null) {
            currentNode.next = l1;
            l1 = l1.next;
            currentNode = currentNode.next;
        }
        while (l2 != null) {
            currentNode.next = l2;
            l2 = l2.next;
            currentNode = currentNode.next;
        }

        return tempNode.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
package leetcode.q160;

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null)
            return null;

        ListNode aPointer = headA;
        ListNode bPointer = headB;

        while (aPointer != bPointer) {
            aPointer = aPointer == null ? headB : aPointer.next;
            bPointer = bPointer == null ? headA : bPointer.next;
        }
        return aPointer;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}
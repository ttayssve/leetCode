package org.code;

public class IntersectionOfTwoLinkedLists {
    public static void main(String[] args) {
        ListNode headA = new ListNode(4);
        ListNode headB = new ListNode(5);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(8);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);
        headA.next = node1;
        headA.next.next = node2;
        headA.next.next.next = node3;
        headB.next = node4;
        headB.next.next = node2;
        ListNode result = getIntersectionNode(headA, headB);
        System.out.println(result.val);
    }

    private static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;
        int aLength = 0;
        int bLength = 0;
        while (a != null) {
            aLength++;
            a = a.next;
        }
        while (b != null) {
            bLength++;
            b = b.next;
        }
        a = headA;
        b = headB;
        if (aLength > bLength) {
            int diff = aLength - bLength;
            while (diff > 0) {
                a = a.next;
                diff--;
            }
        } else {
            int diff = bLength - aLength;
            while (diff > 0) {
                b = b.next;
                diff--;
            }
        }
        while (a != null && b != null) {
            if (a == b) {
                return a;
            }
            a = a.next;
            b = b.next;
        }
        return null;
    }
}

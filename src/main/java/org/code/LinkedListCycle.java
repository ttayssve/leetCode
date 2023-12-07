package org.code;

public class LinkedListCycle {
    public static void main(String[] args) {
        ListNode head = new ListNode(3,
                new ListNode(2,
                        new ListNode(0,
                                new ListNode(-4))));
        head.next.next.next.next = head.next;
        System.out.println(hasCycle(head));
    }

    private static boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode slowPointer = head;
        ListNode fastPointer = head.next;
        while (slowPointer != fastPointer) {
            if (fastPointer == null || fastPointer.next == null) {
                return false;
            }
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        return true;
    }
}

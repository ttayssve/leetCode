package org.code;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3)));
        System.out.println(head);
        System.out.println(reverseList(head));
    }

    private static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        while(curr != null) {
            // 1. Store the next node
            next = curr.next;
            // 2. Point the current node to the previous node
            curr.next = prev;
            // 3. Move the prev node to the current node
            prev = curr;
            // 4. Move the current node to the next node
            curr = next;
        }
        return prev;
    }
}

package org.code;

public class PalindromeLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(2,
                                new ListNode(1))));
        System.out.println(isPalindrome(head));
    }

    private static boolean isPalindrome(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode slowPointer = head;
        ListNode fastPointer = head;
        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        ListNode reversed = reverseList(slowPointer);
        while (reversed != null) {
            if (head.val != reversed.val) {
                return false;
            }
            head = head.next;
            reversed = reversed.next;
        }
        return true;
    }

    private static ListNode reverseList(ListNode slowPointer) {
        ListNode prev = null;
        ListNode curr = slowPointer;
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

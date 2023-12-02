package org.code;

public class ListNode {
    int val;
    ListNode next;
    public ListNode(int i) {
        this.val = i;
        this.next = null;
    }

    public ListNode(int i, ListNode next) {
        this.val = i;
        this.next = next;
    }
}

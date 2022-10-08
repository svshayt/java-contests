package com.svshayt.leetcode.problemset.problem_876;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class Solution876 {

    public ListNode middleNode(ListNode head) {
        if (head.next == null) {
            return head;
        }
        ListNode pointer = head;
        ListNode result = head;
        int size = 0;
        while(pointer != null) {
            size++;
            pointer = pointer.next;
        }
        pointer = head;
        int middle = size / 2;
        size = 0;
        while(pointer != null) {
            size++;
            if (size >= middle) {
                result = pointer.next;
                break;
            }
            pointer = pointer.next;
        }
        return result;
    }
}

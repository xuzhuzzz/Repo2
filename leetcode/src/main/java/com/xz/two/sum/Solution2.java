package com.xz.two.sum;


/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */


public class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode head = new ListNode();
        head.val = l1.val + l2.val;

        ListNode preNode = head;

        ListNode next1 = l1.next;
        ListNode next2 = l2.next;

        while (next1 != null || next2 != null) {
            ListNode currentNode = new ListNode();
            if (preNode.val >= 10) {
                currentNode.val +=1;
                preNode.val-=10;
            }

            if (next1 != null) {
                currentNode.val +=next1.val;
            }
            if (next2 != null) {
                currentNode.val +=next2.val;
            }

            preNode.next=currentNode;
            preNode = currentNode;
            next1 = next1.next;
            next2 = next2.next;
        }
        if(preNode.val>=10){
            preNode.val-=10;
            preNode.next=new ListNode(1);
        }
        return head;
    }
}

package com.xz.two.sum;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
    public void printNode(){
        ListNode pNext = this.next;
        System.out.print("["+val);
        while (pNext!=null){
            System.out.print(" "+pNext.val+",");
            pNext = pNext.next;
        }
        System.out.println("]");
    }
}
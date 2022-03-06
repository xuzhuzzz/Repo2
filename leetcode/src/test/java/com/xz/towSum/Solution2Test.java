package com.xz.towSum;

import com.xz.two.sum.ListNode;
import com.xz.two.sum.Solution2;
import org.junit.Test;

public class Solution2Test {

    @Test
    public void testAddTwoNumbers(){
        ListNode node3 = new ListNode(3);
        ListNode node2 = new ListNode(4,node3);
        ListNode node1 = new ListNode(2,node2);

        ListNode node23 = new ListNode(4);
        ListNode node22 = new ListNode(6,node23);
        ListNode node21 = new ListNode(5,node22);
        Solution2 solution2 = new Solution2();
        ListNode result = solution2.addTwoNumbers(node1,node21);
        result.printNode();
        // [2,4,3]
        // [5,6,4]
    }
}

package evgeniy.prokhorov.medium.m_2181;

import evgeniy.prokhorov.medium.ListNode;

/**
 * 2181. Insert Greatest Common Divisors in Linked List {@link "https://leetcode.com/problems/merge-nodes-in-between-zeros/description/"}.
 *
 * @author Evgeniy_Prokhorov
 */
public class MergeNodesInBetweenZeros {
    public ListNode mergeNodes(ListNode head) {
        ListNode result = new ListNode();
        ListNode temp = result;
        int sumList = 0;
        while (head.next != null) {
            if (head.next.val != 0) {
                sumList = sumList + head.next.val;
            } else {
                temp.next = new ListNode(sumList);
                temp = temp.next;
                sumList = 0;
            }

            head = head.next;
        }
        return result.next;
    }
}
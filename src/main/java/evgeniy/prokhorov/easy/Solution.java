package evgeniy.prokhorov.easy;

import evgeniy.prokhorov.medium.ListNode;

/**
 * 21. Merge Two Sorted Lists. {@link 'https://leetcode.com/problems/merge-two-sorted-lists/description/'}
 *
 * @author Evgeniy_Prohorov
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return null;
        }
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode result = new ListNode();
        ListNode currentListNodeOne = list1;
        ListNode currentListNodeTwo = list2;
        ListNode currentListResult = result;
        while (currentListNodeOne != null) {
            if (currentListNodeOne.val <= currentListNodeTwo.val) {
                currentListResult.val = currentListNodeOne.val;
                currentListResult.next = new ListNode(currentListNodeTwo.val);
            } else if (currentListNodeOne.val > currentListNodeTwo.val) {
                currentListResult.val = currentListNodeTwo.val;
                currentListResult.next = new ListNode(currentListNodeOne.val);
            }
            if (currentListNodeOne.next != null && currentListNodeTwo.next != null) {
                currentListResult.next.next = new ListNode();
            }
            currentListNodeOne = currentListNodeOne.next;
            currentListNodeTwo = currentListNodeTwo.next;
            currentListResult = currentListResult.next.next;
        }
        return result;
    }
}

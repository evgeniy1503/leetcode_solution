package evgeniy.prokhorov.medium.m_2807;

/**
 * 2807. Insert Greatest Common Divisors in Linked List {@link "https://leetcode.com/problems/insert-greatest-common-divisors-in-linked-list/description/"}.
 *
 * @author Evgeniy_Prokhorov
 */
public class InsertGreatestCommonDivisorsInLinkedList {

    public static ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode currentNode = head;
        while (currentNode.next != null) {
            ListNode nextNode = currentNode.next;
            int divisor = calculateDivisor(currentNode.val, nextNode.val);
            currentNode.next = new ListNode(divisor, nextNode);
            currentNode = nextNode;
        }
        return head;
    }

    private static int calculateDivisor(int val, int val1) {
        if (val > val1) {
            return calculate(val, val1);
        } else if (val < val1) {
            return calculate(val1, val);
        } else {
            return val;
        }
    }

    private static int calculate(int numFirst, int numSecond) {
        while(numFirst % numSecond != 0) {
            int remains = numFirst % numSecond;
            return calculate(numSecond, remains);
        }
        return numSecond;
    }
}

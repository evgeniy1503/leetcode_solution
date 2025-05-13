package evgeniy.prokhorov.medium.m_2807;

import evgeniy.prokhorov.medium.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * InsertGreatestCommonDivisorsInLinkedListTest.
 *
 * @author Evgeniy_Prokhorov
 */
class InsertGreatestCommonDivisorsInLinkedListTest {

    @Test
    void insertGreatestCommonDivisors() {
        ListNode head = new ListNode(18, new ListNode(6, new ListNode(10, new ListNode(3))));

        ListNode result = InsertGreatestCommonDivisorsInLinkedList.insertGreatestCommonDivisors(head);

        ListNode expectation = new ListNode(18, new ListNode(6, new ListNode(6, new ListNode(2, new ListNode(10, new ListNode(1, new ListNode(3)))))));

        Assertions.assertEquals(expectation.val, result.val);
        Assertions.assertEquals(expectation.next.val, result.next.val);
        Assertions.assertEquals(expectation, result);
    }
}
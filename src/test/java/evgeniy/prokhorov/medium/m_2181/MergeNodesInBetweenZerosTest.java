package evgeniy.prokhorov.medium.m_2181;

import static org.junit.jupiter.api.Assertions.*;

import evgeniy.prokhorov.medium.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * MergeNodesInBetweenZerosTest.
 *
 * @author Evgeniy_Prokhorov
 */
class MergeNodesInBetweenZerosTest {

    @Test
    void mergeNodes() {
        // 0,3,1,0,4,5,2,0
        ListNode head = new ListNode(0, new ListNode(3, new ListNode(1, new ListNode(0, new ListNode(4, new ListNode(5, new ListNode(2, new ListNode(0))))))));

        MergeNodesInBetweenZeros program = new MergeNodesInBetweenZeros();
        ListNode result = program.mergeNodes(head);

        ListNode expectation = new ListNode(4, new ListNode(11));

        Assertions.assertEquals(expectation, result);
    }

    @Test
    void mergeNodes2() {
        // 0,1,0,3,0,2,2,0
        ListNode head = new ListNode(0, new ListNode(1, new ListNode(0, new ListNode(3, new ListNode(0, new ListNode(2, new ListNode(2, new ListNode(0))))))));

        MergeNodesInBetweenZeros program = new MergeNodesInBetweenZeros();
        ListNode result = program.mergeNodes(head);

        ListNode expectation = new ListNode(1, new ListNode(3, new ListNode(4)));

        Assertions.assertEquals(expectation, result);
    }
}
package evgeniy.prokhorov.medium.m_2161;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * PartitionArrayAccordingToGivenPivotTest.
 *
 * @author Evgeniy_Prokhorov
 */
class PartitionArrayAccordingToGivenPivotTest {

    @Test
    void pivotArray() {
        int[] array = {9,12,5,10,14,3,10};
        int pivot = 10;
        PartitionArrayAccordingToGivenPivot program = new PartitionArrayAccordingToGivenPivot();
        int[] expectation = {9,5,3,10,10,12,14};

        int[] result = program.pivotArray(array, pivot);

        Assertions.assertArrayEquals(expectation, result);
    }
}
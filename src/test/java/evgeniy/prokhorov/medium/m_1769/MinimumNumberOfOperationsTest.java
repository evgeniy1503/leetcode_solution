package evgeniy.prokhorov.medium.m_1769;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * MinimumNumberOfOperationsTest.
 *
 * @author Evgeniy_Prokhorov
 */
class MinimumNumberOfOperationsTest {

    @Test
    void minOperations() {
        String boxes = "110";
        MinimumNumberOfOperations program = new MinimumNumberOfOperations();

        int[] result = program.minOperations(boxes);

        int[] expectation = {1,1,3};

        Assertions.assertArrayEquals(expectation, result);
    }
}
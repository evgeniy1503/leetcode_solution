package evgeniy.prokhorov.medium.m_1689;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void minPartitions_first() {
        int result = Solution.minPartitions("32");

        Assertions.assertEquals(3, result);
    }

    @Test
    void minPartitions_second() {
        int result = Solution.minPartitions("82734");

        Assertions.assertEquals(8, result);
    }

    @Test
    void minPartitions_third() {
        int result = Solution.minPartitions("27346209830709182346");

        Assertions.assertEquals(9, result);
    }
}
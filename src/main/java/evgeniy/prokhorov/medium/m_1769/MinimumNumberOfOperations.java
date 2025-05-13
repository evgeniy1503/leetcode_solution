package evgeniy.prokhorov.medium.m_1769;

/**
 * 1769. Insert Greatest Common Divisors in Linked List {@link "https://leetcode.com/problems/minimum-number-of-operations-to-move-all-balls-to-each-box/description/"}.
 *
 * @author Evgeniy_Prokhorov
 */
public class MinimumNumberOfOperations {
    public int[] minOperations(String boxes) {
        char[] chars = boxes.toCharArray();
        int[] result = new int[chars.length];
        for (int i = 0; chars.length > i; i++) {
            for (int j = 0; chars.length > j; j++)
                if (chars[j] == '1') {
                    result[i] += Math.abs(i - j);
                }
        }
        return result;
    }
}

package evgeniy.prokhorov.medium.m_1689;


/**
 * 1689. Partitioning Into Minimum Number Of Deci-Binary Numbers {@link "https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers/description/?envType=problem-list-v2&envId=2cvhynj2"}.
 *
 * @author Evgeniy_Prokhorov
 */

public class Solution {
    public static int minPartitions(String n) {
        int result = 0;
        for (char c : n.toCharArray()) {
            if (Character.getNumericValue(c) > result) {
                result = Character.getNumericValue(c);
            }
        }
        return result;
    }
}

package evgeniy.prokhorov.medium.m_2161;

/**
 * 2161. Insert Greatest Common Divisors in Linked List {@link "https://leetcode.com/problems/partition-array-according-to-given-pivot/description/"}.
 *
 * @author Evgeniy_Prokhorov
 */
public class PartitionArrayAccordingToGivenPivot {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] result = new int[nums.length];
        int indexResult = 0;
        for (int num : nums) {
            if (num < pivot) {
                result[indexResult] = num;
                indexResult++;
            }
        }
        for (int num : nums) {
            if (num == pivot) {
                result[indexResult] = num;
                indexResult++;
            }
        }
        for (int num : nums) {
            if (num > pivot) {
                result[indexResult] = num;
                indexResult++;
            }
        }
        return result;
    }
}

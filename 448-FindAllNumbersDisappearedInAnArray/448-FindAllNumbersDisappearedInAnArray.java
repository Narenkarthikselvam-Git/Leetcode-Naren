// Last updated: 23/09/2026, 09:13:54
import java.util.*;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // Mark seen numbers by negating the value at their index
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }

        // Collect indices that remain positive → missing numbers
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }

        return result;
    }
}

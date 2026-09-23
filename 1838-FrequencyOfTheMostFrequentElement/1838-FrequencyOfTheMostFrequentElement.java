// Last updated: 23/09/2026, 09:11:18
import java.util.*;

class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        long total = 0; // running sum of window
        int left = 0;
        int result = 1;

        for (int right = 0; right < nums.length; right++) {
            total += nums[right];

            // shrink window if cost exceeds k
            while ((long) nums[right] * (right - left + 1) - total > k) {
                total -= nums[left];
                left++;
            }

            result = Math.max(result, right - left + 1);
        }

        return result;
    }
}

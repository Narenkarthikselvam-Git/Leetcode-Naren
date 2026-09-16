// Last updated: 16/09/2026, 10:05:57
import java.util.*;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Map<Integer, Long> bestPrefix = new HashMap<>();
        long prefixSum = 0;
        long ans = Long.MIN_VALUE;

        for (int num : nums) {
            prefixSum += num;

            // Check if there exists a prefix with value num - k or num + k
            if (bestPrefix.containsKey(num - k)) {
                ans = Math.max(ans, prefixSum - bestPrefix.get(num - k));
            }
            if (bestPrefix.containsKey(num + k)) {
                ans = Math.max(ans, prefixSum - bestPrefix.get(num + k));
            }

            // Store the best prefix sum for this number
            bestPrefix.put(num, Math.min(bestPrefix.getOrDefault(num, Long.MAX_VALUE), prefixSum - num));
        }

        return ans == Long.MIN_VALUE ? 0 : ans;
    }
}

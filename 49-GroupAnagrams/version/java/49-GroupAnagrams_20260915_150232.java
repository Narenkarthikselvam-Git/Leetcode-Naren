// Last updated: 15/09/2026, 15:02:32
1import java.util.*;
2
3class Solution {
4    public long maximumSubarraySum(int[] nums, int k) {
5        Map<Integer, Long> bestPrefix = new HashMap<>();
6        long prefixSum = 0;
7        long ans = Long.MIN_VALUE;
8
9        for (int num : nums) {
10            prefixSum += num;
11
12            // Check if there exists a prefix with value num - k or num + k
13            if (bestPrefix.containsKey(num - k)) {
14                ans = Math.max(ans, prefixSum - bestPrefix.get(num - k));
15            }
16            if (bestPrefix.containsKey(num + k)) {
17                ans = Math.max(ans, prefixSum - bestPrefix.get(num + k));
18            }
19
20            // Store the best prefix sum for this number
21            bestPrefix.put(num, Math.min(bestPrefix.getOrDefault(num, Long.MAX_VALUE), prefixSum - num));
22        }
23
24        return ans == Long.MIN_VALUE ? 0 : ans;
25    }
26}
27
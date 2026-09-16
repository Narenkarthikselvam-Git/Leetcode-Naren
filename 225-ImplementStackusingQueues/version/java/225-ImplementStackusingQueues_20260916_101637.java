// Last updated: 16/09/2026, 10:16:37
1import java.util.*;
2
3class Solution {
4    public int maxFrequency(int[] nums, int k) {
5        Arrays.sort(nums);
6        long total = 0; // running sum of window
7        int left = 0;
8        int result = 1;
9
10        for (int right = 0; right < nums.length; right++) {
11            total += nums[right];
12
13            // shrink window if cost exceeds k
14            while ((long) nums[right] * (right - left + 1) - total > k) {
15                total -= nums[left];
16                left++;
17            }
18
19            result = Math.max(result, right - left + 1);
20        }
21
22        return result;
23    }
24}
25
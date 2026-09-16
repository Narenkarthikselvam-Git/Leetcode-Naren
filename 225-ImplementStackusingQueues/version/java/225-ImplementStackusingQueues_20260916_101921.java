// Last updated: 16/09/2026, 10:19:21
1class Solution {
2    public int numSubarrayProductLessThanK(int[] nums, int k) {
3        if (k <= 1) return 0; // no product can be < k if k <= 1
4
5        int count = 0;
6        long product = 1;
7        int left = 0;
8
9        for (int right = 0; right < nums.length; right++) {
10            product *= nums[right];
11
12            // shrink window until product < k
13            while (product >= k && left <= right) {
14                product /= nums[left];
15                left++;
16            }
17
18            // all subarrays ending at right and starting from left..right are valid
19            count += (right - left + 1);
20        }
21
22        return count;
23    }
24}
25
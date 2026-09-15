// Last updated: 15/09/2026, 14:42:20
1class Solution {
2    public int maxSubarraySumCircular(int[] nums) {
3        int total = 0;
4        int maxSum = nums[0], curMax = 0;
5        int minSum = nums[0], curMin = 0;
6
7        for (int num : nums) {
8            total += num;
9            curMax = Math.max(num, curMax + num);
10            maxSum = Math.max(maxSum, curMax);
11            curMin = Math.min(num, curMin + num);
12            minSum = Math.min(minSum, curMin);
13        }
14        if (maxSum < 0) return maxSum;
15        return Math.max(maxSum, total - minSum);
16    }
17}
18
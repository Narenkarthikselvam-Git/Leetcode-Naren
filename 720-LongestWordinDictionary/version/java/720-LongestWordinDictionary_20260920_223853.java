// Last updated: 20/09/2026, 22:38:53
1class Solution {
2    public boolean isMonotonic(int[] nums) {
3        boolean increasing = true;
4        boolean decreasing = true;
5
6        for (int i = 1; i < nums.length; i++) {
7            if (nums[i] > nums[i - 1]) {
8                decreasing = false;
9            }
10            if (nums[i] < nums[i - 1]) {
11                increasing = false;
12            }
13        }
14
15        return increasing || decreasing;
16    }
17}
18
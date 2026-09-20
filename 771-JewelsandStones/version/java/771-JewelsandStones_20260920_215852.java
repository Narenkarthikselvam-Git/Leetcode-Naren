// Last updated: 20/09/2026, 21:58:52
1class Solution {
2    public int pivotIndex(int[] nums) {
3        int totalSum = 0;
4        for (int num : nums) {
5            totalSum += num;
6        }
7
8        int leftSum = 0;
9        for (int i = 0; i < nums.length; i++) {
10            int rightSum = totalSum - leftSum - nums[i];
11            if (leftSum == rightSum) {
12                return i;
13            }
14            leftSum += nums[i];
15        }
16
17        return -1;
18    }
19}
20
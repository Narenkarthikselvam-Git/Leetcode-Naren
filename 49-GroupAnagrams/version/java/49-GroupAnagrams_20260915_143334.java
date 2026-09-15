// Last updated: 15/09/2026, 14:33:34
1class Solution {
2    public int maxProduct(int[] nums) {
3        int max = nums[0];
4        int min = nums[0];
5        int result = nums[0];
6
7        for (int i = 1; i < nums.length; i++) {
8            int curr = nums[i];
9            if (curr < 0) {
10                int temp = max;
11                max = min;
12                min = temp;
13            }
14            max = Math.max(curr, max * curr);
15            min = Math.min(curr, min * curr);
16
17            result = Math.max(result, max);
18        }
19
20        return result;
21    }
22}
23
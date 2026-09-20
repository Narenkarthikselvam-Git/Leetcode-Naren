// Last updated: 20/09/2026, 21:57:05
1import java.util.*;
2
3class Solution {
4    public List<Integer> findDisappearedNumbers(int[] nums) {
5        // Mark seen numbers by negating the value at their index
6        for (int i = 0; i < nums.length; i++) {
7            int index = Math.abs(nums[i]) - 1;
8            if (nums[index] > 0) {
9                nums[index] = -nums[index];
10            }
11        }
12
13        // Collect indices that remain positive → missing numbers
14        List<Integer> result = new ArrayList<>();
15        for (int i = 0; i < nums.length; i++) {
16            if (nums[i] > 0) {
17                result.add(i + 1);
18            }
19        }
20
21        return result;
22    }
23}
24
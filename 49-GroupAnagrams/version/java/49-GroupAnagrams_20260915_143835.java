// Last updated: 15/09/2026, 14:38:35
1class Solution {
2    public int findDuplicate(int[] nums) {
3        int slow = nums[0];
4        int fast = nums[0];
5
6        do {
7            slow = nums[slow];
8            fast = nums[nums[fast]];
9        } while (slow != fast);
10
11        slow = nums[0];
12        while (slow != fast) {
13            slow = nums[slow];
14            fast = nums[fast];
15        }
16
17        return slow;
18    }
19}
20
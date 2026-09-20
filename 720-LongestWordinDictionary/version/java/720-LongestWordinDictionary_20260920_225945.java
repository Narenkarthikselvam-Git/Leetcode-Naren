// Last updated: 20/09/2026, 22:59:45
1class Solution {
2    public int findPeakElement(int[] nums) {
3        int left = 0, right = nums.length - 1;
4
5        while (left < right) {
6            int mid = left + (right - left) / 2;
7
8            if (nums[mid] > nums[mid + 1]) {
9                // Peak is on the left side (including mid)
10                right = mid;
11            } else {
12                // Peak is on the right side
13                left = mid + 1;
14            }
15        }
16
17        return left; // or right, since left == right
18    }
19}
20
// Last updated: 02/09/2026, 10:20:29
1class Solution {
2    public int search(int[] nums, int target) {
3
4        int left = 0;
5        int right = nums.length - 1;
6
7        while (left <= right) {
8
9            int mid = left + (right - left) / 2;
10
11            if (nums[mid] == target) {
12                return mid;
13            }
14
15            // Left half is sorted
16            if (nums[left] <= nums[mid]) {
17
18                if (nums[left] <= target && target < nums[mid]) {
19                    right = mid - 1;
20                } else {
21                    left = mid + 1;
22                }
23
24            }
25
26            // Right half is sorted
27            else {
28
29                if (nums[mid] < target && target <= nums[right]) {
30                    left = mid + 1;
31                } else {
32                    right = mid - 1;
33                }
34            }
35        }
36
37        return -1;
38    }
39}
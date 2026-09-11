// Last updated: 11/09/2026, 09:46:07
1class Solution {
2    public int[] searchRange(int[] nums, int target) {
3        int first = findBound(nums, target, true);
4        int last = findBound(nums, target, false);
5        return new int[]{first, last};
6    }
7
8    private int findBound(int[] nums, int target, boolean isFirst) {
9        int left = 0, right = nums.length - 1;
10        int bound = -1;
11
12        while (left <= right) {
13            int mid = left + (right - left) / 2;
14
15            if (nums[mid] == target) {
16                bound = mid;
17                if (isFirst) {
18                    right = mid - 1; 
19                } else {
20                    left = mid + 1; 
21                }
22            } else if (nums[mid] < target) {
23                left = mid + 1;
24            } else {
25                right = mid - 1;
26            }
27        }
28
29        return bound;
30    }
31}
32
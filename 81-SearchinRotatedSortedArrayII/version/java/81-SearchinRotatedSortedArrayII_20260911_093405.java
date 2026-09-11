// Last updated: 11/09/2026, 09:34:05
1class Solution {
2    public boolean search(int[] nums, int target) {
3        int left = 0, right = nums.length - 1;
4
5        while (left <= right) {
6            int mid = left + (right - left) / 2;
7
8            if (nums[mid] == target) return true;
9
10            
11            if (nums[left] == nums[mid] && nums[mid] == nums[right]) {
12                left++;
13                right--;
14            }
15            
16            else if (nums[left] <= nums[mid]) {
17                if (nums[left] <= target && target < nums[mid]) {
18                    right = mid - 1;
19                } else {
20                    left = mid + 1;
21                }
22            }
23            
24            else {
25                if (nums[mid] < target && target <= nums[right]) {
26                    left = mid + 1;
27                } else {
28                    right = mid - 1;
29                }
30            }
31        }
32
33        return false;
34    }
35}
36
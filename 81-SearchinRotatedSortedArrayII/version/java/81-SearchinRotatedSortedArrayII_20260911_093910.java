// Last updated: 11/09/2026, 09:39:10
1class Solution {
2    public int findMin(int[] nums) {
3        int left = 0, right = nums.length - 1;
4
5        while (left < right) {
6            int mid = left + (right - left) / 2;
7            if (nums[mid] > nums[right]) {
8                left = mid + 1;
9            } else {
10                right = mid;
11            }
12        }
13
14        
15        return nums[left];
16    }
17}
18
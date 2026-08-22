// Last updated: 22/08/2026, 09:59:29
1class Solution {
2    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
3        HashMap<Integer, Integer> map = new HashMap<>();
4        for (int a : nums1) {
5            for (int b : nums2) {
6                int sum = a + b;
7                map.put(sum, map.getOrDefault(sum, 0) + 1);
8            }
9        }
10        int count = 0;
11        for (int c : nums3) {
12            for (int d : nums4) {
13                int sum = c + d;
14                count += map.getOrDefault(-sum, 0);
15            }
16        }
17        return count;
18    }
19}
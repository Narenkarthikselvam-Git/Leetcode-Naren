// Last updated: 20/09/2026, 21:54:54
1class Solution {
2    public int thirdMax(int[] nums) {
3        Long first = null, second = null, third = null;
4
5        for (int num : nums) {
6            long n = num;
7
8            if ((first != null && n == first) || 
9                (second != null && n == second) || 
10                (third != null && n == third)) {
11                continue; // skip duplicates
12            }
13
14            if (first == null || n > first) {
15                third = second;
16                second = first;
17                first = n;
18            } else if (second == null || n > second) {
19                third = second;
20                second = n;
21            } else if (third == null || n > third) {
22                third = n;
23            }
24        }
25
26        return third == null ? first.intValue() : third.intValue();
27    }
28}
29
// Last updated: 15/09/2026, 14:57:55
1import java.util.*;
2
3class Solution {
4    public int maximumSetSize(int[] nums1, int[] nums2) {
5        int n = nums1.length;
6
7        Set<Integer> set1 = new HashSet<>();
8        Set<Integer> set2 = new HashSet<>();
9        for (int x : nums1) set1.add(x);
10        for (int x : nums2) set2.add(x);
11
12        Set<Integer> union = new HashSet<>(set1);
13        union.addAll(set2);
14
15        Set<Integer> intersection = new HashSet<>(set1);
16        intersection.retainAll(set2);
17
18        int unique1 = set1.size();
19        int unique2 = set2.size();
20        int overlap = intersection.size();
21
22        // We can keep at most n/2 from each array
23        int keep1 = Math.min(unique1, n / 2);
24        int keep2 = Math.min(unique2, n / 2);
25
26        // Total distinct = keep1 + keep2
27        // But overlap elements are counted twice, so subtract them
28        int result = Math.min(union.size(), keep1 + keep2);
29
30        return result;
31    }
32}
33
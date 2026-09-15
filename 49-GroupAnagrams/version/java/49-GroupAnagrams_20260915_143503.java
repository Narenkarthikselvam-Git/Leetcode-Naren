// Last updated: 15/09/2026, 14:35:03
1import java.util.*;
2
3class Solution {
4    public int subarraySum(int[] nums, int k) {
5        Map<Integer, Integer> prefixCount = new HashMap<>();
6        prefixCount.put(0, 1); 
7
8        int sum = 0, count = 0;
9
10        for (int num : nums) {
11            sum += num;
12            if (prefixCount.containsKey(sum - k)) {
13                count += prefixCount.get(sum - k);
14            }
15            prefixCount.put(sum, prefixCount.getOrDefault(sum, 0) + 1);
16        }
17
18        return count;
19    }
20}
21
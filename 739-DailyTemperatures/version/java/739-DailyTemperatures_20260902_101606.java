// Last updated: 02/09/2026, 10:16:06
1import java.util.*;
2
3class Solution {
4
5    public int subarraysWithKDistinct(int[] nums, int k) {
6        return atMost(nums, k) - atMost(nums, k - 1);
7    }
8
9    private int atMost(int[] nums, int k) {
10
11        if (k == 0) {
12            return 0;
13        }
14
15        HashMap<Integer, Integer> map = new HashMap<>();
16
17        int left = 0;
18        int count = 0;
19
20        for (int right = 0; right < nums.length; right++) {
21
22            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
23
24            while (map.size() > k) {
25                map.put(nums[left], map.get(nums[left]) - 1);
26
27                if (map.get(nums[left]) == 0) {
28                    map.remove(nums[left]);
29                }
30
31                left++;
32            }
33
34            count += right - left + 1;
35        }
36
37        return count;
38    }
39}
// Last updated: 15/09/2026, 14:36:45
1import java.util.*;
2
3class Solution {
4    public int longestConsecutive(int[] nums) {
5        if (nums.length == 0) return 0;
6
7        Set<Integer> set = new HashSet<>();
8        for (int num : nums) {
9            set.add(num);
10        }
11
12        int longest = 0;
13
14        for (int num : set) {
15            if (!set.contains(num - 1)) {
16                int currentNum = num;
17                int currentStreak = 1;
18
19                while (set.contains(currentNum + 1)) {
20                    currentNum++;
21                    currentStreak++;
22                }
23
24                longest = Math.max(longest, currentStreak);
25            }
26        }
27
28        return longest;
29    }
30}
31
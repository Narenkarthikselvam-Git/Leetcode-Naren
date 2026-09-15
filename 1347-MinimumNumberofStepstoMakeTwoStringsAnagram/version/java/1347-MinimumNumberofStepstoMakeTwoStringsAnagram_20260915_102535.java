// Last updated: 15/09/2026, 10:25:35
1class Solution {
2    public int minSteps(String s, String t) {
3        int[] count = new int[26];
4
5        for (char c : s.toCharArray()) {
6            count[c - 'a']++;
7        }
8        for (char c : t.toCharArray()) {
9            count[c - 'a']--;
10        }
11
12        int steps = 0;
13        for (int diff : count) {
14            if (diff > 0) {
15                steps += diff; 
16            }
17        }
18
19        return steps;
20    }
21}
22
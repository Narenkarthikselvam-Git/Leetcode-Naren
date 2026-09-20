// Last updated: 20/09/2026, 21:44:28
1class Solution {
2    public String longestCommonPrefix(String[] strs) {
3        if (strs == null || strs.length == 0) return "";
4
5        String prefix = strs[0]; // start with the first string
6
7        for (int i = 1; i < strs.length; i++) {
8            // shrink prefix until it matches the start of strs[i]
9            while (strs[i].indexOf(prefix) != 0) {
10                prefix = prefix.substring(0, prefix.length() - 1);
11                if (prefix.isEmpty()) return "";
12            }
13        }
14
15        return prefix;
16    }
17}
18
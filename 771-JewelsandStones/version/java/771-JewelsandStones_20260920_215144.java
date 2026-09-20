// Last updated: 20/09/2026, 21:51:44
1class Solution {
2    public int strStr(String haystack, String needle) {
3        if (needle.isEmpty()) return 0; // edge case
4
5        int n = haystack.length();
6        int m = needle.length();
7
8        for (int i = 0; i <= n - m; i++) {
9            if (haystack.substring(i, i + m).equals(needle)) {
10                return i;
11            }
12        }
13
14        return -1;
15    }
16}
17
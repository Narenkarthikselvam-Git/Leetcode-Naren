// Last updated: 15/09/2026, 10:37:08
1class Solution {
2    public String longestPalindrome(String s) {
3        if (s == null || s.length() < 1) return "";
4
5        int start = 0, end = 0;
6
7        for (int i = 0; i < s.length(); i++) {
8            int len1 = expandFromCenter(s, i, i);     // odd length palindrome
9            int len2 = expandFromCenter(s, i, i + 1); // even length palindrome
10            int len = Math.max(len1, len2);
11
12            if (len > end - start) {
13                start = i - (len - 1) / 2;
14                end = i + len / 2;
15            }
16        }
17
18        return s.substring(start, end + 1);
19    }
20
21    private int expandFromCenter(String s, int left, int right) {
22        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
23            left--;
24            right++;
25        }
26        return right - left - 1; // length of palindrome
27    }
28}
29
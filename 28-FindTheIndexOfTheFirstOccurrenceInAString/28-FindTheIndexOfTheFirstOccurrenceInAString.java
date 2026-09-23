// Last updated: 23/09/2026, 09:16:31
class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0; // edge case

        int n = haystack.length();
        int m = needle.length();

        for (int i = 0; i <= n - m; i++) {
            if (haystack.substring(i, i + m).equals(needle)) {
                return i;
            }
        }

        return -1;
    }
}

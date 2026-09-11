// Last updated: 11/09/2026, 09:27:37
class Solution {
    public int findTheLongestBalancedSubstring(String s) {

        int i = 0;
        int max = 0;

        while (i < s.length()) {

            int zeros = 0;
            int ones = 0;

            // Count consecutive 0's
            while (i < s.length() && s.charAt(i) == '0') {
                zeros++;
                i++;
            }

            // Count consecutive 1's
            while (i < s.length() && s.charAt(i) == '1') {
                ones++;
                i++;
            }

            max = Math.max(max, 2 * Math.min(zeros, ones));
        }

        return max;
    }
}
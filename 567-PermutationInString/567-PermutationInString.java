// Last updated: 11/09/2026, 09:31:13
import java.util.*;

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        int k = s1.length();

        // Count characters in s1
        for (char c : s1.toCharArray()) {
            freq1[c - 'a']++;
        }

        // Sliding window in s2
        for (int right = 0; right < s2.length(); right++) {

            freq2[s2.charAt(right) - 'a']++;

            // Keep window size = s1.length()
            if (right >= k) {
                freq2[s2.charAt(right - k) - 'a']--;
            }

            // Check if window is a permutation
            if (Arrays.equals(freq1, freq2)) {
                return true;
            }
        }

        return false;
    }
}
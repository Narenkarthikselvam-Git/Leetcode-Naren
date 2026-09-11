// Last updated: 11/09/2026, 09:31:29
import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        int[] pFreq = new int[26];
        int[] windowFreq = new int[26];

        int k = p.length();

        // Frequency of p
        for (char c : p.toCharArray()) {
            pFreq[c - 'a']++;
        }

        // Sliding window
        for (int right = 0; right < s.length(); right++) {

            windowFreq[s.charAt(right) - 'a']++;

            // Keep window size equal to p.length()
            if (right >= k) {
                windowFreq[s.charAt(right - k) - 'a']--;
            }

            // Compare frequencies
            if (Arrays.equals(pFreq, windowFreq)) {
                result.add(right - k + 1);
            }
        }

        return result;
    }
}
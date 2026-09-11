// Last updated: 11/09/2026, 09:28:16
class Solution {
    public boolean makeEqual(String[] words) {

        int[] freq = new int[26];

        // Count frequency of each character
        for (String word : words) {
            for (char ch : word.toCharArray()) {
                freq[ch - 'a']++;
            }
        }

        // Check if each frequency is divisible
        for (int count : freq) {
            if (count % words.length != 0) {
                return false;
            }
        }

        return true;
    }
}
// Last updated: 11/08/2026, 23:00:42
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
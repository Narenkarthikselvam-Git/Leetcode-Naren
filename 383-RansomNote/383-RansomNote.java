// Last updated: 23/09/2026, 09:14:16
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26]; // frequency array for magazine letters

        for (char c : magazine.toCharArray()) {
            count[c - 'a']++;
        }

        for (char c : ransomNote.toCharArray()) {
            if (count[c - 'a'] == 0) {
                return false; // letter not available
            }
            count[c - 'a']--; // use one occurrence
        }

        return true;
    }
}

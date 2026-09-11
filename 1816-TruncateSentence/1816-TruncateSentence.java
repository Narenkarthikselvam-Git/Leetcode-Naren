// Last updated: 11/09/2026, 09:28:26
class Solution {
    public String truncateSentence(String s, int k) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count++;
                if (count == k) {
                    return s.substring(0, i);
                }
            }
        }

        return s;
    }
}
// Last updated: 11/08/2026, 23:01:04
class Solution {
    public String restoreString(String s, int[] indices) {
        char[] ans = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            ans[indices[i]] = s.charAt(i);
        }

        return new String(ans);
    }
}
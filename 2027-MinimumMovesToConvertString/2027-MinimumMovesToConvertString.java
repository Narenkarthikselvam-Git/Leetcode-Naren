// Last updated: 23/09/2026, 09:11:11
class Solution {
    public int minimumMoves(String s) {
        int moves = 0;
        int i = 0;

        while (i < s.length()) {
            if (s.charAt(i) == 'X') {
                moves++;
                i += 3; // skip next 3 characters since they are converted to 'O'
            } else {
                i++;
            }
        }

        return moves;
    }
}

// Last updated: 16/09/2026, 10:31:14
1class Solution {
2    public int minimumMoves(String s) {
3        int moves = 0;
4        int i = 0;
5
6        while (i < s.length()) {
7            if (s.charAt(i) == 'X') {
8                moves++;
9                i += 3; // skip next 3 characters since they are converted to 'O'
10            } else {
11                i++;
12            }
13        }
14
15        return moves;
16    }
17}
18
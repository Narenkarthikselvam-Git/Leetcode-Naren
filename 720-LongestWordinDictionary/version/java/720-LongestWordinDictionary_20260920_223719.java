// Last updated: 20/09/2026, 22:37:19
1class Solution {
2    public boolean validTicTacToe(String[] board) {
3        int xCount = 0, oCount = 0;
4        for (String row : board) {
5            for (char c : row.toCharArray()) {
6                if (c == 'X') xCount++;
7                if (c == 'O') oCount++;
8            }
9        }
10
11        // Rule 1: X always goes first, so counts must be valid
12        if (oCount > xCount || xCount - oCount > 1) return false;
13
14        boolean xWin = win(board, 'X');
15        boolean oWin = win(board, 'O');
16
17        // Rule 2: Both players cannot win simultaneously
18        if (xWin && oWin) return false;
19
20        // Rule 3: If X wins, X must have one more move than O
21        if (xWin && xCount != oCount + 1) return false;
22
23        // Rule 4: If O wins, counts must be equal
24        if (oWin && xCount != oCount) return false;
25
26        return true;
27    }
28
29    private boolean win(String[] board, char player) {
30        // Check rows
31        for (int i = 0; i < 3; i++) {
32            if (board[i].charAt(0) == player &&
33                board[i].charAt(1) == player &&
34                board[i].charAt(2) == player) return true;
35        }
36        // Check columns
37        for (int j = 0; j < 3; j++) {
38            if (board[0].charAt(j) == player &&
39                board[1].charAt(j) == player &&
40                board[2].charAt(j) == player) return true;
41        }
42        // Check diagonals
43        if (board[0].charAt(0) == player &&
44            board[1].charAt(1) == player &&
45            board[2].charAt(2) == player) return true;
46
47        if (board[0].charAt(2) == player &&
48            board[1].charAt(1) == player &&
49            board[2].charAt(0) == player) return true;
50
51        return false;
52    }
53}
54
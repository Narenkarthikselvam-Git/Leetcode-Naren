// Last updated: 15/09/2026, 15:04:48
1class Solution {
2    public boolean hasAlternatingBits(int n) {
3        // Shift n right by 1 and XOR with n
4        int x = n ^ (n >> 1);
5
6        // If n has alternating bits, x will be all 1s (like 111...).
7        // Check if x is of the form 111... by verifying x & (x+1) == 0
8        return (x & (x + 1)) == 0;
9    }
10}
11
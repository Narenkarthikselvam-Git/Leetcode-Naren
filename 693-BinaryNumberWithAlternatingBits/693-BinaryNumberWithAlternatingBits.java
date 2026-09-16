// Last updated: 16/09/2026, 10:07:54
class Solution {
    public boolean hasAlternatingBits(int n) {
        // Shift n right by 1 and XOR with n
        int x = n ^ (n >> 1);

        // If n has alternating bits, x will be all 1s (like 111...).
        // Check if x is of the form 111... by verifying x & (x+1) == 0
        return (x & (x + 1)) == 0;
    }
}

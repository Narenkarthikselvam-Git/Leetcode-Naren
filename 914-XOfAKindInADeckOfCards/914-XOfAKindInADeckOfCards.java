// Last updated: 23/09/2026, 09:12:27
import java.util.*;

class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int card : deck) {
            countMap.put(card, countMap.getOrDefault(card, 0) + 1);
        }

        int gcd = 0;
        for (int freq : countMap.values()) {
            gcd = gcd(gcd, freq);
        }

        return gcd >= 2;
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}

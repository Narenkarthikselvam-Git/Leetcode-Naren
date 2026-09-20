// Last updated: 20/09/2026, 22:49:46
1import java.util.*;
2
3class Solution {
4    public boolean hasGroupsSizeX(int[] deck) {
5        Map<Integer, Integer> countMap = new HashMap<>();
6        for (int card : deck) {
7            countMap.put(card, countMap.getOrDefault(card, 0) + 1);
8        }
9
10        int gcd = 0;
11        for (int freq : countMap.values()) {
12            gcd = gcd(gcd, freq);
13        }
14
15        return gcd >= 2;
16    }
17
18    private int gcd(int a, int b) {
19        return b == 0 ? a : gcd(b, a % b);
20    }
21}
22
// Last updated: 20/09/2026, 21:38:02
1import java.util.*;
2
3class Solution {
4    public int numJewelsInStones(String jewels, String stones) {
5        Set<Character> jewelSet = new HashSet<>();
6        for (char c : jewels.toCharArray()) {
7            jewelSet.add(c);
8        }
9
10        int count = 0;
11        for (char c : stones.toCharArray()) {
12            if (jewelSet.contains(c)) {
13                count++;
14            }
15        }
16
17        return count;
18    }
19}
20
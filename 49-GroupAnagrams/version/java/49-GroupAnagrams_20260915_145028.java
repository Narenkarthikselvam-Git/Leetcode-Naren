// Last updated: 15/09/2026, 14:50:28
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> findWinners(int[][] matches) {
5        Map<Integer, Integer> losses = new HashMap<>();
6
7        for (int[] match : matches) {
8            int winner = match[0];
9            int loser = match[1];
10            losses.putIfAbsent(winner, 0);
11
12
13            losses.put(loser, losses.getOrDefault(loser, 0) + 1);
14        }
15
16        List<Integer> zeroLoss = new ArrayList<>();
17        List<Integer> oneLoss = new ArrayList<>();
18        for (Map.Entry<Integer, Integer> entry : losses.entrySet()) {
19            int player = entry.getKey();
20            int lossCount = entry.getValue();
21
22            if (lossCount == 0) {
23                zeroLoss.add(player);
24            } else if (lossCount == 1) {
25                oneLoss.add(player);
26            }
27        }
28
29        Collections.sort(zeroLoss);
30        Collections.sort(oneLoss);
31
32        List<List<Integer>> result = new ArrayList<>();
33        result.add(zeroLoss);
34        result.add(oneLoss);
35
36        return result;
37    }
38}
39
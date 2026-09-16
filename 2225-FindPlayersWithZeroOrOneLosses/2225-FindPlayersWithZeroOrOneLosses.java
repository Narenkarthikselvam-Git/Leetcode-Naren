// Last updated: 16/09/2026, 10:06:58
import java.util.*;

class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer, Integer> losses = new HashMap<>();

        for (int[] match : matches) {
            int winner = match[0];
            int loser = match[1];
            losses.putIfAbsent(winner, 0);


            losses.put(loser, losses.getOrDefault(loser, 0) + 1);
        }

        List<Integer> zeroLoss = new ArrayList<>();
        List<Integer> oneLoss = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : losses.entrySet()) {
            int player = entry.getKey();
            int lossCount = entry.getValue();

            if (lossCount == 0) {
                zeroLoss.add(player);
            } else if (lossCount == 1) {
                oneLoss.add(player);
            }
        }

        Collections.sort(zeroLoss);
        Collections.sort(oneLoss);

        List<List<Integer>> result = new ArrayList<>();
        result.add(zeroLoss);
        result.add(oneLoss);

        return result;
    }
}

// Last updated: 23/09/2026, 09:13:45
import java.util.*;

class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] result = new String[n];

        // Pair scores with their original indices
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = score[i];
            arr[i][1] = i;
        }

        // Sort scores in descending order
        Arrays.sort(arr, (a, b) -> b[0] - a[0]);

        // Assign ranks
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                result[arr[i][1]] = "Gold Medal";
            } else if (i == 1) {
                result[arr[i][1]] = "Silver Medal";
            } else if (i == 2) {
                result[arr[i][1]] = "Bronze Medal";
            } else {
                result[arr[i][1]] = String.valueOf(i + 1);
            }
        }

        return result;
    }
}

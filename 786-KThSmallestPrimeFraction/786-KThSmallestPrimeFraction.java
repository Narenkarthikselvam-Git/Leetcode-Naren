// Last updated: 23/09/2026, 09:12:49
import java.util.*;

class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        int n = arr.length;
        // Min-heap comparing fractions by value
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> Double.compare((double) arr[a[0]] / arr[a[1]], (double) arr[b[0]] / arr[b[1]])
        );

        // Initialize heap with fractions having numerator arr[0]
        for (int j = 1; j < n; j++) {
            pq.offer(new int[]{0, j});
        }

        // Extract k-1 smallest fractions
        for (int count = 0; count < k - 1; count++) {
            int[] frac = pq.poll();
            int i = frac[0], j = frac[1];
            if (i + 1 < j) {
                pq.offer(new int[]{i + 1, j});
            }
        }

        int[] result = pq.poll();
        return new int[]{arr[result[0]], arr[result[1]]};
    }
}

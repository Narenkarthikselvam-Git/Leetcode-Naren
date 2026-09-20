// Last updated: 20/09/2026, 22:29:45
1import java.util.*;
2
3class Solution {
4    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
5        int n = arr.length;
6        // Min-heap comparing fractions by value
7        PriorityQueue<int[]> pq = new PriorityQueue<>(
8            (a, b) -> Double.compare((double) arr[a[0]] / arr[a[1]], (double) arr[b[0]] / arr[b[1]])
9        );
10
11        // Initialize heap with fractions having numerator arr[0]
12        for (int j = 1; j < n; j++) {
13            pq.offer(new int[]{0, j});
14        }
15
16        // Extract k-1 smallest fractions
17        for (int count = 0; count < k - 1; count++) {
18            int[] frac = pq.poll();
19            int i = frac[0], j = frac[1];
20            if (i + 1 < j) {
21                pq.offer(new int[]{i + 1, j});
22            }
23        }
24
25        int[] result = pq.poll();
26        return new int[]{arr[result[0]], arr[result[1]]};
27    }
28}
29
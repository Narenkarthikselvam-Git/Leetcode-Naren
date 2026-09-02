// Last updated: 02/09/2026, 10:25:58
1class Solution {
2    public int maxChunksToSorted(int[] arr) {
3
4        int chunks = 0;
5        int max = 0;
6
7        for (int i = 0; i < arr.length; i++) {
8
9            max = Math.max(max, arr[i]);
10
11            if (max == i) {
12                chunks++;
13            }
14        }
15
16        return chunks;
17    }
18}
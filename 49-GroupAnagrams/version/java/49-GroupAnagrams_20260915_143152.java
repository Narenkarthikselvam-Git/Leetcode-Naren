// Last updated: 15/09/2026, 14:31:52
1import java.util.*;
2
3class Solution {
4    public int[][] merge(int[][] intervals) {
5        if (intervals.length == 0) return new int[0][];
6        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
7        
8        List<int[]> merged = new ArrayList<>();
9        
10        int[] current = intervals[0];
11        for (int i = 1; i < intervals.length; i++) {
12            if (intervals[i][0] <= current[1]) {
13                current[1] = Math.max(current[1], intervals[i][1]);
14            } else {
15                merged.add(current);
16                current = intervals[i];
17            }
18        }
19        
20        merged.add(current);
21        
22        return merged.toArray(new int[merged.size()][]);
23    }
24}
25
// Last updated: 15/09/2026, 14:53:23
1class Solution {
2    public int maxTurbulenceSize(int[] arr) {
3        int n = arr.length;
4        if (n == 1) return 1;
5
6        int inc = 1, dec = 1;
7        int maxLen = 1;
8
9        for (int i = 1; i < n; i++) {
10            if (arr[i] > arr[i - 1]) {
11                inc = dec + 1;
12                dec = 1;
13            } else if (arr[i] < arr[i - 1]) {
14                dec = inc + 1;
15                inc = 1;
16            } else {
17                inc = 1;
18                dec = 1;
19            }
20            maxLen = Math.max(maxLen, Math.max(inc, dec));
21        }
22
23        return maxLen;
24    }
25}
26
// Last updated: 02/09/2026, 10:25:11
1import java.util.*;
2
3class Solution {
4
5    public String crackSafe(int n, int k) {
6
7        StringBuilder result = new StringBuilder();
8        Set<String> visited = new HashSet<>();
9
10        String start = "";
11
12        for (int i = 0; i < n - 1; i++) {
13            start += "0";
14        }
15
16        dfs(start, n, k, visited, result);
17
18        result.append(start);
19
20        return result.toString();
21    }
22
23    private void dfs(String node, int n, int k,
24                     Set<String> visited, StringBuilder result) {
25
26        for (int digit = 0; digit < k; digit++) {
27
28            String edge = node + digit;
29
30            if (!visited.contains(edge)) {
31
32                visited.add(edge);
33
34                String next = edge.substring(1);
35
36                dfs(next, n, k, visited, result);
37
38                result.append(digit);
39            }
40        }
41    }
42}
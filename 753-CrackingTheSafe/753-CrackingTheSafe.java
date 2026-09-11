// Last updated: 11/09/2026, 09:30:56
import java.util.*;

class Solution {

    public String crackSafe(int n, int k) {

        StringBuilder result = new StringBuilder();
        Set<String> visited = new HashSet<>();

        String start = "";

        for (int i = 0; i < n - 1; i++) {
            start += "0";
        }

        dfs(start, n, k, visited, result);

        result.append(start);

        return result.toString();
    }

    private void dfs(String node, int n, int k,
                     Set<String> visited, StringBuilder result) {

        for (int digit = 0; digit < k; digit++) {

            String edge = node + digit;

            if (!visited.contains(edge)) {

                visited.add(edge);

                String next = edge.substring(1);

                dfs(next, n, k, visited, result);

                result.append(digit);
            }
        }
    }
}
// Last updated: 15/09/2026, 14:45:54
1import java.util.*;
2
3class Solution {
4    public List<Integer> spiralOrder(int[][] matrix) {
5        List<Integer> result = new ArrayList<>();
6        if (matrix == null || matrix.length == 0) return result;
7
8        int top = 0, bottom = matrix.length - 1;
9        int left = 0, right = matrix[0].length - 1;
10
11        while (top <= bottom && left <= right) {
12            for (int i = left; i <= right; i++) {
13                result.add(matrix[top][i]);
14            }
15            top++;
16
17            for (int i = top; i <= bottom; i++) {
18                result.add(matrix[i][right]);
19            }
20            right--;
21            if (top <= bottom) {
22                for (int i = right; i >= left; i--) {
23                    result.add(matrix[bottom][i]);
24                }
25                bottom--;
26            }
27            if (left <= right) {
28                for (int i = bottom; i >= top; i--) {
29                    result.add(matrix[i][left]);
30                }
31                left++;
32            }
33        }
34
35        return result;
36    }
37}
38
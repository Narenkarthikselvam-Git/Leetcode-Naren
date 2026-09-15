// Last updated: 15/09/2026, 14:47:49
1class Solution {
2    public int[][] generateMatrix(int n) {
3        int[][] matrix = new int[n][n];
4        
5        int top = 0, bottom = n - 1;
6        int left = 0, right = n - 1;
7        int num = 1;
8        
9        while (top <= bottom && left <= right) {
10            for (int i = left; i <= right; i++) {
11                matrix[top][i] = num++;
12            }
13            top++;
14            
15            for (int i = top; i <= bottom; i++) {
16                matrix[i][right] = num++;
17            }
18            right--;
19            
20            if (top <= bottom) {
21                for (int i = right; i >= left; i--) {
22                    matrix[bottom][i] = num++;
23                }
24                bottom--;
25            }
26            
27            if (left <= right) {
28                for (int i = bottom; i >= top; i--) {
29                    matrix[i][left] = num++;
30                }
31                left++;
32            }
33        }
34        
35        return matrix;
36    }
37}
38
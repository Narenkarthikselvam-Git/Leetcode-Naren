// Last updated: 02/09/2026, 09:55:14
1import java.util.*;
2
3class Solution {
4    public int[] dailyTemperatures(int[] temperatures) {
5
6        int n = temperatures.length;
7        int[] answer = new int[n];
8
9        Stack<Integer> stack = new Stack<>();
10
11        for (int i = 0; i < n; i++) {
12
13            while (!stack.isEmpty() &&
14                   temperatures[i] > temperatures[stack.peek()]) {
15
16                int index = stack.pop();
17
18                answer[index] = i - index;
19            }
20
21            stack.push(i);
22        }
23
24        return answer;
25    }
26}
// Last updated: 02/09/2026, 10:00:26
1import java.util.*;
2
3class Solution {
4    public boolean validateStackSequences(int[] pushed, int[] popped) {
5
6        Stack<Integer> stack = new Stack<>();
7
8        int j = 0;
9
10        for (int num : pushed) {
11
12            stack.push(num);
13
14            while (!stack.isEmpty() && stack.peek() == popped[j]) {
15                stack.pop();
16                j++;
17
18                if (j == popped.length) {
19                    break;
20                }
21            }
22        }
23
24        return stack.isEmpty();
25    }
26}
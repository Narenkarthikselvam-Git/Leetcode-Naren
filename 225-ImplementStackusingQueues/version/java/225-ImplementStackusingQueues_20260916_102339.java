// Last updated: 16/09/2026, 10:23:39
1import java.util.*;
2
3class Solution {
4    public int calPoints(String[] operations) {
5        Stack<Integer> stack = new Stack<>();
6
7        for (String op : operations) {
8            if (op.equals("C")) {
9                // Remove last score
10                stack.pop();
11            } else if (op.equals("D")) {
12                // Double last score
13                stack.push(stack.peek() * 2);
14            } else if (op.equals("+")) {
15                // Sum of last two scores
16                int top = stack.pop();
17                int newScore = top + stack.peek();
18                stack.push(top);      // push back the popped score
19                stack.push(newScore); // push the new score
20            } else {
21                // Integer score
22                stack.push(Integer.parseInt(op));
23            }
24        }
25
26        // Sum all scores
27        int total = 0;
28        for (int score : stack) {
29            total += score;
30        }
31
32        return total;
33    }
34}
35
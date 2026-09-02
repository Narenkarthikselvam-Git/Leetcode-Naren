// Last updated: 02/09/2026, 09:55:59
1import java.util.*;
2
3class Solution {
4    public int evalRPN(String[] tokens) {
5
6        Stack<Integer> stack = new Stack<>();
7
8        for (String token : tokens) {
9
10            if (token.equals("+") || token.equals("-") ||
11                token.equals("*") || token.equals("/")) {
12
13                int b = stack.pop();
14                int a = stack.pop();
15
16                if (token.equals("+")) {
17                    stack.push(a + b);
18                } 
19                else if (token.equals("-")) {
20                    stack.push(a - b);
21                } 
22                else if (token.equals("*")) {
23                    stack.push(a * b);
24                } 
25                else {
26                    stack.push(a / b);
27                }
28
29            } else {
30                stack.push(Integer.parseInt(token));
31            }
32        }
33
34        return stack.pop();
35    }
36}
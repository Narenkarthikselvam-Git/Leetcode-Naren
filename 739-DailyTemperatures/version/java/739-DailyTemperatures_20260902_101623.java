// Last updated: 02/09/2026, 10:16:23
1import java.util.*;
2
3class Solution {
4    public int calculate(String s) {
5
6        Stack<Integer> stack = new Stack<>();
7
8        int num = 0;
9        char sign = '+';
10
11        for (int i = 0; i < s.length(); i++) {
12
13            char ch = s.charAt(i);
14
15            if (Character.isDigit(ch)) {
16                num = num * 10 + (ch - '0');
17            }
18
19            if ((!Character.isDigit(ch) && ch != ' ') || i == s.length() - 1) {
20
21                if (sign == '+') {
22                    stack.push(num);
23                }
24                else if (sign == '-') {
25                    stack.push(-num);
26                }
27                else if (sign == '*') {
28                    stack.push(stack.pop() * num);
29                }
30                else if (sign == '/') {
31                    stack.push(stack.pop() / num);
32                }
33
34                sign = ch;
35                num = 0;
36            }
37        }
38
39        int result = 0;
40
41        for (int value : stack) {
42            result += value;
43        }
44
45        return result;
46    }
47}
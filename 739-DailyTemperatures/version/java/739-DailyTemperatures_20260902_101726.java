// Last updated: 02/09/2026, 10:17:26
1import java.util.*;
2
3class Solution {
4    public String removeKdigits(String num, int k) {
5
6        Stack<Character> stack = new Stack<>();
7
8        for (char digit : num.toCharArray()) {
9
10            while (!stack.isEmpty() && k > 0 && stack.peek() > digit) {
11                stack.pop();
12                k--;
13            }
14
15            stack.push(digit);
16        }
17
18        // If k is still remaining, remove from the end
19        while (k > 0) {
20            stack.pop();
21            k--;
22        }
23
24        StringBuilder result = new StringBuilder();
25
26        // Remove leading zeros
27        boolean leadingZero = true;
28
29        for (char digit : stack) {
30            if (leadingZero && digit == '0') {
31                continue;
32            }
33
34            leadingZero = false;
35            result.append(digit);
36        }
37
38        if (result.length() == 0) {
39            return "0";
40        }
41
42        return result.toString();
43    }
44}
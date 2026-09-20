// Last updated: 20/09/2026, 22:40:35
1class Solution {
2    public int mctFromLeafValues(int[] arr) {
3        int res = 0;
4        Stack<Integer> stack = new Stack<>();
5        stack.push(Integer.MAX_VALUE);
6
7        for (int num : arr) {
8            while (stack.peek() <= num) {
9                int mid = stack.pop();
10                res += mid * Math.min(stack.peek(), num);
11            }
12            stack.push(num);
13        }
14
15        while (stack.size() > 2) {
16            res += stack.pop() * stack.peek();
17        }
18
19        return res;
20    }
21}
22
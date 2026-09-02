// Last updated: 02/09/2026, 09:59:05
1import java.util.*;
2
3class StockSpanner {
4
5    Stack<int[]> stack;
6
7    public StockSpanner() {
8        stack = new Stack<>();
9    }
10
11    public int next(int price) {
12
13        int span = 1;
14
15        while (!stack.isEmpty() && stack.peek()[0] <= price) {
16            span += stack.pop()[1];
17        }
18
19        stack.push(new int[]{price, span});
20
21        return span;
22    }
23}
24
25/**
26 * Your StockSpanner object will be instantiated and called as such:
27 * StockSpanner obj = new StockSpanner();
28 * int param_1 = obj.next(price);
29 */
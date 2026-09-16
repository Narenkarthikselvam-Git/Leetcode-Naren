// Last updated: 16/09/2026, 10:05:25
1import java.util.*;
2
3class MyStack {
4    private Queue<Integer> q1;
5    private Queue<Integer> q2;
6
7    public MyStack() {
8        q1 = new LinkedList<>();
9        q2 = new LinkedList<>();
10    }
11
12    // Push element x onto stack
13    public void push(int x) {
14        q2.offer(x); // put new element in q2
15        while (!q1.isEmpty()) {
16            q2.offer(q1.poll()); // move all elements from q1 to q2
17        }
18        // swap q1 and q2
19        Queue<Integer> temp = q1;
20        q1 = q2;
21        q2 = temp;
22    }
23
24    // Removes the element on top of the stack and returns it
25    public int pop() {
26        return q1.poll();
27    }
28
29    // Get the top element
30    public int top() {
31        return q1.peek();
32    }
33
34    // Returns whether the stack is empty
35    public boolean empty() {
36        return q1.isEmpty();
37    }
38}
39
40/**
41 * Your MyStack object will be instantiated and called as such:
42 * MyStack obj = new MyStack();
43 * obj.push(x);
44 * int param_2 = obj.pop();
45 * int param_3 = obj.top();
46 * boolean param_4 = obj.empty();
47 */
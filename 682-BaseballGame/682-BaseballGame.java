// Last updated: 23/09/2026, 09:13:24
import java.util.*;

class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for (String op : operations) {
            if (op.equals("C")) {
                // Remove last score
                stack.pop();
            } else if (op.equals("D")) {
                // Double last score
                stack.push(stack.peek() * 2);
            } else if (op.equals("+")) {
                // Sum of last two scores
                int top = stack.pop();
                int newScore = top + stack.peek();
                stack.push(top);      // push back the popped score
                stack.push(newScore); // push the new score
            } else {
                // Integer score
                stack.push(Integer.parseInt(op));
            }
        }

        // Sum all scores
        int total = 0;
        for (int score : stack) {
            total += score;
        }

        return total;
    }
}

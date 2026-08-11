// Last updated: 11/08/2026, 23:01:55
import java.util.*;

class Solution {
    public int[] prisonAfterNDays(int[] cells, int n) {
        Map<String, Integer> seen = new HashMap<>();

        while (n > 0) {
            String state = Arrays.toString(cells);

            if (seen.containsKey(state)) {
                int cycle = seen.get(state) - n;
                n %= cycle;
            }

            seen.put(state, n);

            if (n > 0) {
                n--;
                cells = nextDay(cells);
            }
        }

        return cells;
    }

    private int[] nextDay(int[] cells) {
        int[] next = new int[8];

        next[0] = 0;
        next[7] = 0;

        for (int i = 1; i < 7; i++) {
            if (cells[i - 1] == cells[i + 1]) {
                next[i] = 1;
            } else {
                next[i] = 0;
            }
        }

        return next;
    }
}
// Last updated: 11/09/2026, 09:30:50
class Solution {
    public int maxChunksToSorted(int[] arr) {

        int chunks = 0;
        int max = 0;

        for (int i = 0; i < arr.length; i++) {

            max = Math.max(max, arr[i]);

            if (max == i) {
                chunks++;
            }
        }

        return chunks;
    }
}
// Last updated: 16/09/2026, 10:06:05
import java.util.*;

class Solution {
    public int maximumSetSize(int[] nums1, int[] nums2) {
        int n = nums1.length;

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int x : nums1) set1.add(x);
        for (int x : nums2) set2.add(x);

        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);

        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        int unique1 = set1.size();
        int unique2 = set2.size();
        int overlap = intersection.size();

        // We can keep at most n/2 from each array
        int keep1 = Math.min(unique1, n / 2);
        int keep2 = Math.min(unique2, n / 2);

        // Total distinct = keep1 + keep2
        // But overlap elements are counted twice, so subtract them
        int result = Math.min(union.size(), keep1 + keep2);

        return result;
    }
}

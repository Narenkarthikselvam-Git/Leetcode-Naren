// Last updated: 16/09/2026, 10:02:22
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11/**
12 * Definition for singly-linked list.
13 * public class ListNode {
14 *     int val;
15 *     ListNode next;
16 *     ListNode() {}
17 *     ListNode(int val) { this.val = val; }
18 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
19 * }
20 */
21class Solution {
22    public ListNode removeElements(ListNode head, int val) {
23        // Create a dummy node to simplify edge cases (like removing head)
24        ListNode dummy = new ListNode(0);
25        dummy.next = head;
26        ListNode current = dummy;
27
28        while (current.next != null) {
29            if (current.next.val == val) {
30                // Skip the node with the target value
31                current.next = current.next.next;
32            } else {
33                current = current.next;
34            }
35        }
36
37        return dummy.next;
38    }
39}
40
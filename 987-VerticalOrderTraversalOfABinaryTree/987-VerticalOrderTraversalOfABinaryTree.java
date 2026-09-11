// Last updated: 11/09/2026, 09:29:44
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
import java.util.*;

class Solution {

    class NodeInfo {
        int val;
        int row;
        int col;

        NodeInfo(int val, int row, int col) {
            this.val = val;
            this.row = row;
            this.col = col;
        }
    }

    List<NodeInfo> list = new ArrayList<>();

    public List<List<Integer>> verticalTraversal(TreeNode root) {

        dfs(root, 0, 0);

        Collections.sort(list, (a, b) -> {

            // First sort by column
            if (a.col != b.col) {
                return a.col - b.col;
            }

            // Same column -> sort by row
            if (a.row != b.row) {
                return a.row - b.row;
            }

            // Same row and column -> sort by value
            return a.val - b.val;
        });

        List<List<Integer>> result = new ArrayList<>();

        int previousCol = Integer.MIN_VALUE;

        for (NodeInfo node : list) {

            if (node.col != previousCol) {
                result.add(new ArrayList<>());
                previousCol = node.col;
            }

            result.get(result.size() - 1).add(node.val);
        }

        return result;
    }

    private void dfs(TreeNode root, int row, int col) {

        if (root == null) {
            return;
        }

        list.add(new NodeInfo(root.val, row, col));

        dfs(root.left, row + 1, col - 1);
        dfs(root.right, row + 1, col + 1);
    }
}
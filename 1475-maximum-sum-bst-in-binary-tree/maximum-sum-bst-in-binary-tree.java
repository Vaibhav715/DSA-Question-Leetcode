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
class Solution {
    int max = 0;

    public int maxSumBST(TreeNode root) {
        post(root);
        return max;
    }

    class Node {
        boolean isBST;
        int sum;
        int min;
        int max;

        Node(boolean isBST, int sum, int min, int max) {
            this.isBST = isBST;
            this.sum = sum;
            this.min = min;
            this.max = max;
        }
    }

    Node post(TreeNode root) {
        if (root == null)
            return new Node(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);

        Node left = post(root.left);
        Node right = post(root.right);

        if (left.isBST && right.isBST &&
            root.val > left.max &&
            root.val < right.min) {

            int sum = left.sum + right.sum + root.val;

            max = Math.max(max, sum);

            int min = Math.min(root.val, left.min);
            int maxVal = Math.max(root.val, right.max);

            return new Node(true, sum, min, maxVal);
        }

        return new Node(false, 0, 0, 0);
    }
}
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
    // public int diameterOfBinaryTree(TreeNode root) {    // O(n*n)
    //     if(root == null) return 0;

    //     int leftDia = diameterOfBinaryTree(root.left);  // O(n);
    //     int rightDia = diameterOfBinaryTree(root.right);
    //     int currDia = height(root.left) + height(root.right);

    //     return  Math.max(currDia, Math.max(leftDia, rightDia));
    // }

    // int height(TreeNode root) // time complexity- O(n)
    // {
    //     if(root == null) return 0;

    //     int left = height(root.left);
    //     int right = height(root.right);

    //     return Math.max(left, right) + 1;
    // }

    int ans = 0;
    int height(TreeNode root) // time complexity- O(n)
    {
        if(root == null) return 0;

        int left_ht = height(root.left);
        int right_ht = height(root.right);
        ans = Math.max(ans, left_ht + right_ht);
        return Math.max(left_ht, right_ht) + 1;
    }

    public int diameterOfBinaryTree(TreeNode root) { 
        height(root);

        return ans;
    }
}
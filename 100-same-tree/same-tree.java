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
    public boolean isSameTree(TreeNode p, TreeNode q) {
    //     List<Integer> tree1 = new ArrayList<>();
    //     List<Integer> tree2 = new ArrayList<>();
    //      tree1 = preorder(p, tree1);
    //      tree2 = preorder(q, tree2);
    //     return tree1.equals(tree2);

    // }
    // List<Integer> preorder(TreeNode root, List<Integer> tree){
    //     if(root == null){
    //     tree.add(null);
    //     return tree;
    //     }
    //     tree.add(root.val);
    //     preorder(root.left, tree);
    //     preorder(root.right, tree);
    //     return tree;
    // }


    if(p == null && q == null)
    return true;

    if(p == null || q == null)
    return false;

    if(p.val != q.val)
    return false;

    return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
}
}
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return null;
        } else if (t1 == null) {
            // design consideration; cloning or reusing t2
            return t2;
        } else if (t2 == null) {
            // design consideration; cloning or reusing t1
            return t1;
        } else {
            // edge case; check [under|over]flow
            TreeNode mergedNode = new TreeNode(t1.val + t2.val);
            mergedNode.right = mergeTrees(t1.right, t2.right);
            mergedNode.left = mergeTrees(t1.left, t2.left);
            
            return mergedNode;
        }
    }
}
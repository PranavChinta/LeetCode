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
    public boolean helper(TreeNode node, long lower, long upper){
        if(node.left==null&&node.right==null){
            return (node.val>lower)&&(node.val<upper);
        }
        boolean left = true;
        boolean right = true;
        if(node.left!=null){
            if(node.left.val<node.val){
                left = helper(node.left, lower, node.val);
            }
            else{
                return false;
            }
        }
        if(node.right!=null){
            if(node.right.val>node.val){
                right = helper(node.right, node.val, upper);
            }
            else{
                return false;
            }
        }
        return left&&right;
    }
    public boolean isValidBST(TreeNode root) {
        if(root.left==null&&root.right==null){
            return true;
        }
        long posInf = Long.MAX_VALUE;
        long negInf = Long.MIN_VALUE;
        return helper(root, negInf, posInf);
    }
}
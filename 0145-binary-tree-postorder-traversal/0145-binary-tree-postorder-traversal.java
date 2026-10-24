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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> postorder =new LinkedList<>();
        if(root==null){
            return postorder;
        }
        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode r=stack.pop();
            postorder.addFirst(r.val);
             if(r.left!=null) {
                stack.push(r.left);
            }
            if(r.right!=null){
                stack.push(r.right);
            }
        }
        return postorder;
        
    }
}
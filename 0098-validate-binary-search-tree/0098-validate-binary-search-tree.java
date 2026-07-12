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
    ArrayList<Integer>list=new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
        in(root);
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)<list.get(i+1)){}
            else{
                return false;
            }

        }
        return true;
    }
    

      void   in(TreeNode root){
            if(root==null){
                return;
            }
            in(root.left);
            list.add(root.val);
            in(root.right);
        }
        }
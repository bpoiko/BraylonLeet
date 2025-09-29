import java.util.*;
 class TreeNode {
      int val;
     TreeNode left;
      TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
         this.right = right;
     }
 }
 class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return root;
        }
        TreeNode temp = root.left; // make a temp for our left
        root.left = root.right;// move the parents over
        root.right = temp; // refer to line 20

        invertTree(root.left); // recursively repeat for each 2 child:parent pair on the left
        invertTree(root.right); // ^ but for the right


        return root;


    }
}
public class invert{


}
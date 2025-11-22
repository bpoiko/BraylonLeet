import java.util.*;


    
  class Solution {
    
    public int diameterOfBinaryTree(TreeNode root) {
        int[] sol = new int[1];
        dfs(root, sol);
        return sol[0];
    }

    private int dfs(TreeNode root, int[] sol) {
        if (root == null) {
            return 0;
        }
        int left = dfs(root.left, sol); // find depth of left
        int right = dfs(root.right, sol); // find depth of right
        sol[0] = Math.max(sol[0], left + right); // LONGEST path
        return 1 + Math.max(left, right); // add one to result as we cannot just return left,rigth
    }
}
class diameter{
    public static void main(String[] args) {
        System.out.println("Hi thanks for checking out my github!");
    }
}


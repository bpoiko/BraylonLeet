

class SameBST{
    public boolean SameTree(TreeNode p, TreeNode q){
        if(p == null && q == null){
            return true;
        }
        if(p != null && q != null && p.val == q.val){
            return SameTree(p.left, q.left) && SameTree(p.right, q.right);
        }else{
            return false;
        }
    }
}
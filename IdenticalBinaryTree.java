// determine two binary trees are identical
public class IdenticalBinaryTree{
    public boolean isIdentical(TreeNode a, TreeNode b){
        if(a == null && b == null){
            return true;
        }else if( a== null || b == null){
            return false;
        }else{
            return a.val == b.val && isIdentical(a.left,b.left) &&isIdentical(a.right,b.right);
        }

    }
}
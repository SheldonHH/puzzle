/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */
public class BinaryTree {
    /**
     * @param root the root of the binary tree
     * @return all root-to-leaf paths
     */
   public List<String> binaryTreePaths(TreeNode root) {
    
        List<String> ret = new ArrayList<String>();
    
        if(root == null){
            return ret;
        }
    
        dfs(root, new StringBuilder(), ret);
    
        return ret;
    }
    
    public void dfs(TreeNode root, StringBuilder sb, List<String> ret){
       sb.append(root.val);
       if(root.left == null && root.right == null){
           ret.add(sb.toString());
           return;
       }
      sb.append("->");
    
       if(root.left != null){
           dfs(root.left, new StringBuilder(sb), ret);
       }
    
       if(root.right != null){
           dfs(root.right, new StringBuilder(sb), ret);
       }
    }
        
}
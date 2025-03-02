
class Solution {

    class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

      // Base case: null node
      if (root == null)
          return null;

      // If the current node is either p or q, return it
      if (root == p || root == q)
          return root;

      // Recur for left and right children
      TreeNode left = lowestCommonAncestor(root.left, p, q);
      TreeNode right = lowestCommonAncestor(root.right, p, q);

      // If both left and right return a non-null value, current node is LCA
      if (left != null && right != null)
          return root;

      // Otherwise, return the non-null child (or null if both are null)
      return left != null ? left : right;
  }
}

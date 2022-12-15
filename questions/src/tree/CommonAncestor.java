package tree;

public class CommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //递归结束条件
        if (root == null || root == p || root == q) return root;

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        //因为一定存在，如果一侧为空一定在另一侧
        if (left == null) return right;
        if (right == null) return left;
        return root; //都不为空
    }
}

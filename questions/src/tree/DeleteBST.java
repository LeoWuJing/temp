package tree;

public class DeleteBST {
    public TreeNode deleteNode(TreeNode root, int key){
        if(root==null) return null;

        if(root.val>key){
            root.left=deleteNode(root.left, key);
        }else if(root.val<key){
            root.right=deleteNode(root.right,key);
        }else {
            if(root.left==null) return root.right;
            if(root.right==null) return root.left;
            //左右都不为空时 找右子树的最左边的节点(min_value)
            TreeNode node=root.right;
            while (node.left!=null){
                node=node.left;
            }
            //将min赋值给根节点，并在右子树删除该节点
            root.val=node.val;
            root.right=deleteNode(root.right, node.val);
        }
        return root;
    }
}

package tree;

public class ArrayConvertBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root = dfs(nums, 0, nums.length - 1);
        return root;
    }

    public TreeNode dfs(int[] nums, int left, int right) {
        if (left > right) return null;

        int mid = left + (right - left) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = dfs(nums, left, mid - 1);
        root.right = dfs(nums, mid + 1, right);
        return root;
    }
}

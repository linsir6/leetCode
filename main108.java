
public class Main108 {

	public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) return null;
        return buildTree(nums, 0, nums.length - 1);
    }
    
    private TreeNode buildTree(int[] nums, int lo, int hi) {
        if (lo > hi) {
            return null;
        }
        int mid = lo + (hi - lo) / 2;
        int data = nums[mid];
        TreeNode treeNode = new TreeNode(data);
        treeNode.left = buildTree(nums, lo, mid - 1);
        treeNode.right = buildTree(nums, mid + 1, hi);
        return treeNode;
    }
}
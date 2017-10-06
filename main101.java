
public class Main101 {

	public static boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return isSame(root.left, root.right);   
    }

    private static boolean isSame(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left != null && right == null || left == null && right != null) return false;
        else return left.val == right.val && isSame(left.left, right.right) && isSame(left.right, right.left);
    }
}
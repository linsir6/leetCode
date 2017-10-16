class Solution {
    private boolean stop = false;

    public boolean hasPathSum(TreeNode root, int sum) {
        calculate(root, 0, sum);
        return stop;
    }

    private void calculate(TreeNode node, int cur, int sum) {
        if (!stop && node != null) {
            if (node.left == null && node.right == null && (node.val + cur == sum)) {
                stop = true;
            }
            if (node.left != null) {
                calculate(node.left, cur+node.val, sum);
            }
            if (node.right != null) {
                calculate(node.right, cur+node.val, sum);
            }

        }

    }
}
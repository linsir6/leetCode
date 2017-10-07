
public class Main110 {

	public static boolean isBalanced(TreeNode root) {  
    if (root == null)  
        return true;  
    int distance = getDeep(root.left) - getDeep(root.right);  
  
    if (distance > 1 || distance < -1)  
        return false;  
    else  
        return isBalanced(root.left) && isBalanced(root.right);  
}  
  
// 最大深度  
public static int getDeep(TreeNode root) {  
    if (root == null)  
        return 0;  
    int level = 0;  
    LinkedList<TreeNode> list = new LinkedList<TreeNode>();  
    list.add(root);  
    int first = 0;  
    int last = 1;  
    while (first < list.size()) {  
        last = list.size();  
        while (first < last) {  
            if (list.get(first).left != null) {  
                list.add(list.get(first).left);  
            }  
            if (list.get(first).right != null) {  
                list.add(list.get(first).right);  
            }  
            first++;  
        }  
        level++;  
    }  
    return level;  
}
}
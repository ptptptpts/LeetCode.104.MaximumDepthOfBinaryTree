public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    int mMax = 0;

    public int maxDepth(TreeNode root) {
        mMax = 0;
        if (root != null) {
            findMaxDepth(root, 1);
        }
        return mMax;
    }

    private void findMaxDepth(TreeNode node, int currentDepth) {
        if (node.left != null) {
            findMaxDepth(node.left, currentDepth + 1);
        }
        if (node.right != null) {
            findMaxDepth(node.right, currentDepth + 1);
        }
        if ((node.left == null) && (node.right == null)) {
            if (currentDepth > mMax) {
                mMax = currentDepth;
            }
        }
    }
}

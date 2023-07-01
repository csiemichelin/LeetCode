import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public static boolean isSymmetric(TreeNode root) {
        /*時間複雜度爆了
        LinkedList<TreeNode> rootList = new LinkedList<>();
        LinkedList<Integer> ArrayList = new LinkedList<>();
        rootList.add(root);
        int nonNullCount = 1;
        if (rootList.size() == 1 && rootList.get(0) == null)    return true;
        while (true) {
            TreeNode node = rootList.poll();
            if (node == null) {
                ArrayList.add(null);
                rootList.add(null);  // 先加入左子節點（null）
                rootList.add(null);  // 再加入右子節點（null）
            }
            else {
                ArrayList.add(node.val);
                rootList.add(node.left);
                rootList.add(node.right);
                nonNullCount--;
                if (node.left != null)  nonNullCount++;
                if (node.right != null) nonNullCount++;
            }
            if (nonNullCount == 0)  break;
        }
        System.out.println(ArrayList);
        int startIndex = 0;
        int endIndex = 0;
        int level = 0;
        int intervalSize = 0;
        int compareIndex = 0;
        while (true) {
            System.out.println("startIndex = " + startIndex + ", endIndex = " + endIndex);
            for (int j=startIndex; j<=endIndex; j++) {
                intervalSize = (int)Math.pow(2, level);
                compareIndex = (intervalSize-1)-(j-startIndex)+startIndex;
                if (j > compareIndex)    break;
                System.out.println("j = " + j + ", compareIndex = " + compareIndex);
                if (compareIndex > ArrayList.size()-1) {
                    if (ArrayList.get(j) != null) {
                        return false;
                    }
                    continue;
                }
                if (ArrayList.get(j) != ArrayList.get(compareIndex)) {
                    return false;
                }
            }
            level++;
            startIndex = (int)Math.pow(2, level) - 1;
            endIndex = endIndex + (int)Math.pow(2, level);
            if (startIndex > ArrayList.size()-1) {
                break;
            }
        }
        return true;
         */
        if (root == null) return true;
        return isSymmetric(root.left, root.right);
    }
    public static boolean isSymmetric(TreeNode lsub, TreeNode rsub) {
        if (lsub == null || rsub == null){
            if (lsub == rsub) return true;
            else return false;
        }
        if (lsub.val != rsub.val) return false;
        return isSymmetric(lsub.left, rsub.right) && isSymmetric(lsub.right, rsub.left);
    }
    public static void main(String[] args) {

        /*
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

         */
        /*
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(2);
        root.right.left = new TreeNode(2);
         */
        /*
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(3);

         */
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(3);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(4);
        root.left.right.left = new TreeNode(8);
        root.left.right.right = new TreeNode(9);
        root.right.left.left = new TreeNode(9);
        root.right.left.right = new TreeNode(8);


        boolean bool = isSymmetric(root);
        System.out.println(bool);
    }
}
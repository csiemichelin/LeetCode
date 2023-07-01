import java.util.IllegalFormatCodePointException;
import java.util.LinkedList;
import java.util.List;

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
    public static List<List<Integer>> levelOrder(TreeNode root) {
        LinkedList<TreeNode> rootList = new LinkedList<>();
        List<List<Integer>> list = new LinkedList<>();

        rootList.add(root);
        int ListSize = 0;
        int level = 0;
        if (root == null)   return list;
        while (true) {
            list.add(new LinkedList<>());   //這樣只建立第一層
            ListSize = rootList.size();
            for (int i=0; i<ListSize; i++) {
                //System.out.println(ListSize);
                TreeNode node = rootList.poll();
                System.out.println("level = " + level);
                list.get(level).add(node.val);
                System.out.println(node.val);
                System.out.println(list);
                if (node.left != null)  rootList.add(node.left);
                if (node.right != null) rootList.add(node.right);
            }
            level++;

            if (rootList.isEmpty()) break;
        }
        return list;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        List<List<Integer>> list = levelOrder(root);
        System.out.println(list);
    }
}
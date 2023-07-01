import java.util.Collections;
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
    public static void inorder(TreeNode node, LinkedList<Integer> list) {
        //中序:左中右
        if (node == null)   return; //只有一個null則回傳，否則一直地回的去做中序
        inorder(node.left, list);
        list.add(node.val);
        inorder(node.right, list);
    }
    public static boolean isValidBST(TreeNode root) {
        //透過中序看是否為有序數列
        LinkedList<Integer> rootList = new LinkedList<>();
        inorder(root, rootList);
        System.out.println(rootList);

        for (int i=0; i<rootList.size(); i++) {
            if (i != rootList.size()-1 && rootList.get(i) >= rootList.get(i+1)) {//題目有規定左節點一定要小於，右節點一定要大於，因此等於不行，判斷有沒有連續的整數和不符合順序的
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        /*
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(6);

         */
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);

        boolean bool = isValidBST(root);
        System.out.println(bool);
    }
}
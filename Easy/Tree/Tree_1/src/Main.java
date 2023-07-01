import java.util.*;

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
    public static int maxDepth(TreeNode root) {
        /*
        //List<Integer> Arraylist = new ArrayList<>();
        LinkedList<TreeNode> TreeList = new LinkedList<>();
        TreeList.add(root);
        if (TreeList.size() == 1 && TreeList.get(0) == null)    return 0;
        int nonNullCount = 1;  // 根結點不為空，初始化為1，計算當list中沒有非null則跳出迴圈
        int count = 1;
        int height =0;
        while (true ) {
            if (Integer.bitCount(count) == 1) { //2的次方，其二進位bit為1只會有一個
                height++;
            }
            TreeNode node = TreeList.poll();    //刪除第一個元素並返回node
            if (node == null) {
                //Arraylist.add(null);
                TreeList.add(null);  // 先加入左子節點（null），但這個會大幅增加時間複雜度
                TreeList.add(null);  // 再加入右子節點（null），但這個會大幅增加時間複雜度
            }else {
                //Arraylist.add(node.val);
                TreeList.add(node.left);
                TreeList.add(node.right);
                nonNullCount--; //若當前節點不是null則減1
                if (node.left != null)  nonNullCount++;
                if (node.right != null) nonNullCount++;
            }
            if (nonNullCount == 0) {
                break;
            }
            count++;
        }
        return height;
        */
        LinkedList<TreeNode> TreeList = new LinkedList<>();
        TreeList.add(root);
        if (TreeList.size() == 1 && TreeList.get(0) == null)    return 0;
        int height = 0;
        int levelLength = 0;
        while (true) {
            height++;
            levelLength = TreeList.size();
            for (int i=0; i<levelLength; i++) { //代表處理每一層的所有節點，刪除後，並加入他們的子節點
                TreeNode node = TreeList.poll();
                if (node.left != null)  TreeList.add(node.left);
                if (node.right != null) TreeList.add(node.right);
            }
            if (TreeList.isEmpty()) {
                break;
            }
        }
        return height;
    }
    public static void main(String[] args) {
        /*
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
         */

        //TreeNode root = null;

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(4);
        root.left.left.left.left = new TreeNode(5);


        //maxDepth(root);
        int number = maxDepth(root);
        System.out.println(number);

    }
}
public class Main {
    //此題很難，用記憶法，題目給的input一定是高度平衡樹了，所以不用想有沒有可能是偏移樹的情況
    //要達到高度平衡樹的條件，最基本的就是一個root的左右兩邊要公平，
    //所以最簡單的作法就是取中位數作為根，其左邊就是左子樹的所有節點，
    //右邊就是右子樹的所有節點；再分別讓各自的左右子樹再次拆分，直到分到沒有節點為止。
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
    public static TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0)   return null;
        return BST(nums, 0, nums.length-1);
    }
    public static TreeNode BST(int[] nums, int start, int end) {
        if (start > end)    return null;
        int mid = start + (end - start)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = BST(nums, start, mid-1);
        root.right = BST(nums, mid+1, end);
        return root;
    }
    public static void main(String[] args) {
        int[] nums = {-10,-3,0,5,9};
        TreeNode root = sortedArrayToBST(nums);
    }
}
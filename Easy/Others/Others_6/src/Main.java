import java.util.LinkedList;

public class Main {
    public static int missingNumber(int[] nums) {
        LinkedList<Integer> numsList = new LinkedList<>();
        for (int i=0; i<nums.length; i++) {
            numsList.add(nums[i]);
        }
        int size = nums.length;
        for (int i=0; i<=size; i++) {
            if (!numsList.contains(i)) {
                return i;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        int result = missingNumber(nums);
        System.out.println(result);
    }
}
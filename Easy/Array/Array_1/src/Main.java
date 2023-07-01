import java.util.Arrays;

class Solution {
    public static int removeDuplicates(int[] nums) {
        //int array_length = nums.length; //不能用int，因為array可能給超過
        int max_index = 0;
        for (int i=0; i<nums.length; i++) {
            if(nums.length == 0) return 0;
            if(nums[max_index] < nums[i]) {
                max_index++;
                nums[max_index] = nums[i];
            }
            System.out.println(Arrays.toString(nums));
        }
        return (max_index + 1);
    }
    public static void main(String args[]) {
        int[] array = {0,0,1,1,1,2,2,3,3,4};
        int k = removeDuplicates(array);
        System.out.println(k);
    }
}
import java.util.Arrays;

public class Main {
    public static int rob(int[] nums) {
        //nums = [1, 2, 3, 1]
        //sum[i]為偷竊前i間房屋，所能獲得的最大金額
        //sum[0] = nums[0] = 1
        //sum[1] = max(sum[0], nums[1]) 因為不能連續偷，所以最大金額為偷竊前0個房子跟偷竊第一間房子取最大值
        //sum[2] = max(sum[1], sum[0]+nums[2])  因為不能連續偷，所以最大金額為偷竊前1個房子跟偷竊前0個房子加偷竊第二間房子的最大值
        //sum[3] = max(sum[2], sum[1]+nums[3])
        int[] sum = new  int[nums.length];
        sum[0] = nums[0];
        if (nums.length == 1)   return sum[0];
        sum[1] = sum[0];
        if (nums[1] > sum[0]) {
            sum[1] = nums[1];
        }
        if (nums.length == 2)   return sum[1];
        int max = sum[1];
        for (int i=2; i<nums.length; i++) {
            sum[i] = sum[i-1];
            if (sum[i-2] + nums[i] > sum[i-1]) {
                sum[i] = sum[i-2] + nums[i];
            }
            if (sum[i] > max) {
                max = sum[i];
            }
            System.out.println(Arrays.toString(sum));
        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums = {0};
        int result = rob(nums);
        System.out.println(result);
    }
}
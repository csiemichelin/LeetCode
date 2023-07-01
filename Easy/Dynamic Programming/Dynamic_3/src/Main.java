import java.util.Arrays;

public class Main {
    public static int maxSubArray(int[] nums) {
        /*//時間複雜度會爆炸
        int max = nums[0];
        //鉉則起點和終點
        for (int i=0; i<nums.length; i++) {     //當最大值出現在最後一項
            int sum = 0;
            //System.out.println("nums[i] = " + nums[i]);
            for (int j=i; j< nums.length; j++) {
                sum = sum + nums[j];
                if (sum > max) {
                    //System.out.println("sum = " + sum);
                    max = sum;
                }
            }
        }
        return max;
         */
        //nums: [-2, 1, -3, 4, -1, 2, 1, -5, 4]
        //f;    [-2, 1, -2, 4,  3, 5, 6,  1, 5]
        //假設f[i]為maxSubArray(0.....i)
        //若f[i]的前一個小於0則連續的組合就不會包含前一個元素 => f[i] = nums[i]，ex: nums[1]=1,nums[0]=-2=>f[1]=1
        //否則就可以納入f[i] = nums[i] + f[i-1] ，ex: nums[4]=-1,f[3]=4=>f[2]=-1+4
        int[] f = new int [nums.length];
        f[0] = nums[0];
        int max = f[0];
        for (int i=1; i<nums.length; i++) {
            if (f[i-1] < 0) {
                f[i] = nums[i];
            }else {
                System.out.println("f[i] = " + f[i] + ", nums[i] = " + nums[i]);
                f[i] = nums[i] + f[i-1];
            }
            System.out.println(Arrays.toString(f));
            if (f[i] > max) {
                max = f[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = maxSubArray(nums);
        System.out.println(result);
    }
}
import java.security.ProtectionDomain;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void rotate(int[] nums, int k) {
        int time = k % nums.length;  //可以減少複雜度
        ArrayList<Integer> new_array =new ArrayList<>(); //相當於c的動態陣列
        if (nums.length >= 1) {
            int j = 0;
            for (int i=0; i<time; i++) {
                j = (nums.length - time) + i;
                new_array.add(nums[j]);
            }
            for (int i=time; i < nums.length; i++) {
                j = i - time;
                new_array.add(nums[j]);
            }
            for (int i=0; i< nums.length; i++) {
                nums[i] = new_array.get(i);
            }
            System.out.println(Arrays.toString(nums));
        }
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        rotate(array, 3);
    }
}
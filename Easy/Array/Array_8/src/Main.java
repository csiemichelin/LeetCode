import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.HashMap;
public class Main {
    public static void moveZeroes(int[] nums) {
        LinkedList<Integer> list = new LinkedList<>();
        int ZeroCount = 0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] != 0) {
                list.add(nums[i]);
            }
            else {
                ZeroCount++;
            }
        }
        //Collections.sort(list);     //沒有包含0的排序(題目不用做排序)
        for (int j=0; j<ZeroCount; j++) {
            list.add(0);    //把0添加到list後面
        }
        for (int i=0; i<nums.length; i++) {
            nums[i] = list.get(i);  //將結果填回nums陣列
        }
    }
    public static void main(String args[]) {
        int nums[] = {0,1,0,3,12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
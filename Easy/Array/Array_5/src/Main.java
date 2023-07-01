import java.util.HashMap;
import java.util.Map;

public class Main {
    public  static int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>(); //key&value的資料結構
        int key = 0;
        int value = 0;
        for (int i=0; i<nums.length; i++) {
            if(map.containsKey(nums[i])) {
                key = nums[i];
                value = map.get(nums[i]);  //取出value
                value++;
                map.put(key, value); //更新map
            }
            else {
                key = nums[i];
                value = 1;
                map.put(key, value); //更新map
            }
        }
        for (Integer i : map.keySet()) { //values代表要取出value的集合，keySet()代表要取出key的集合
            if (map.get(i) == 1)
                return i;
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] array = {1,2,2,3,3};
        int num = singleNumber(array);
        System.out.println(num);
    }
}
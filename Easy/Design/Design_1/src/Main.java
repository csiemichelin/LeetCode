import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Main {

    public static class Solution {
        int[] original;

        public Solution(int[] nums) {
            original = nums;
        }

        public int[] reset() {
            return original;
        }
        public int[] shuffle() {
            int originalLength = original.length - 1;
            LinkedList<Integer> IndexList  = new LinkedList<>();
            LinkedList<Integer> resultList  = new LinkedList<>();
            //original = [1,2,3,4]
            for (int i=0; i<=originalLength; i++) {
                IndexList.add(i);
            }
            //IndexList = [0,1,2,3]
            for (int i=0; i<=originalLength; i++) {
                int random = (int) (Math.random() * ((IndexList.size()-1)-0+1)) + 0;
                resultList.add(original[IndexList.get(random)]);
                IndexList.remove(random);
            }
            int[] resultArray = new int[resultList.size()];
            for (int i=0; i<resultList.size(); i++) {
                resultArray[i] = resultList.get(i);
            }
             return resultArray;
        }
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        Solution solution = new Solution(nums);
        System.out.println(Arrays.toString(nums));
        int[] result = solution.shuffle();
        System.out.println(Arrays.toString(result));
        result = solution.reset();
        System.out.println(Arrays.toString(result));
        result = solution.shuffle();
        System.out.println(Arrays.toString(result));
    }
}
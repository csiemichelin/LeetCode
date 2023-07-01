import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static List<List<Integer>> threeSum(int[] nums) {
        //nums = [-1,0,1,2,-1,-4]
        //step1: 由小到大排序
        //nums = [-4,-1,-1,0,1,2]

        //step2: 按照順序追蹤index後面的start跟end，檢查i+start+end是不是0，若比0小則start往右移，若比0大則end往左移(因為排序過了)
        //i =       0
        //        [-4, -1, -1, 0, 1, 1]
        //start =       1                => nums[start] == nums[start+1]，則做i=start+1與start一樣的事情，所以跳過， start往右移
        //start =           2
        //end   =                    5   => -4-1+1 < 0， start往右移
        //start =              3
        //end   =                    5   => -4+0+2 < 0， start往右移
        //start =                 4
        //end   =                    5   => -4+1+2 < 0， start往右移
        //start =                    5
        //end   =                    5   => start>=end結束
        //i =           1
        //        [-4, -1, -1, 0, 1, 2]
        //start =           2
        //end   =                    5   => -1-1+2 = 0，找到0加到List = [[-1,-1,2]]，start往右，end往左
        //start =              3
        //end   =                 4      => -1+0+1 = 0，找到0加到List = [[-1,-1,2],[-1,0,1]]，start往右，end往左
        //start =                 4
        //end   =              3         => start>=end結束
        //i                 2            => 假如nums[i] == nums[i-1] = -1就跳過，因為i-1的時候做的事情，已經包含i要做的事情
        //        [-4, -1, -1, 0, 1, 2]
        //i                    3
        //        [-4, -1, -1, 0, 1, 2]
        //start =                 4
        //end   =                    5   => 0+1+2 > 0， end往左移
        //start =                 4
        //end   =                 4      => start>=end結束
        //i                       4      => 若i==len-2則不做
        //        [-4, -1, -1, 0, 1, 2]
        Arrays.sort(nums);
        List<List<Integer>> resultList = new LinkedList<>();
        int ListCount = 0;
        for (int i=0; i<=nums.length-2; i++) {
            int start = 0;
            int end = nums.length - 1;
            if (i - 1 >= 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            start = i + 1;
            while (true) {
                System.out.println("start = " + start + ", end = " + end);
                if (start >= end) {
                    break;
                }
                int total = nums[i] + nums[start] + nums[end];
                if (total < 0) {
                    start++;
                } else if (total > 0) {
                    end--;
                } else if (total == 0) {
                    resultList.add(new LinkedList<>());
                    resultList.get(ListCount).add(nums[i]);
                    resultList.get(ListCount).add(nums[start]);
                    resultList.get(ListCount).add(nums[end]);
                    System.out.println("ListCount = " + ListCount);
                    System.out.println(resultList);
                    while (true) {
                        //System.out.println(start);
                        if (start+1 == nums.length-1 || nums[start] != nums[start + 1]) {
                            break;
                        }
                        //System.out.println("nums[i] = " + nums[i] + ", nums[start] = " + nums[start] + ", nums[end] = " + nums[end]);
                        start++;
                    }
                    while (true) {
                        if (end-1 == 0 || nums[end] != nums[end - 1]) {
                            break;
                        }
                        //System.out.println("nums[i] = " + nums[i] + ", nums[start] = " + nums[start] + ", nums[end] = " + nums[end]);
                        end--;
                    }
                    start++;
                    end--;
                    ListCount++;
                }
            }
        }
        return resultList;
    }
    public static void main(String[] args) {
        int[] nums = {0,0,0};
        List<List<Integer>> resultList = threeSum(nums);
        System.out.println(resultList);
    }
}
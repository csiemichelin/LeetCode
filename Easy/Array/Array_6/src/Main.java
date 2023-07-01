import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Main {
    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map1 = new HashMap<>(); //key&value的資料結構
        Map<Integer, Integer> map2 = new HashMap<>();
        LinkedList<Integer> resultlist = new LinkedList<>();
        int key1 = 0, key2 = 0;
        int value1 = 0, value2 = 0;
        int map1length = 0, map2length = 0;
        //建第一個map
        for (int i=0; i<nums1.length; i++) {
            if (map1.containsKey(nums1[i])) {
                key1 = nums1[i];
                value1 = map1.get(nums1[i]);
                value1++;
            }
            else {
                key1 = nums1[i];
                value1 = 1;
            }
            map1.put(key1, value1);
        }
        //建第二個map
        for (int i=0; i<nums2.length; i++) {
            if (map2.containsKey(nums2[i])) {
                key2 = nums2[i];
                value2 = map2.get(nums2[i]);
                value2++;
            }
            else {
                key2 = nums2[i];
                value2 = 1;
            }
            map2.put(key2, value2);
        }
        map1length = map1.size();
        map2length = map2.size();
        System.out.println(map1length + ", " + map2length);
        if (map1length > map2length) {
            for(Integer key : map1.keySet()) {
                if (map2.containsKey(key)) {
                    if (map1.get(key) < map2.get(key)) {
                        for(int i=0; i<map1.get(key); i++) {
                            resultlist.add(key);
                        }
                    } else {
                        for(int i=0; i<map2.get(key); i++) {
                            resultlist.add(key);
                        }
                    }
                }
            }
        }
        else {
            for(Integer key : map2.keySet()) {
                if (map1.containsKey(key)) {
                    if (map2.get(key) < map1.get(key)) {
                        for(int i=0; i<map2.get(key); i++) {
                            resultlist.add(key);
                        }
                    } else {
                        for(int i=0; i<map1.get(key); i++) {
                            resultlist.add(key);
                        }
                    }
                }
            }
        }
        int[] resultarray = new int[resultlist.size()];
        for (int i=0; i<resultlist.size(); i++) {
            resultarray[i] = resultlist.get(i);
        }
        return resultarray;
    }
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }
}
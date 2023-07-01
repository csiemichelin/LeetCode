import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        LinkedList<Integer> ArrayList = new LinkedList<>();
        for (int i=0; i<m; i++) {
            ArrayList.add(nums1[i]);
        }
        for (int i=0; i<n; i++) {
            ArrayList.add(nums2[i]);
        }
        //System.out.println(ArrayList);
        //ArrayList.removeAll(Collections.singleton(0));
        //System.out.println(ArrayList);
        Collections.sort(ArrayList);
        System.out.println(ArrayList);
        //nums1 = new int[ArrayList.size()];
        for (int i=0; i<m+n; i++) {
            nums1[i] = ArrayList.get(i);
        }
        System.out.println(Arrays.toString(nums1));
    }
    public static void main(String[] args) {
        int[] nums1 = {-1, 0, 0, 3, 3, 3, 0, 0, 0};
        int[] nums2 = {1, 2, 2};
        merge(nums1, 6, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }
}
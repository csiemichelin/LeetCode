import java.util.IllegalFormatCodePointException;

public class Main {
    public static boolean isBadVersion(int version){
        int bad = 4;
        if (version >= bad) {
           return true;
        }
        else return false;
    }
    public static int firstBadVersion(int n) {
        /*  //時間複雜度會爆
        for (int i=1; i<=n; i++) {
            if (isBadVersion(i)) {
                System.out.println(i);
                return i;
            }
        }
        return 0;
         */
        //用二元搜尋法(包含起點，不包含終點)，以排序的複雜度O(logn)
        //https://youtu.be/CMweVF2iSyQ
        //[1, 2, 3, 4, 5, ..., n]
        // T  T  T  B  B B B B B
        //這裡n+1可能會有溢位
        long start = 1, end = (long)n+1;
        int result = 0;

        while (true) {
            int mid = (int)(start + (end - start)/2);    //等價於上面，但不會溢位
            System.out.println("mid = " + mid + ", start = " + start + ", end = " + end);
            if (isBadVersion(mid) && !isBadVersion(mid-1)) {
                result = mid;
                break;
            }

            if (!isBadVersion(mid)) {   //若中間為T，代表第一個B在右半部分
                start = mid + 1;
            }
            else {
                end = mid;//中間為B，且前一個也B，則第一個B在左半部分
            }
            if (start > end)    break;
        }
        return result;
    }
    public static void main(String[] args) {
        int n = 5;
        int result = firstBadVersion(n);
        System.out.println(result);
    }
}
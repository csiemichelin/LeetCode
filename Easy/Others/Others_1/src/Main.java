public class Main {
    public static int hammingWeight(int n) {
        int count = Integer.bitCount(n);
        //System.out.println(count);
        return count;
    }
    public static void main(String[] args) {
        int n = 31;
        int count = hammingWeight(n);
        System.out.println(count);
    }
}
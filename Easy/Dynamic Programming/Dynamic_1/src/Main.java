public class Main {
    //分析:
    //n:0 -> 0
    /**********************/
    //n:1 -> 1
    //1
    /**********************/
    //n:2 -> 2
    //1,1
    //2
    /**********************/
    //n:3 -> 3
    //1,2       (從第一階上來)

    //2,1       (從第二階上來)
    //1,1,1     (從第二階上來)
    /**********************/
    //n:4 -> 5
    //1,1,2     (從第二階上來)
    //2,2       (從第二階上來)

    //1,2,1     (從第三階上來)
    //2,1,1     (從第三階上來)
    //1,1,1,1   (從第三階上來)
    /**********************/
    //得出f(n) = f(n-1) + f(n-2);
    //f(0) = 0; f(1) = 1; f(2) = 2
    public static int climbStairs(int n) {
        //費式數列:0, 1, 1, 2, 3, ...
        //此題為階梯數列:0, 1, 2, 3, 5, ...
        /*//時間複雜度很高
        if (n == 0 || n == 1 || n == 2) return n;
        int count = climbStairs(n-1) + climbStairs(n-2);
        return count;
         */
        if (n == 0 || n == 1 || n == 2) return n;
        int[] result = new int[n];
        result[0] = 1;
        result[1] = 2;
        for (int i=3; i<=n; i++) {
            result[i-1] = result[i-2] + result[i-3];
        }
        return result[n-1];


    }
    public static void main(String[] args) {
        int result = climbStairs(45);
        System.out.println(result);
    }
}
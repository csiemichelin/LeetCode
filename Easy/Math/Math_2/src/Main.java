import java.util.LinkedList;

public class Main {
    public static int countPrimes(int n) {
        /*  //時間複雜度太高了，複雜度為n^2
        int PrimeCount = 0;
        if (n == 0 || n == 1 || n == 2)   return 0;
        for (int i=2; i<n; i++) {
            int count = 0;
            for (int j=1; j<=i; j++) {
                if (i % j == 0) {
                    //System.out.println("i = " + i + ", j = " + j);
                    count++;
                }
                if (count > 2)  {
                    //System.out.println(i);
                    break;
                }
            }
            if (count == 2) {
                //System.out.println("i = " + i);
                PrimeCount++;
            }
        }
        //System.out.println(PrimeCount);
        return PrimeCount;
         */
        //若n不是質數，n=a*b，a<=b => a<=sqrt(n) //a最大值為n的開根號，這樣b也為sqrt(n)，但這樣時間複雜度為n^1.5，其實也沒用
        //利用埃拉托斯特尼篩法，質數或普通數的倍數一定不是質數，所以把某數的倍數都刪除，時間複雜度為nloglogn
        if (n == 0 || n == 1 || n == 2)   return 0;
        int PrimeCount = 0;
        boolean[] checkPrimeArry = new boolean[n];
        for (int i=0; i<n; i++) {
            checkPrimeArry[i] = true;
        }

        checkPrimeArry[0] = false;  //不是prime
        checkPrimeArry[1] = false;  //不是prime
        for (int i=2; i<n; i++) {
            if (checkPrimeArry[i] == false) continue;
            for (int j=2; i*j<n; j++) {
                checkPrimeArry[i * j] = false;
            }
            //System.out.println(checkPrimeArry[i]);
        }

        for (int i=0; i<n; i++) {
            if (checkPrimeArry[i] == true) {
                PrimeCount++;
            }
        }
        return PrimeCount;
    }
    public static void main(String[] args) {
        int number = 4999996;
        int result = countPrimes(number);
        System.out.println(result);
    }
}
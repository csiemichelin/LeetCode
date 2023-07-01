import java.math.BigInteger;
import java.util.Arrays;
import java.lang.Math;
import java.util.LinkedList;

//此題很擊敗不能用BigInteger(不是java.util)，lonf也會放不下，只能透過陣列的方式
//此題很擊敗不能用BigInteger(不是java.util)，lonf也會放不下，只能透過陣列的方式
//此題很擊敗不能用BigInteger(不是java.util)，lonf也會放不下，只能透過陣列的方式
//此題很擊敗不能用BigInteger(不是java.util)，lonf也會放不下，只能透過陣列的方式
//此題很擊敗不能用BigInteger(不是java.util)，lonf也會放不下，只能透過陣列的方式
public class Main {
    /*
    public static int[] plusOne(int[] digits) {
        int ten_digit = 0;
        BigInteger total_num = BigInteger.valueOf(0);  //轉成int會溢位
        BigInteger num = BigInteger.valueOf(0);
        LinkedList<Integer> resultlist = new LinkedList<>();
        for (int i=0; i<digits.length; i++) {
            ten_digit = (digits.length - 1) - i;    //幾位數所以不用BigInteger去存
            //total_num = total_num + digits[i] * (long)Math.pow(10, ten_digit);
            total_num = total_num.add(BigInteger.valueOf(digits[i]).multiply(BigInteger.TEN.pow((ten_digit))));
        }
        total_num = total_num.add(BigInteger.ONE);    //加一
        num = total_num;
        BigInteger tmp = BigInteger.valueOf(0);
        //long digitsnum = (int)Math.log10(total_num)+1;
        int digitsnum = total_num.toString().length();  //先轉string求幾位數
        //System.out.println((int)Math.log10(total_num)+1);
        for (int i=0; i<digitsnum; i++) {
            ten_digit = (digitsnum - 1) - i;
            //num = (num - (tmp * (long)Math.pow(10, digitsnum - i)));
            num = num.subtract(tmp.multiply(BigInteger.TEN.pow(digitsnum-i)));
            //tmp = num / (long)Math.pow(10, ten_digit);
            tmp = num.divide(BigInteger.TEN.pow(ten_digit));
            resultlist.add(tmp.intValue());
        }
        int[] resultarray = new int[resultlist.size()];
        for (int i=0; i< resultlist.size(); i++) {
            resultarray[i] = resultlist.get(i);
        }
        return resultarray;
    }
     */
    public static int[] plusOne(int[] digits) {
        LinkedList<Integer> resultList = new LinkedList<>();
        for (int i=digits.length-1; i>=0; i--) {
            if (digits[i] >= 0 && digits[i] <= 8) {
                digits[i]++;
                return digits;
            }
            //這裡是尾數必為9的
            digits[i] = 0;
        }
        //執行到這裡代表所有位數都為9，所以長度會加一，首位填1
        for (int i=0; i<digits.length; i++) {
            resultList.add(digits[i]);
        }
        resultList.addFirst(1);
        int[] resultArray = new int[resultList.size()];
        for (int i=0; i<resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }
        return resultArray;
    }
    public static void main(String[] args) {
        int[] nums = {9,8,7,6,5,4,3,2,1,0};
        System.out.println(Arrays.toString(plusOne(nums)));
    }
}
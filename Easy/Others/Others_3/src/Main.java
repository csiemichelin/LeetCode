import javax.print.DocFlavor;
import java.util.*;

public class Main {
    public static String DecToBinary32(int num) {
        int division = num;
        String result = new String();
        while (true) {
            result = String.valueOf(division % 2) + result;
            division = division / 2;
            if (division == 0)  break;
        }
        //System.out.println(result);
        int MAXLength = 32 - result.length();
        for (int i=0; i<MAXLength; i++) {
            result = "0" + result;
        }
        return result;
    }
    public static int reverseBits(int n) {
        return Integer.reverse(n);    //這樣就對了
        /*
        String binary = DecToBinary32(n);
        System.out.println(binary);
        String reversString = new String();
        for (int i=0; i<binary.length(); i++) {
            reversString = binary.charAt(i) + reversString;
        }
        System.out.println(reversString);
        //int decimal = Integer.parseInt(reversString, 2);
        //System.out.println(decimal);
        int result = 0;
        for (int i=reversString.length()-1; i>=0; i--) {
            result = result + Integer.valueOf(reversString.charAt(i)) * (int)Math.pow(2, reversString.length()-1-i);
            System.out.println("charAt(i)) = " + reversString.charAt(i) + ", Pow = " + String.valueOf(reversString.length()-1-i));
        }
        return result;
         */
    }
    public static void main(String[] args) {
        int number = 123;
        //reverseBits(number);
        int result = reverseBits(number);
        System.out.println(result);

    }
}
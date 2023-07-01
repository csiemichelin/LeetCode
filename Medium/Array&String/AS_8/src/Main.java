import javax.print.DocFlavor;

public class Main {
    public static String countAndSay(int n) {
        //1. 1      (一個1)
        //2. 11     (兩個1)
        //3. 21     (一個2一個1)
        //4. 1211   (一個1一個2兩個1)
        //5. 111221
        String result = "1";
        if (n == 1) return result;
        for (int i=1; i<n; i++) {   //執行次數
            System.out.println(result);
            String temp = new String();
            for (int j=0; j<result.length(); j++) {
                System.out.println("original result = " + result);
                System.out.println("j  = " + j + ", LEN = " + result.length());
                char target = result.charAt(j);
                int count = 0;

                while (true) {  //找重複的個數加到string
                    if (result.charAt(j) == target) {
                        count++;
                        j++;
                    }
                    if (j == result.length() || result.charAt(j) != target) {
                        j--;
                        break;
                    }
                }
                temp = temp + String.valueOf(count);
                temp = temp + String.valueOf(target);
                System.out.println("count = " + count + ", j = " + j + ", temp = " + temp);
            }
            result = temp;
            System.out.println("result = " + result);
        }
        //System.out.println(result);
        return result;
    }
    public static void main(String[] args) {
        int n = 4;
        String result = countAndSay(n);
        //System.out.println(result);
    }
}
public class Main {
    //輸入雖然是int但反轉後可能會超出int的大小
    public static int reverse(int x) {
        String xString = Integer.toString(x);
        String resultString = "";
        long result = 0;
        if (xString.startsWith("-")) {
            resultString = resultString + "-";
            for (int i=xString.length()-1; i>=1; i--) {
                resultString = resultString + xString.charAt(i);
            }
        }
        else {
            int[] resultArray = new int[xString.length()];
            for (int i=xString.length()-1; i>=0; i--) {
                resultString = resultString + xString.charAt(i);
            }
        }
        //System.out.println(resultString.compareTo(IntMAXString));
        result = Long.parseLong(resultString);
        if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
            result = 0;
        }
        return (int)result;
    }
    public static void main(String[] args) {
        int x = 123;
        int result = reverse(x);
        System.out.println(result);
    }
}
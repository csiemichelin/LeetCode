public class Main {
    public static boolean isPowerOfThree(int n) {
        int number = n;
        if (n == 1 ) return true;
        else if (n == 0) {
            return false;
        }
        while (true) {
            if (number %3 != 0) {
                return false;
            }
            else {
                number = number / 3;
                if (number == 1) {
                    return true;
                }
            }
        }
    }
    public static void main(String[] args) {
        int n =0;
        Boolean bool = isPowerOfThree(n);
        System.out.println(bool);
    }
}
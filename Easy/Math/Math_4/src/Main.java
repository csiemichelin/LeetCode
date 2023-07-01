public class Main {
    public static int transferToInt(char c) {
        int integer = 0;
        if (c == 'I') {
            integer = 1;
        } else if (c == 'V') {
            integer = 5;
        } else if (c == 'X') {
            integer = 10;
        } else if (c == 'L') {
            integer = 50;
        } else if (c == 'C') {
            integer = 100;
        } else if (c == 'D') {
            integer = 500;
        } else if (c == 'M') {
            integer = 1000;
        }
        return integer;
    }
    public static int romanToInt(String s) {
        //羅馬數字case1:左小又大，則減法，EX:IV=4  兩個一組 ; case2:右小左大，則加法，加一個，一個一組
        int result = 0;
        int i = 0;
        while (true){
            //System.out.println("i = " + i);
            //System.out.println("s.charAt(i) = " + s.charAt(i) + " = transferToInt(s.charAt(i)) = " + transferToInt(s.charAt(i)) + ", s.charAt(i+1) = " + s.charAt(i+1) + " = transferToInt(s.charAt(i+1)) = " + transferToInt(s.charAt(i+1)));
            if (i == s.length()-1) {
                result = result + transferToInt(s.charAt(i));
                break;
            }
            if (transferToInt(s.charAt(i)) >= transferToInt(s.charAt(i+1))) {
                result = result + transferToInt(s.charAt(i));
                //System.out.println("result = " + result);
                i = i + 1;
            }
            else {
                int current = transferToInt(s.charAt(i));
                int next = transferToInt(s.charAt(i+1));
                result = result + (next - current);
                //System.out.println("result = " + result);
                i = i + 2;
            }

            if (i == s.length()) break;
        }
        return result;
    }
    public static void main(String[] args) {
        String s = "III";
        int number = romanToInt(s);
        System.out.println(number);
    }
}
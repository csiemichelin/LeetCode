public class Main {
    public static String DecToBinary(int number) {
        int division = number;
        String binary = new String();
        while (true) {
            binary = String.valueOf(division % 2) + binary;
            division = division / 2;
            if (division == 0) {
                break;
            }
        }
        return binary;
    }
    public static int hammingDistance(int x, int y) {
        //Hamming Distance為 不同位元的數量
        String xBinary = DecToBinary(x);
        String yBinary = DecToBinary(y);
        System.out.println("xBinary = " + xBinary);
        System.out.println("yBinary = " + yBinary);
        int MAXLength = Math.max(xBinary.length(), yBinary.length());
        //System.out.println(MAXLength);
        if (xBinary.length() < MAXLength) {
            int size = MAXLength - xBinary.length();
            //System.out.println(size);
            for (int i=0; i<size; i++) {
                xBinary = "0" + xBinary;
                //System.out.println("X = " + xBinary);
            }
        } else if (yBinary.length() < MAXLength) {
            int size = MAXLength - yBinary.length();
            for (int i=0; i<size; i++) {
                yBinary = "0" + yBinary;
            }
        }
        System.out.println("new xBinary = " + xBinary);
        System.out.println("new yBinary = " + yBinary);
        int count = 0;
        for (int i=0; i<MAXLength; i++) {
            if (xBinary.charAt(i) != yBinary.charAt(i)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int x = 3;
        int y = 1;
        int result = hammingDistance(x, y);
        System.out.println(result);
    }
}
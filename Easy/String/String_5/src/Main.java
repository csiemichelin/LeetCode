public class Main {
    public static boolean isPalindrome(String s) {
        String uniformString = s.toLowerCase();
        uniformString = uniformString.replaceAll("[^a-zA-Z0-9]", "");
        //System.out.println(uniformString);
        boolean result = true;
        if (uniformString.length() == 0) {
            return true;
        }
        if (uniformString.length() % 2 == 0) {
            for (int i=0; i<(uniformString.length()/2); i++) {
                if (uniformString.charAt(i) != uniformString.charAt(uniformString.length()-1-i)) {
                    result = false;
                }
            }
        } else if (uniformString.length() % 2 == 1) {
            for (int i=0; i<(uniformString.length()-1)/2; i++) {
                if (uniformString.charAt(i) != uniformString.charAt(uniformString.length()-1-i)) {
                    result = false;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String s = "0P";
        //isPalindrome(s);
        Boolean bool = isPalindrome(s);
        System.out.println(bool);
    }
}
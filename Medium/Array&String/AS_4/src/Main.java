public class Main {
    public static int lengthOfLongestSubstring(String s) {
        String oldString = new String();
        String resultString = new String();
        if (s.length() == 0)    return 0;
        if (s.length() == 1)    return 1;
        for (int i=0; i<s.length(); i++) {
            oldString = String.valueOf(s.charAt(i));
            for (int j =i+1; j<s.length(); j++) {
                if (!oldString.contains(String.valueOf(s.charAt(j)))) {
                    oldString = oldString + s.charAt(j);
                    //System.out.println("oldString = " + oldString + ", s.charAt(j) = " + String.valueOf(s.charAt(j)));
                }
                else if (oldString.contains(String.valueOf(s.charAt(j)))){
                    //System.out.println("resultString = " + resultString + ", oldString = " + oldString);
                    if (oldString.length() > resultString.length()) {
                        resultString = oldString;
                    }
                    break;
                }
                if (j == s.length()-1) {
                    if (oldString.length() > resultString.length()) {
                        resultString = oldString;
                    }
                }
            }
        }
        System.out.println(resultString);
        return resultString.length();
    }
    public static void main(String[] args) {
        String s = "au";
        int result = lengthOfLongestSubstring(s);
        System.out.println(result);
    }
}
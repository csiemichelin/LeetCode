public class Main {
    //Longest Common Prefix 最長共同前綴，因為是前綴所以他一定是從第一個位置的字串開始比較
    public static String longestCommonPrefix(String[] strs) {
        int smallLength = strs[0].length();
        String resultString = "";
        for (int i=0; i<strs.length; i++) {
            if (strs[i].length() < smallLength) {
                smallLength = strs[i].length();
            }
        }
        for (int i=0; i<smallLength; i++) {
            int target = strs[0].charAt(i);
            boolean check = true;
            for (int j=1; j<strs.length; j++) {
                if (strs[j].charAt(i) != target) {
                    check = false;
                }
            }
            if (check == true) {
                resultString = resultString + String.valueOf(strs[0].charAt(i));
            }
            else break;
        }
        return resultString;
    }
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        String resultString = longestCommonPrefix(strs);
        System.out.println(resultString);
    }
}
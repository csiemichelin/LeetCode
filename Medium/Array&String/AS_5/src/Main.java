public class Main {
    public static String longestPalindrome(String s) {
        //DP題很難，參考:https://youtu.be/ZnzvU03HtYk
        //先填表
        String result = new String();
        boolean[][] dp = new boolean[s.length()][s.length()];
        //i:行,j:列
        //j = 0, i = 0
        //j = 1, i = 0,1
        //j = 2, i = 0,1,2
        if (s.length() <= 1) return s;
        for (int j=0; j<s.length(); j++) {
            for (int i=0; i<=j; i++) {
                if (i == j) {
                    dp[i][j] = true;
                    if (i + 1 < s.length()) {
                        dp[i+1][j] = true;
                    }
                    if (s.substring(i, j+1).length() > result.length()) {
                        result = s.substring(i, j+1);
                    }
                    continue;
                }
                if (s.charAt(i) != s.charAt(j)) {
                    dp[i][j] = false;
                } else if (s.charAt(i) == s.charAt(j)) {
                    if (dp[i+1][j-1] != false) {
                        dp[i][j] = true;
                        if (s.substring(i, j+1).length() > result.length()) {
                            result = s.substring(i, j+1);
                        }
                    }
                    else {
                        dp[i][j] = false;
                    }
                }
                System.out.print( dp[i][j] + " ");
            }
            System.out.print("\n");
        }
        return result;
    }
    public static void main(String[] args) {
        String s = "cbbd";
        String result = longestPalindrome(s);
        System.out.println(result);
    }
}
public class Main {
    public static int  myAtoi(String s) {
        String uniformString = s.replaceAll("^[ ]*","");    //將開頭多個空白轉為空字串
        if (!uniformString.matches("^[0-9+-].*"))   return 0;
        //String uniformString = s.replaceAll("^[ ]*","");
        uniformString = uniformString.replaceAll("^[^0-9+-]*","");   ////將開頭為數字和正負號開頭的子字串轉為空字串
        if (uniformString.matches("^[+]+[-]+.*")) {    //開頭為一個以上的正和負字串組成
            return 0;
        } else if (uniformString.matches("^[-]+[+]+.*")) {
            return 0;
        } else if (uniformString.equals("")) {
            return 0;
        }
        System.out.println(uniformString);

        String resultString = "";
        if (uniformString.charAt(0) == '-') {
            resultString = "-";
            for (int i=1; i<uniformString.length(); i++) {
                if ((int)uniformString.charAt(i)>=48 && (int)uniformString.charAt(i)<=57) { //字元界在0~9的ASCll
                    resultString = resultString + String.valueOf(uniformString.charAt(i));
                }
                else break; //讀到非數字的字元，後面都不讀
            }
        } else if (uniformString.charAt(0) == '+') {
            for (int i=1; i<uniformString.length(); i++) {
                if ((int)uniformString.charAt(i)>=48 && (int)uniformString.charAt(i)<=57) { //字元界在0~9的ASCll
                    resultString = resultString + String.valueOf(uniformString.charAt(i));
                }
                else break; //讀到非數字的字元，後面都不讀
            }
        } else {
            for (int i=0; i<uniformString.length(); i++) {
                if ((int)uniformString.charAt(i)>=48 && (int)uniformString.charAt(i)<=57) { //字元界在0~9的ASCll
                    resultString = resultString + String.valueOf(uniformString.charAt(i));
                }
                else break; //讀到非數字的字元，後面都不讀
            }
        }
        resultString = resultString.replaceAll("^[0]+", "") ;
        resultString = resultString.replaceAll("^-[0]+", "-") ;
        if (resultString.equals("") || resultString.equals("-"))    return 0;
        System.out.println(resultString);

        String min = String.valueOf(Integer.MIN_VALUE).replace("-", "");    //去掉負號
        String max = String.valueOf(Integer.MAX_VALUE);
        if (resultString.charAt(0) == '-') {
            if (resultString.length() > min.length()+1) {//加一是因為多一個負號x
                return  Integer.MIN_VALUE;
            } else if (resultString.length() == min.length()+1 && resultString.substring(1).compareTo(min) > 0) {
                return  Integer.MIN_VALUE;
            } else {
                int result = Integer.valueOf(resultString);
                return result;
            }
        }else {
            if (resultString.length() > max.length()) {
                return  Integer.MAX_VALUE;
            } else if (resultString.length() == max.length() && resultString.compareTo(max) > 0) {
                return  Integer.MAX_VALUE;
            } else {
                int result = Integer.valueOf(resultString);
                return result;
            }
        }
    }
    public static void main(String[] args) {
        String s = "words and 987";
        //String s = "   -42";
        //String s = "4193 with words";
        //myAtoi(s);
        int number = myAtoi(s);
        System.out.println(number);
    }
}
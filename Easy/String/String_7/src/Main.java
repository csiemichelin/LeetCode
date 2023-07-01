public class Main {
    public static int strStr(String haystack, String needle) {
        int targetIndex = -1;
        if (needle.length() <= haystack.length()) {
            for (int j=0; j<haystack.length(); j++) {
                if (needle.charAt(0) == haystack.charAt(j)) {
                    if (needle.length() == 1) return j;
                    int needleIndex = 1;
                    targetIndex = j;
                    int haystackIndex = j+1;
                    while (true) {
                        if (haystackIndex == haystack.length())   break;
                        //System.out.println("needleIndex: " + needleIndex + ", haystackIndex: " + haystackIndex);
                        if (needle.charAt(needleIndex) != haystack.charAt(haystackIndex)) {
                            break;
                        } else if (needleIndex == needle.length()-1 && needle.charAt(needleIndex) == haystack.charAt(haystackIndex)) {
                            return targetIndex;
                        }
                        needleIndex++;
                        haystackIndex++;
                    }
                }
            }
            return -1;
        }else {
            return -1;
        }

    }
    public static void main(String[] args) {
        String haystack = "mississippi";
        String needle = "issipi";
        int number = strStr(haystack, needle);
        System.out.println(number);
    }
}
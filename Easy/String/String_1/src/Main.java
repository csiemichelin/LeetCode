import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void reverseString(char[] s) {
        LinkedList<Character> StringList = new LinkedList<>();
        for (int i=s.length-1; i>=0; i--) {
            StringList.add(s[i]);
        }
        for (int i=0; i<s.length; i++) {
            s[i] = StringList.get(i);
        }
    }
    public static void main(String[] args) {
        char[] string = {'h','e','l','l','o'};
        reverseString(string);
        System.out.println(Arrays.toString(string));
    }
}
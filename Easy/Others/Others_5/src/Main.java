import java.util.IllegalFormatCodePointException;
import java.util.LinkedList;

public class Main {
    public static boolean isValid(String s) {
        LinkedList<String> stack = new LinkedList<>();
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.add(String.valueOf(s.charAt(i)));
            }
            if (s.charAt(i) == ')') {
                if (stack.size() == 0)  return false;
                if (stack.get(stack.size()-1).equals("(")) {
                    stack.remove(stack.size()-1);
                }
                else {
                    return false;
                }
            } else if (s.charAt(i) == '}') {
                if (stack.size() == 0)  return false;
                if (stack.get(stack.size()-1).equals("{")) {
                    stack.remove(stack.size()-1);
                }
                else {
                    return false;
                }
            } else if (s.charAt(i) == ']') {
                if (stack.size() == 0)  return false;
                //System.out.println("s.charAt(i) = " + s.charAt(i) + ", stack.get(stack.size()-1) = " + stack.get(stack.size()-1));
                if (stack.get(stack.size()-1).equals("[")) {
                    stack.remove(stack.size()-1);
                }
                else {
                    return false;
                }
            }
        }
        if (stack.size() == 0) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        //遇到左括號PUSH到STACK
        //遇到右括號就將對應的左括號POP出來
        //CASE1: ([) => [)不是對應的括號，所以回傳false
        //CASE2: ([{} =?{}成對的括號，所以{ POP掉
        //String s = "([)]";
        //String s = "{([])}";
        String s = "]";
        boolean bool = isValid(s);
        System.out.println(bool);
    }
}
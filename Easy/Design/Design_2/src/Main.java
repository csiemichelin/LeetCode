import java.util.LinkedList;
import java.util.Stack;

public class Main {
    public static class MinStack {
        //此題用LinkedList add時間會比stack push還要久，因位add要去找末尾
        Stack<Integer> stack = new Stack<Integer>();
        public MinStack() {
            stack.clear();  //清空
        }
        public void push(int val) {
            stack.push(val);
            //System.out.println(stack);
        }
        public void pop() {
            stack.pop();
            //System.out.println(stack);
        }
        public int top() {
            return stack.get(stack.size()-1);
        }
        public int getMin() {
            int min = stack.get(0);
            for (int i=1; i<stack.size(); i++) {
                if (stack.get(i) < min) {
                    min = stack.get(i);
                }
            }
            return min;
        }
    }
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        int result = minStack.getMin(); // return -3
        System.out.println(result);
        minStack.pop();
        result = minStack.top();    // return 0
        System.out.println(result);
        result = minStack.getMin(); // return -2
        System.out.println(result);
    }
}
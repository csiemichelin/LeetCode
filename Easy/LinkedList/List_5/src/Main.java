import java.util.Arrays;

public class Main {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val;}
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static boolean isPalindrome(ListNode head) {
        int headLength = 0;
        ListNode LengthList = head;
        while (LengthList != null) {
            headLength++;
            LengthList = LengthList.next;
        }
        int[] Array = new int[headLength];
        ListNode ArrayList = head;
        for (int i=0; i<headLength; i++) {
            Array[i] = ArrayList.val;
            ArrayList = ArrayList.next;
        }
        System.out.println(Arrays.toString(Array));
        for (int i=0; i<headLength/2; i++) {
            if (Array[i] != Array[headLength-1-i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        boolean bool = isPalindrome(head);
        System.out.println(bool);
    }
}
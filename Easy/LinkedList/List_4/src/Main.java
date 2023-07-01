import java.util.Arrays;

public class Main {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val;}
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        int length1 = 0;
        int length2 = 0;
        ListNode Length1Node = list1;
        ListNode Length2Node = list2;
        while (Length1Node != null) {
            length1++;
            Length1Node = Length1Node.next;
        }
        while (Length2Node != null) {
            length2++;
            Length2Node = Length2Node.next;
        }
        if (length1 == 0 && length2 == 0)   return null;
        int[] Array = new int[length1+length2];
        ListNode List1Node = list1;
        ListNode List2Node = list2;
        for (int i=0; i<length1; i++) {
            Array[i] = List1Node.val;
            List1Node = List1Node.next;
        }
        for (int i=length1; i<length1+length2; i++) {
            Array[i] = List2Node.val;
            List2Node = List2Node.next;
        }
        System.out.println(Arrays.toString(Array));
        Arrays.sort(Array);
        System.out.println(Arrays.toString(Array));
        ListNode result = new ListNode(Array[0]);
        ListNode start = result;    //紀錄開始點
        for (int i=1; i<length1+length2; i++) {
            result.next = new ListNode(Array[i]);
            result = result.next;
        }
        return start;
    }
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);
        ListNode result = mergeTwoLists(list1, list2);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
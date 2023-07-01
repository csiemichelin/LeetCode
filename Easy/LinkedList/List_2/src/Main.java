public class Main {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val;}
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int ListLength = 0;
        ListNode LenList = head;
        while (LenList != null) {
            ListLength++;
            LenList = LenList.next;
        }

        if (ListLength == 1) return null;

        //System.out.println(ListLength);
        int len = ListLength-n-1;
        //System.out.println(len);
        if (len >= 0) {     //刪中間或刪尾
            ListNode resultList = head;
            for (int i=0; i<len; i++) {
                resultList = resultList.next;
            }
            System.out.println(resultList.val);
            resultList.next = resultList.next.next;
        }else { //刪頭的情況
            head = head.next;
            ListNode resultList = head;
            System.out.println(resultList.val);
        }
        //head.next.val = head.next.next.val;
        //System.out.println(resultList.next.val);
        return head;    //不是回傳resultList是因為在resultList = resultList.next;已經把node指到那個位置了，所以要從頭回傳就會指錯地方
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);



        ListNode resultList = removeNthFromEnd(head, 2);

        while (resultList != null) {
            System.out.print(resultList.val + " ");
            resultList = resultList.next;
        }
    }
}
public class Main {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; this.next = next; }
    }
    public static boolean hasCycle(ListNode head) {
        //龜兔賽跑，NULL代表終點，兔子碰到龜代表有CYCLE
        ListNode rabbit = head;
        ListNode turtle = head;
        while (true) {
            if (rabbit == null || turtle == null || rabbit.next == null) {
                return false;
            }
            rabbit = rabbit.next.next;  //是烏龜的兩倍速

            turtle = turtle.next;
            if (rabbit == turtle) {
                return true;
            }else if (rabbit == null || turtle == null) {
                return false;
            }
        }
    }
    public static void main(String[] args) {
        ListNode head = null;
        //ListNode head = new ListNode(1);
        //head.next = new ListNode(2);
        //head.next.next = head.next;

        boolean bool = hasCycle(head);
        System.out.println(bool);
    }
}
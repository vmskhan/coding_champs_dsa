class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}

class Solution1 {
    public static ListNode middleNode1(ListNode head) {
        ListNode curr = head;
        int count = 0;

        while(curr != null){
            count++;
            curr = curr.next;
        }

        curr = head;
        for(int i=0; i<count/2; i++){
            curr = curr.next;
        }

        return curr;
    }

    public static ListNode middleNode2(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        ListNode rev = middleNode1(head);
        printList(rev);
    }
}

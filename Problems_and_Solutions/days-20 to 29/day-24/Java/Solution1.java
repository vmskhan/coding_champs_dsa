class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}

class Solution1{
    // Approach-1 : Count no of elements and delete mid element
    public static ListNode deleteMiddle1(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }

        ListNode curr = head;
        ListNode prev = null;
        int count = 0;
        
        while(curr != null){
            count++;
            curr = curr.next;
        }

        curr = head;
        
        for(int i=0; i < count/2; i++){
            prev = curr;
            curr = curr.next;
        }
        
        prev.next = curr.next;

        return head;
    }

    // Approach-2 : Use fast-slow pointers
    public static ListNode deleteMiddle2(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = slow.next;
        
        return head;
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

        ListNode temp = deleteMiddle1(head);
        printList(temp);
    }
}
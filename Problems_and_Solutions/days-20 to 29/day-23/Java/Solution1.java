class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}

class Solution1{
    // Approach-1 : Get count of elements and remove count-n-1 element
    public static ListNode removeNthFromEnd1(ListNode head, int n) {
        if(head == null || head.next == null){
            return null;
        }
        
        int count = 0;

        ListNode curr = head;
        while(curr != null){
            count++;
            curr = curr.next;
        }
        
        if(n == count) return head.next;

        int idx = count-n-1;
        curr = head;

        for(int i=0; i<idx; i++){
            curr = curr.next;
        }

        curr.next = curr.next.next;
        
        return head;
    }

    // Approach-2 : Use fast-slow pointers
    public static ListNode removeNthFromEnd2(ListNode head, int n) {
        if(head == null || head.next == null){
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;
        
        for(int i=0; i<n; i++){
            fast = fast.next;
        }
        
        if(fast == null) return head.next;
        
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        
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

        int n = 1;
        ListNode temp = removeNthFromEnd1(head, n);
        printList(temp);
    }
}
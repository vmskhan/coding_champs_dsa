import java.util.*;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { 
        this.val = val; 
    }
}

class Solution1 {
    public static ListNode sortList1(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ArrayList<Integer> list = new ArrayList<>();
        ListNode curr = head;
        
        while(curr != null){
            list.add(curr.val);
            curr = curr.next;
        }

        Collections.sort(list);

        curr = head;
        int i = 0;

        while(curr != null){
            curr.val = list.get(i++);
            curr = curr.next;
        }

        return head;
    }

    public static ListNode sortList2(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = null;
        
        ListNode l1 = sortList2(head);
        ListNode l2 = sortList2(slow);

        return merge(l1,l2);
    }

    public static ListNode merge(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                curr.next = l1;
                l1 = l1.next;
            }else{
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }

        if (l1 != null) curr.next = l1;
        if (l2 != null) curr.next = l2;
        
        return dummy.next;
    }

    public static void printList(ListNode head) {
        while(head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(3);

        ListNode sorted = sortList1(head);
        printList(sorted);
    }
}
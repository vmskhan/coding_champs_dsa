import java.util.*;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

class Solution1 {
    // Approach-1 : using Set
    public static boolean hasCycle1(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }

        HashSet<ListNode> set = new HashSet<>();
        ListNode curr = head;

        while(curr != null){
            if(set.contains(curr)) return true;
            set.add(curr);
            curr = curr.next;
        }

        return false;
    }
    
    // Approach-2 : Using fast-slow pointers
    public static boolean hasCycle2(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;

        System.out.println(hasCycle2(head));
    }
}

import java.util.*;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { 
        this.val = val; 
    }
}

class Solution1 {
    // Approach-1 : Using HashSet
    public static ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
        HashSet<ListNode> set = new HashSet<>();
        ListNode temp = headA;
        while(temp != null){
            set.add(temp);
            temp = temp.next;
        }
        
        temp = headB;
        while(temp != null){
            if(set.contains(temp)) return temp;
            temp = temp.next;
        }
        return null;
    }

    // Approach-2 : Using Two Pointers
    public static ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        ListNode t1 = headA;
        ListNode t2 = headB;

        while(t1 != t2){
            t1 = t1.next;
            t2 = t2.next;

            if(t1 == t2) return t1;

            if(t1 == null) t1 = headB;
            if(t2 == null) t2 = headA;
        }

        return t1;
    }

    public static void main(String[] args) {
        ListNode common = new ListNode(8);
        common.next = new ListNode(10);

        ListNode headA = new ListNode(3);
        headA.next = new ListNode(7);
        headA.next.next = common;

        ListNode headB = new ListNode(99);
        headB.next = new ListNode(1);
        headB.next.next = common;


        ListNode intersection = getIntersectionNode1(headA, headB);

        if(intersection != null){
            System.out.println(intersection.val);
        }
        else{
            System.out.println("No intersection");
        }
    }
}

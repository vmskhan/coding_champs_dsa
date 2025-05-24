import java.util.*;

class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Solution1 {
    // Approach-1 : Count no of 0's, 1's and 2's and replace in list
    public static Node segregate1(Node head) {
        Node curr = head;
        int c0 = 0, c1 = 0, c2 = 0;

        while (curr != null) {
            if (curr.data == 0) {
                c0++;
            } else if (curr.data == 1) {
                c1++;
            } else {
                c2++;
            }
            curr = curr.next;
        }

        curr = head;
        while (curr != null) {
            for (int i = 0; i < c0; i++) {
                curr.data = 0;
                curr = curr.next;
            }

            for (int i = 0; i < c1; i++) {
                curr.data = 1;
                curr = curr.next;
            }

            for (int i = 0; i < c2; i++) {
                curr.data = 2;
                curr = curr.next;
            }
        }

        return head;
    }

    // Approach-2 : Using three dummy pointers
    public static Node segregate2(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node zeroHead = new Node(-1);
        Node oneHead = new Node(-1);
        Node twoHead = new Node(-1);

        Node zero = zeroHead;
        Node one = oneHead;
        Node two = twoHead;

        Node curr = head;
        while (curr != null) {
            if (curr.data == 0) {
                zero.next = curr;
                zero = curr;
            } else if (curr.data == 1) {
                one.next = curr;
                one = curr;
            } else {
                two.next = curr;
                two = curr;
            }
            curr = curr.next;
        }

        zero.next = (oneHead.next != null) ? oneHead.next : twoHead.next;
        one.next = twoHead.next;
        two.next = null;

        return zeroHead.next;
    }

    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(1);
        head.next.next = new Node(0);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);

        head = segregate1(head);
        printList(head);
    }
}

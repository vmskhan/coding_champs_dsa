class Solution3A {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node deleteNode(Node head, int x) {
        if (head == null) {
            return null;
        }

        if (x == 1) {
            return head.next;
        }

        int count = 1;
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            if (count == x) {
                if (prev != null && prev.next != null) {
                    prev.next = prev.next.next;
                }
                break;
            }
            count++;
            prev = curr;
            curr = curr.next;
        }

        return head;
    }

    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data);
            if (curr.next != null) System.out.print(" -> ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(5);
        head.next.next = new Node(2);
        head.next.next.next = new Node(9);

        int x = 2;

        printList(head);
        head = deleteNode(head, x);
        printList(head);
    }
}

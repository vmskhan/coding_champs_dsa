class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class Solution3 {
    public static Node deleteNode(Node head, int x) {
        if (x == 1) {
            head = head.next;
            head.prev = null;
            return head;
        }

        Node curr = head;
        int count = 1;

        while (curr != null) {
            if (count == x) break;
            curr = curr.next;
            count++;
        }

        if (curr.next != null) {
            curr.next.prev = curr.prev;
        }

        curr.prev.next = curr.next;

        return head;
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
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;

        printList(head);
        head = deleteNode(head, 3);
        printList(head);
    }
}

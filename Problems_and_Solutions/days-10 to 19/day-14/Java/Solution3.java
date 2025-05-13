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
    static Node addNode(Node head, int pos, int data) {
        Node newNode = new Node(data);
        Node curr = head;

        while (pos != 0) {
            curr = curr.next;
            pos--;
        }

        newNode.next = curr.next;
        if (curr.next != null) {
            curr.next.prev = newNode;
        }
        newNode.prev = curr;
        curr.next = newNode;

        return head;
    }

    static void printList(Node head) {
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

        head = addNode(head, 1, 25);

        printList(head);
    }
}

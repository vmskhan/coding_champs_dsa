class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Solution3 {
    public static Node constructLL(int arr[]){
        Node head = new Node(arr[0]);
        Node temp = head;
        for(int i=1; i < arr.length; i++){
            Node newNode = new Node(arr[i]);
            temp.next = newNode;
            temp = newNode;
        }
        return head;
    }

    public static void printList(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        Node head = constructLL(arr);

        System.out.println("Constructed Linked List:");
        printList(head);
    }
}
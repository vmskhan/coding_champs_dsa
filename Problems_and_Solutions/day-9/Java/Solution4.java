class QueueNode {
    int data;
    QueueNode next;

    QueueNode(int data) {
        this.data = data;
        this.next = null;
    }
}
class Solution4 {
    static QueueNode front, rear;

    public static void push(int a) {
        QueueNode newNode = new QueueNode(a);
        if (front == null) {
            rear = front = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public static int pop() {
        if (front == null) return -1;
        int pop = front.data;
        front = front.next;
        return pop;
    }

    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);
        System.out.println(pop());
        System.out.println(pop());
    }
}


class Solution3 {

    int front = 0, rear = 0;
    int arr[] = new int[100005];

    void push(int x) {
        if (rear == arr.length - 1) return;
        arr[rear++] = x;
    }

    int pop() {
        if (front == rear) return -1;
        return arr[front++];
    }

    public static void main(String[] args) {
        Solution3 q = new Solution3();

        q.push(10);
        q.push(20);
        q.push(30);

        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
    }
}

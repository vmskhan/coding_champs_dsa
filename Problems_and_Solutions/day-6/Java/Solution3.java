class Solution3 {
    private int[] arr;
    private int top;

    public Solution3() {
        arr = new int[1000];
        top = -1;
    }

    public void push(int x) {
        arr[++top] = x;
    }

    public int pop() {
        if (top == -1) return -1;
        return arr[top--];
    }

    public static void main(String[] args) {
        Solution3 stack = new Solution3();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());
    }
}

import java.util.Stack;

class Solution4 {
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public Solution4() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
    
    public void push(int x) {
        stack1.push(x);
    }
    
    public int pop() {
        shiftStacks();
        return stack2.pop();
    }
    
    public int peek() {
        shiftStacks();
        return stack2.peek();
    }
    
    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public void shiftStacks() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
    }

    public static void main(String[] args) {
        Solution4 q = new Solution4();
        q.push(10);
        q.push(20);
        System.out.println(q.peek());
        System.out.println(q.pop());
        System.out.println(q.empty());
    }
}

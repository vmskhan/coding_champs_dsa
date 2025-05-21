import java.util.Stack;

class Solution4 {
    Stack<Integer> st;
    Stack<Integer> min;
    public Solution4() {
        st = new Stack<>();
        min = new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        if(min.isEmpty() || val <= min.peek()){
            min.push(val);
        }
    }
    
    public void pop() {
        if(st.isEmpty()) return;
        int pop = st.pop();
        if(pop == min.peek()){
            min.pop();
        }
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return min.peek();
    }

    public static void main(String[] args) {
        Solution4 stack = new Solution4();
        stack.push(5);
        stack.push(3);
        stack.push(2);
        System.out.println(stack.getMin());
        stack.pop();
        System.out.println(stack.getMin());
        stack.pop();
        System.out.println(stack.getMin());
        System.out.println(stack.top());
    }
}

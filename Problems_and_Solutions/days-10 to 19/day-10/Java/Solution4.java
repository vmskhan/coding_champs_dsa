import java.util.LinkedList;
import java.util.Queue;

class Solution4 {

    private Queue<Integer> queue;

    public Solution4() {
        queue = new LinkedList<>();
    }

    public void push(int x) {
        queue.add(x);
        for(int i=1; i<queue.size(); i++){
            queue.add(queue.remove());
        }
    }

    public int pop() {
        return queue.remove();
    }

    public int top() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        Solution4 stack = new Solution4();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.pop();
        stack.pop();
        System.out.println(stack.top());
        System.out.println(stack.empty());
    }
}
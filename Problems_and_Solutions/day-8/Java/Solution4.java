class StackNode {
    int data;
    StackNode next;
    StackNode(int a) {
        data = a;
        next = null;
    }
}

class Solution4 {
    StackNode top;

    public void push(int a) {
        StackNode newNode = new StackNode(a);
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        if(top == null) return -1;
        int data = top.data;
        top = top.next;
        return data;
    }

    public static void main(String[] args) {
        Solution4 stack = new Solution4();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
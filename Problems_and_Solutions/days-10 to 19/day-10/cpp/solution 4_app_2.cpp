class MyStack {
public:
    queue<int> q;
    MyStack() {
        q=queue<int>{};
    }
    
    void push(int x) {
            int size=q.size();
            q.push(x);
            while(size>0)
            {
                q.push(q.front());
                q.pop();
                size--;
            }
                
        }
    
    int pop() {
        int temp=0;
        temp=q.front();
        q.pop();
        return temp;
    }
    
    int top() {
        return q.front();
    }
    
    bool empty() {
     return q.empty();
    }
};

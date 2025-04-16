class MyStack {
public:
    queue<int> q1;
     queue<int> q2;
    MyStack() {
        q1=queue<int>{};
        q2=queue<int>{};
    }
    
    void push(int x) {
        int temp=0;
        if(q1.empty())
        {
            q1.push(x);
            while(!q2.empty())
            {
                temp=q2.front();
                q2.pop();
                q1.push(temp);
            }
                
        }
        else
        {
            q2.push(x);
            while(!q1.empty())
            {
                temp=q1.front();
                q1.pop();
                q2.push(temp);
            }
                
        }
        
    }
    
    int pop() {
        int temp=0;
        if(q1.empty())
        {
            temp=q2.front();
            q2.pop();
        }
        else
        {
            temp=q1.front();
            q1.pop();
        }
        return temp;
    }
    
    int top() {
        if(q1.empty())
            return q2.front();
        else
            return q1.front();
    }
    
    bool empty() {
     return q1.empty() && q2.empty();   
    }
};

class MyStack {
  private:
    StackNode *top;

  public:
    void push(int x) {
        // code here
        if(top==NULL)
            top=new StackNode(x);
        else{
            StackNode* newNode=new StackNode(x);
            newNode->next=top;
            top=newNode;
        }
    }

    int pop() {
        // code here
        if(top==NULL)
            return -1;
        else{
            int element=top->data;
            StackNode* temp=top;
            top=top->next;
            delete temp;
            return element;
        }
    }

    MyStack() { top = NULL; }
};

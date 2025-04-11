//Function to push an element into the queue.
void MyQueue:: push(int x)
{
        // Your Code
        QueueNode* cur=new QueueNode(x);
        if(front==NULL)
            front=rear=cur;
        else
        {
            rear->next=cur;
            rear=cur;
        }
}

//Function to pop front element from the queue.
int MyQueue :: pop()
{
        // Your Code 
        if(front==NULL)
            return -1;
        else
        {
            QueueNode* temp=front;
            front=front->next;
            int element=temp->data;
            delete temp;
            if(front==NULL)
                rear=NULL;
            return element;
        }
}

class Solution {
  public:
    Node *insertAtEnd(Node *head, int x) {
        // Code here
        Node* prev=head;
        Node* cur=new Node(x);
        if(prev==NULL)
        {
            head=cur;
        }
        else{
            while(prev->next!=NULL)
                prev=prev->next;
            prev->next=cur;
        }
        
        return head;
    }
};

class Solution {
  public:
    // Function to delete a node at given position.
    Node* deleteNode(Node* head, int x) {
        // Your code here
        
        if(x==1)
        {
            head=head->next;
            delete head->prev;
            head->prev=NULL;
        }
        else{
            Node* trav=head;
            while(x!=1){
                trav=trav->next;
                x--;
            }
            if(trav->next!=NULL)
                trav->next->prev=trav->prev;
            trav->prev->next=trav->next;
            delete trav;
        }
        return head;
    }
};
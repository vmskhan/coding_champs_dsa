class Solution {
  public:
    /* Function to delete a node from a linked list */
    Node* deleteNode(Node* head, int x) {
        // cdoe here
        
        Node* trav=head;
        Node* tempNode=head;
        if(x==1)
            head=head->next;
        else
        {
            while(x-1!=1)
            {
                trav=trav->next;
                x--;
            }
            tempNode=trav->next;
            trav->next=trav->next->next;
        }
        delete tempNode;
        return head;
    }
};
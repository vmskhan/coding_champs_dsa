class Solution {
  public:
    // Function to insert a new node at given position in doubly linked list.
    Node *addNode(Node *head, int pos, int data) {
        // code here
        Node* newNode=new Node(data);
        Node* trav=head;
        while(pos!=0)
        {
            trav=trav->next;
            pos--;
        }
        newNode->next=trav->next;
        if(trav->next!=NULL)
            trav->next->prev=newNode;
        newNode->prev=trav;
        trav->next=newNode;
        return head;
    }
};
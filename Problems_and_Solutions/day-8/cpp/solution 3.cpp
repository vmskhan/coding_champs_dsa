class Solution {
  public:
    Node* constructLL(vector<int>& arr) {
        // code here
        Node* head=NULL;
        Node* prev=NULL;
        Node* cur=NULL;
        for(int i:arr)
        {
            cur=new Node(i);
            if(prev!=NULL)
                prev->next=cur;
            if(head==NULL)
                head=cur;
            prev=cur;
        }
        return head;
    }
};

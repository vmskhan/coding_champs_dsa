
class Solution {
  public:
    Node* constructDLL(vector<int>& arr) {
        // code here
        Node* head=new Node(arr[0]);
        Node* trav=head;
        for(int i=1;i<arr.size();i++)
        {
            trav->next=new Node(arr[i]);
            trav->next->prev=trav;
            trav=trav->next;
        }
        return head;
    }
};

class Solution {
  public:
    // Function to count nodes of a linked list.
    int getCount(struct Node* head) {

        // Code here
        int count=1;
        while(head->next!=NULL)
        {
            count++;
            head=head->next;
        }
        return count;
    }
};

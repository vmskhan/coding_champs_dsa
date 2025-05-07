class Solution {
public:
    void deleteNode(ListNode* node) {
        ListNode* prev=node;
        while(node->next!=NULL)
        {
            prev=node;
            node=node->next;
            prev->val=node->val;
        }
        prev->next=NULL;
    }
};
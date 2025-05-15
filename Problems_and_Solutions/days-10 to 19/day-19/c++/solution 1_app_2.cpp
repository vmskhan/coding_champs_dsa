//NOTE: Not to be used in production as 
//next pointer of the nodes are changed in original list 

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    bool hasCycle(ListNode *head) {
        ListNode* temp=head;
        ListNode* prev=head;
        while(temp!=NULL)
        {
            if(temp->next==head)
                return true;
            temp=temp->next;
            prev->next=head;
            prev=temp;
        }      
        return false;
        
    }
};
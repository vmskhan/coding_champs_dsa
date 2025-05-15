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
        ListNode* slowPtr=head;
        int count=0;
        while(head!=NULL)
        {
            count++;
            head=head->next;
            if(head==slowPtr)
                return true;
            if(count%2==0)
                slowPtr=slowPtr->next;
        }      
        return false;

    }
};
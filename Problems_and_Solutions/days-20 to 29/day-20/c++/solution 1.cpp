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
    ListNode *detectCycle(ListNode *head) {
        set<ListNode*> addr={};
        while(head!=NULL)
        {
            if(addr.contains(head))
                return head;
            else
                addr.insert(head);
            head=head->next;
        }      
        return NULL;
    }
};
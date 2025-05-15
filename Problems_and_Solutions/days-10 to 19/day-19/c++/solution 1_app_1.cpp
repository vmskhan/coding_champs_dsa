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
        set<ListNode*> addr={};
        while(head!=NULL)
        {
            if(addr.contains(head))
                return true;
            else
                addr.insert(head);
            head=head->next;
        }      
        return false;
    }
};
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* middleNode(ListNode* head) {
        ListNode* slowPointer=head;
        ListNode* fastPointer=head;
        int count=1;
        while(fastPointer!=NULL)
        {
            fastPointer=fastPointer->next;
            if(++count&1)
                slowPointer=slowPointer->next;
        }
        return slowPointer;
    }
};
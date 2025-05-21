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
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        ListNode* temp=new ListNode(-1);
        temp->next=head;
        ListNode* slowPointer=temp;
        ListNode* fastPointer=head;
        int count=0;
        while(fastPointer!=NULL)
        {
            fastPointer=fastPointer->next;
            if(++count>n)
                slowPointer=slowPointer->next;
        }
        if(slowPointer!=NULL && slowPointer->next!=NULL)
        {
            if(slowPointer->next==head)
                head=head->next;
            slowPointer->next=slowPointer->next->next;
        }
        return head;
    }
};
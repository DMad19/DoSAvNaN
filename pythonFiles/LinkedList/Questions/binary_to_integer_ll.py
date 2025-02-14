# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def getDecimalValue(self, head):
        cur = head
        ans = 0
        while(cur):
            ans = 2 * ans + (cur.val)
            cur = cur.next
        return ans
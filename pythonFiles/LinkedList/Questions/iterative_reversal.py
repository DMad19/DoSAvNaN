# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
        
class Solution:
    def reverseList(self, head):
        prev = None
        cur = head
        nextN = None
        if head and head.next:
            nextN = head.next
        while(cur):
            cur.next = prev
            prev = cur
            cur = nextN
            if nextN:
                nextN = nextN.next
        return prev